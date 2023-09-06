package Binary_Search_Trees;

public class BuildBST {
    public static void main(String[] args) {

        int[] values = {5, 1, 3, 4, 2, 7};
        TreeNode A = null;

        for (int i = 0; i < values.length; i++) {
            A = BuildBinarySearchTree(values[i], A);
        }
        inorder(A);
        System.out.println();
        System.out.println(searchKey(A, 7));
    }

    private static boolean searchKey(TreeNode root, int key) { //    TC : O(H)
        if(root == null) return false;

        if(root.val == key ) {
            return true;
        }

        if(root.val > key) {
            return searchKey(root.left , key);
        }
        else {
            return searchKey(root.right , key);
        }
    }

    public static TreeNode BuildBinarySearchTree(int data , TreeNode root) {
        if( root == null) {
            root = new TreeNode(data);
            return root;
        }

        //left subtree
        if(root.val > data ) {
            root.left = BuildBinarySearchTree(data , root.left);
        }
        //right subtree
        if(root.val < data) {
            root.right = BuildBinarySearchTree(data , root.right);
        }

        return root;
    }

    public static void inorder(TreeNode root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
