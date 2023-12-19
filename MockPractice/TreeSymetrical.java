package MockPractice;

import static MockPractice.TreeSymetrical.fun;

public class TreeSymetrical {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left  = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left   = new TreeNode(3);
        root.left.right  = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        TreeNode root1 = new TreeNode(1);
        root1.left  = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.right  = new TreeNode(3);
        root1.right.left = new TreeNode(3);      root1.right.right = new TreeNode(3);


        int ans = check(root);
        System.out.println(ans);

        int ans1 = check(root1);
        System.out.println(ans1);

        int ans2 = funct(root1,root1);
        System.out.println(ans2);

        int ans3 = funct(root,root);
        System.out.println(ans3);
    }

    public static int check(TreeNode root) {
        if(root == null) {
            return 1;
        }
        boolean val = fun(root , root);
        if(val == true) return 1;
        return 0;
    }
    public static int  funct(TreeNode A , TreeNode B) {
        if(A==null && B == null) {
            return 1;
        }
        if(A==null || B == null) {
            return 0;
        }
        return ((A.val==B.val) && funct(A.left , B.right) == 1 && funct(A.right , B.left) == 1 ) ? 1 : 0;
    }
    public static boolean fun(TreeNode A , TreeNode B) {
        if(A == null  &&  B == null) {
            return true;
        }
        if(A == null && B != null) {
            return false;
        }
        if(B == null && A != null) {
            return false;
        }
        return (fun(A.left , B.right) && fun(A.right , B.left) ) ? true : false;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

}
