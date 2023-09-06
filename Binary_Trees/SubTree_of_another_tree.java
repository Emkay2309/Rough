package Binary_Trees;

import java.util.LinkedList;
import java.util.*;


public class SubTree_of_another_tree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {

        Node root = new Node (1);
        root.left = new Node (2);
        root.right = new Node(3);
        root.left.left = new Node (4);
        root.left.right = new Node(5);
        root.right.left = new Node (6);
        root.right.right = new Node(7);

        kthLevel(root,0,2);

        Node subroot = new Node (2);
        subroot.left = new Node (4);
        subroot.right = new Node(5);

        System.out.println(isSubTree(root,subroot));

        topView(root);
        System.out.println("kthLevel");


    }

    public static boolean isSubTree (Node root, Node subroot) {

        if(root==null) {
            return false;
        }
        if(root.data == subroot.data) {
            if(isIdentical(root,subroot)) {
                return true;
            }
        }
        return isSubTree(root.left , subroot) || isSubTree(root.right , subroot);
//        boolean leftAns = isSubTree(root.left , subroot);
//        boolean rightAns = isSubTree(root.right , subroot);
//
//        return leftAns || rightAns;
    }

    public static boolean isIdentical(Node t1, Node t2) {
        if(t1==null && t2==null) {
            return true;
        }
        else if(t1==null || t2==null || t1.data != t2.data) {
            return false;
        }

        if(!isIdentical(t1.left , t2.left)) {
            return false;
        }
        if(!isIdentical(t1.right , t2.right)) {
            return false;
        }

        return true;
    }

    static class Info {
        Node node;
        int hd;
        public Info(Node node , int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root) {
        //level Order
        Queue <Info> q = new LinkedList<>();
        HashMap <Integer , Node > map = new HashMap<>();

        int max = 0 , min = 0;

        q.add(new Info(root,0));
        q.add(null);

        while( !q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                if(!map.containsKey(curr.hd)) {   // first time horizontal distance is occuring
                    map.put(curr.hd , curr.node);
                }

                if(curr.node.left != null) {
                    q.add(new Info(curr.node.left , curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }
                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right , curr.hd-1));
                    max = Math.min(max,curr.hd-1);
                }
            }

            for(int i=min ; i<=max ; i++) {
                System.out.print(map.get(i).data +" ");
            }
            System.out.println();
        }
    }

    public static void kthLevel(Node root, int level, int k) {
        if(root==null) {
            return;
        }
        if(level==k) {
            System.out.print(root.data + " ");
            return;
        }
        kthLevel(root.left,level+1,k);
        kthLevel(root.right,level+1,k);
    }

}


