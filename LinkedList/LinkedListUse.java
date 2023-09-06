package LinkedList;

import java.util.*;

public class LinkedListUse {
    public static void main(String[] args) {

        Nodes<Integer> ans = takeInput();
        System.out.println(ans.val);
        print(ans);
    }

    public static void print(Nodes<Integer> head) {
        while(head != null) {
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }
    public static Nodes<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        Nodes<Integer> head = null;
        int data = sc.nextInt();

        while(data != -1) {
            Nodes<Integer> A = new Nodes<Integer>(data);
            if(head == null) {
                head = A;
            }
            else {
                Nodes<Integer> temp = head;
                while(temp.next != null) {
                    temp = temp.next;
                }
                temp.next = A;
            }
            data = sc.nextInt();
        }
        return head;
    }
}

class Node<T> {
    T data;
    Nodes<T> next;

    Node(T data) {
        this.data = data;
    }
}
