package Binary_Trees;

import java.util.ArrayList;

public class Boundary_Traversal {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ArrayList <Integer> ans1 = print(root);

        System.out.print( "Boundary Traversal : ");
        for(int i=0 ; i<ans1.size() ; i++) {
            System.out.print(ans1.get(i) +",");
        }
    }

    public static ArrayList<Integer> print(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if((root.left == null && root.right == null ) == false) {
            ans.add(root.data);
        }

        //Add left Nodes
        leftBoundary(root , ans);

        //Leaf Boundary
        leafBoundary(root , ans);

        //Add Right Nodes
        rightBoundary(root , ans);

        return ans;
    }

    //Left Boundary
    public static void leftBoundary(TreeNode root , ArrayList<Integer> ans) {
        TreeNode curr = root.left;

        while(curr != null) {
            if( (curr.left == null && curr.right == null ) == false ) {
                ans.add(curr.data);
            }
            //Traversal
            if(curr.left != null) {
                curr = curr.left;
            }
            else {
                curr = curr.right;
            }
        }
    }

    //Leaf Boundary
    private static void leafBoundary(TreeNode root, ArrayList<Integer> ans) {
        if(root.left == null && root.right == null) {
            ans.add(root.data);
            return;
        }
        leafBoundary(root.left , ans);
        leafBoundary(root.right , ans);
    }

    //Right Boundary
    private static void rightBoundary(TreeNode root, ArrayList<Integer> ans) {
        TreeNode curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();

        while(curr != null) {
            if( (curr.left == null && curr.right == null ) == false ) {
                temp.add(curr.data);
            }
            //Traversal
            if(curr.right != null) {
                curr = curr.right;
            }
            else {
                curr = curr.left;
            }
        }

        for(int i=temp.size()-1 ; i>=0 ; i--) {
            ans.add(temp.get(i));
        }
    }
}
