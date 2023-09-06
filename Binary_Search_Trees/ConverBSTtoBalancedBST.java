package Binary_Search_Trees;


import java.util.ArrayList;

public class ConverBSTtoBalancedBST {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.right.right = new TreeNode(11);
        root.right.right.right = new TreeNode(12);

        ArrayList <Integer> ans = new ArrayList<>();
        Inorder(root , ans);
        TreeNode check = createBST(ans , 0 , ans.size()-1);
        print(check);
        System.out.println("Null");
    }

    private static void print(TreeNode root) {
        if( root == null) return;
        print(root.left);
        System.out.print(root.val +"-->");
        print(root.right);
    }

    public static void Inorder(TreeNode root , ArrayList <Integer> ans ) {
        if(root == null) {
            return;
        }
        Inorder(root.left , ans);
        ans.add(root.val);
        Inorder(root.right , ans);
    }

    public static TreeNode createBST(ArrayList<Integer> ans , int start , int end) {
        if(start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(ans.get(mid));

        root.left = createBST(ans , start , mid-1);
        root.right = createBST( ans , mid+1 , end);

        return root;
    }
}
