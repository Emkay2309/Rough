package Binary_Trees;

import java.util.*;

public class EveryOrderTraversal {

    public static ArrayList<Integer> preorder = new ArrayList<>();
    public static ArrayList<Integer> inorder = new ArrayList<>();
    public static ArrayList<Integer> postorder = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        solve(root);

        System.out.print("PreOrder : ");
        print( preorder);

        System.out.print("InOrder : " );
        print(inorder);

        System.out.print("PostOrder : ");
        print(postorder);
    }

    public static void print(ArrayList<Integer> root) {
        int n = root.size();
        System.out.print("{");
        for(int i=0 ; i<n ; i++) {
            if(i==n-1) {
                System.out.print(root.get(i));
                break;
            }
            System.out.print(root.get(i)+",");
        }
        System.out.println("}");
    }
    public static void solve(TreeNode root ) {
        Stack<pair> s = new Stack<pair>();
        s.push(new pair(root , 1));

        while(!s.isEmpty()) {
            pair curr = s.pop();

            //PREORDER
            if(curr.index == 1) {
                preorder.add(curr.node.val);
                curr.index++;
                s.push(curr);
                if(curr.node.left != null) {
                    s.push(new pair(curr.node.left , 1));
                }
            }
            //INORDER
            else if(curr.index == 2) {
                inorder.add(curr.node.val);
                curr.index++;
                s.push(curr);
                if(curr.node.right != null) {
                    s.push(new pair(curr.node.right , 1));
                }
            }
            //POSTORDER
            else {
                postorder.add(curr.node.val);
            }
        }

    }
}

class pair {
    TreeNode node;
    int index;

    pair(TreeNode node , int index) {
        this.node = node;
        this.index = index;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
