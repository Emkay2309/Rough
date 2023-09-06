package Binary_Search_Trees;

import com.sun.source.tree.Tree;

public class MirroraBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(10);
        root.right.right = new TreeNode(11);
        root.right.right.right = new TreeNode(14);

        TreeNode ans = CreateMirror(root);
        inOrder(ans);

    }

    private static TreeNode CreateMirror(TreeNode root) {
        if(root == null) return null;

        TreeNode lefty = CreateMirror(root.left);
        TreeNode righty = CreateMirror(root.right);

        root.left = righty;
        root.right = lefty;

        return root;
    }

    public static void inOrder(TreeNode root) {
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

}
