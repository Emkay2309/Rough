package Binary_Search_Trees;

public class Question1 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(22);

        KDistance(root);
    }
    //Find K nodes away from a given node
    public static int KDistance(TreeNode root) {
        int ans = 0;

        return -1;
    }
    //Find Diameter
    public static int diameter(TreeNode root) {
        if(root == null) return 0;

        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);

        int selfDia = height(root.left) + height(root.right);
        return Math.max(selfDia,Math.max(leftDia , rightDia));
    }
    //Find Height
    public static int height(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight , rightHeight)+1;
    }
}
