package Binary_Trees;

import java.util.*;


public class SameSubTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(2);
        root.right.right.left = new Node(4);
        root.right.right.right = new Node(5);

        System.out.println(dupSub(root));
    }
    public static int dupSub(Node root) {
        if (root == null) return 0;
        HashMap<String, Integer> hm = new HashMap<>();
        helper(root, hm);
        for(HashMap.Entry<String, Integer> entry : hm.entrySet()) {
            if(entry.getValue() > 1) return 1;
        }
        return 0;
    }
    public static String helper(Node root, HashMap<String, Integer> hm) {
        if (root == null) return "#";

        if(root.left == null && root.right == null) return  String.valueOf(root.data);

        String leftCount = helper(root.left, hm);
        String rightCount = helper(root.right, hm);

        String subtree = root.data + ", " + leftCount + ", " + rightCount;
        hm.put(subtree, hm.getOrDefault(subtree, 0) + 1);

        return subtree;
    }
}
class Node{
    int data;
    Node left, right;

    Node(int item){
        data = item;
        left = right = null;
    }
}
