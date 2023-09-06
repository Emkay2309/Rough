package Binary_Search_Trees;

import java.util.ArrayList;

public class PrintInRange {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(4);
        root.right = new TreeNode(10);
        root.right.right = new TreeNode(11);
        root.right.right.right = new TreeNode(14);

        Print( root , 5,12);
        System.out.println();
    }
    public static void Print(TreeNode root, int k1 , int k2) {
        if(root == null) return;

        if(root.val >= k1 && root.val <= k2) {
            Print(root.left , k1 , k2);
            System.out.print(root.val + " ");
            Print(root.right , k1 , k2);
        }
        else if(root.val > k2) {
            Print(root.left , k1,k2);
        }
        else {
            Print(root.right , k1 , k2);
        }
    }

}
