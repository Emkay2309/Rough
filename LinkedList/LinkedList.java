package LinkedList;

import java.util.ArrayList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        //step1 = create new Node
        Node newNode = new Node(data);
        size++;

        if(head==null) {
            head = tail = newNode;
            return;
        }
        //step2=new node next assign as head
        newNode.next  = head;
        //step3 = newNode assigned as head
        head = newNode;
    }
    public  int removeFirst() {
        if(size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1) {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    public void addLast(int data) {
        //step1 = create new Node
        Node newNode = new Node(data);
        size++;

        if(head==null) {
            head = tail = newNode;
            return;
        }
        //step2=new node next assign as head
        tail.next  = newNode;
        //step3 = newNode assigned as head
        tail = newNode;
    }
    public int removeLast() {
        if(size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1) {
            int val = head.data;
            head = tail = null;
            size = 0 ;
            return val;
        }
        //prev : i = size-2;
        Node prev = head;
        for(int i=0 ; i<size-2 ; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void addAtIndex(int data, int index) {
        if(index==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int currIndex = 0;
        while(currIndex < index-1) {
            temp = temp.next;
            currIndex++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int SearchKey(int key) {
        Node temp = head;
        int count = 0;

        while(temp!=null) {
            if(temp.data==key) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }
    public int SearchKeyRecursive(Node head,int key,int count) {
        Node temp = head;
        //base case
        if(temp == null) {
            return -1;
        }
        if(temp.data==key) {
            return count;
        }
        return SearchKeyRecursive(temp.next,key,count+1);
    }
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static  void removeNthNode(int B) {
        Node temp = head;
        int counter = 1;
        while(counter < B) {
            temp = temp.next;
            counter++;
        }
        temp.next = temp.next.next;
    }
    public static void removeNthNodeFromLast(int B) {
        Node temp = head;
        //calculate size of LL
        int size=0;
        while(temp!=null) {
            temp = temp.next;
            size++;
        }
        temp = head;
        if(size == B) {
            temp = temp.next;
            return;
        }

        //size-B
        int i = 1;
        int iToFind = size - B;
        Node prev = head;
        while(i<iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static Node FindMid (Node head) {
        //find mid using slow fast approach
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }
    public static Boolean checkPalindrome () {
        if(head == null || head.next != null) {
            return true;
        }
        //step 1 : find mid
        Node mid = FindMid(head);

        //step 2 : revrese 2nd half
        Node curr = mid;
        Node prev = null;
        Node nextNode ;

        while(curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        Node right = prev;
        Node left = head;

        //step 3 : check palindrome

        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);

        ll.addLast(3);
        ll.addLast(4);

        ll.print();

        addAtIndex(2,2);
        ll.print();

        System.out.println(size);

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println(ll.SearchKey(3));

        System.out.println(ll.SearchKeyRecursive(head,3,0));

        ll.reverse();
        ll.print();

        ll.removeNthNode(2);
        ll.print();
    }
}
