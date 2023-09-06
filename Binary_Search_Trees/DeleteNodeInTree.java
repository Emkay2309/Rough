package Binary_Search_Trees;

public class DeleteNodeInTree {
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

        TreeNode check = delete(root , 3);
        inorder(check);

    }

    public static TreeNode delete( TreeNode root , int value) {
        if(root.val < value) {
            root.right = delete( root.right , value);
        }
        else if(root.val > value) {
            root.left = delete( root.left , value);
        }
        else if(root.val == value) {
            //case 1 : leaf Node
            if(root.left == null && root.right == null) {
                return null;
            }
            //case 2 : single child
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return  root.left;
            }

            //case 3 : 2 child
            TreeNode ans = findInOrderSuccessor(root.right);
            root.val = ans.val;
            root.right = delete(root.right , ans.val);
        }
        return root;
    }

    private static TreeNode findInOrderSuccessor(TreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
    private static void inorder(TreeNode root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
