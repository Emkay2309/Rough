package Binary_Trees;

public class KthAncestor {
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

        KANcestor(root,5,2);

        transform(root);
        preOrder(root);
    }
    public static int KANcestor(TreeNode root,int n , int k) {
        if(root==null) {
            return -1;
        }
        if(root.data == n) {
            return 0;
        }

        int leftDist = KANcestor(root.left,n,k);
        int rightDist = KANcestor(root.right, n, k);

        if(leftDist==-1 && rightDist==-1) {
            return -1;
        }
        int max = Math.max(leftDist,rightDist);
        if(max+1 == k) {
            System.out.println(root.data);
        }
        return max+1;
    }


    //Sum of Every Node
    public static int transform(TreeNode root) {

        if(root==null) return 0;

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft +leftChild + newRight +rightChild;
        return data;

    }

    public static void preOrder(TreeNode root) {
        if(root==null) return;
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
