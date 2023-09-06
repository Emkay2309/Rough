package Binary_Search_Trees;

import java.util.ArrayList;

public class PrintRoot_LEAF {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(10);
        root.right.right = new TreeNode(11);
        root.right.right.right = new TreeNode(14);

        ArrayList<Integer> ans = new ArrayList<>();
        printRootToLeaf(root , ans);
    }
    public static void printRootToLeaf (TreeNode root , ArrayList<Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.val);

        if(root.left == null && root.right == null) {
            printPath(path);
        }

        printRootToLeaf(root.left , path);
        printRootToLeaf(root.right , path);
        path.remove(path.size()-1 );


    }
    public static void printPath(ArrayList<Integer> path) {
        for(int i=0 ; i<path.size() ; i++) {
            System.out.print(path.get(i)+"-->");
        }
        System.out.println("Null");
    }
}
