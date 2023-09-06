package Binary_Search_Trees;

public class ValidateBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.right = new TreeNode(10);
        root.right.right = new TreeNode(11);
        root.right.right.right = new TreeNode(14);

        boolean ans = isValidBST(root, null,null);
        System.out.println(ans);
    }

    private static boolean isValidBST(TreeNode root , TreeNode min , TreeNode max) {
        if(root == null) return true;

        if(min != null && root.val <= min.val) {
            return false;
        }
        else if(max != null && root.val >= max.val) {
            return false;
        }

        return isValidBST(root.left , min , root) && isValidBST(root.right , root , max);


    }
}
