package Binary_Search_Trees;

public class SizeOfLargestBSTinBT {

    public static int maxBST;
    public static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST , int size , int min , int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(20);
        root.right = new TreeNode(60);
        root.right.left = new TreeNode(45);
        root.right.right = new TreeNode(70);
        root.right.right.left = new TreeNode(65);
        root.right.right.right = new TreeNode(80);

        Info info = largestBST(root);
        System.out.println("Largest BST size = " + maxBST);


    }

    private static Info largestBST(TreeNode root) {
        //base case
        if(root == null) {
            return new Info(true , 0 , Integer.MAX_VALUE , Integer.MIN_VALUE);
        }

        //left subtree
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;

        int min = Math.min(root.val , Math.min(leftInfo.min, rightInfo.min));

        int max = Math.max (root.val , Math.max(leftInfo.max,  rightInfo.max));

        if( root.val <= leftInfo.max  || root.val >= rightInfo.min ) {
            return new Info(false , size , min , max);
        }

        if(leftInfo.isBST && rightInfo.isBST ) {
            maxBST = Math.max(maxBST , size);
            return new Info(true , size , min , max);
        }

        return new Info( false , size , min , max);
    }
}
