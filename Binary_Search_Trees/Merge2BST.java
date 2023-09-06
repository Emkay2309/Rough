package Binary_Search_Trees;

import com.sun.source.tree.Tree;

import java.util.ArrayList;

public class Merge2BST {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        //           2
        //          / \
        //         1   4

        TreeNode root2 = new TreeNode(9);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(12);
        //           9
        //          / \
        //         3   12

        ArrayList <Integer> path1 =  new ArrayList<>();
        getInorder(root1 , path1);

        ArrayList <Integer> path2 =  new ArrayList<>();
        getInorder(root2 , path2);

        ArrayList <Integer> path = merge(path1 , path2);

        TreeNode ans = createBST(path , 0 , path.size()-1);
        print(ans);

    }

    private static ArrayList<Integer> merge(ArrayList<Integer> path1, ArrayList<Integer> path2) {
        ArrayList <Integer> path = new ArrayList<>();
        int i=0;
        int j=0;

        while(i < path1.size()  && j < path2.size() ) {
            if(path1.get(i) < path2.get(j) ) {
                path.add(path1.get(i));
                i++;
            }
            else {
                path.add(path2.get(j));
                j++;
            }
        }
        while(i < path1.size() ) {
            path.add(path1.get(i));
            i++;
        }
        while(j < path2.size() ) {
            path.add(path2.get(j));
            j++;
        }
        return path;
    }

    private static void getInorder(TreeNode root, ArrayList<Integer> path) {
        if(root == null) {
            return ;
        }
        getInorder(root.left , path );
        path.add(root.val);
        getInorder(root.right , path);
    }

    public static TreeNode createBST (ArrayList<Integer> path , int start , int end) {
        if(start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(path.get(mid));
        root.left = createBST(path , start , mid-1);
        root.right = createBST(path , mid+1 , end);

        return root;
    }
    private static void print(TreeNode root) {
        if( root == null) return;
        print(root.left);
        System.out.print(root.val+"-->");
        print(root.right);
    }
}
