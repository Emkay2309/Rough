package Binary_Trees;

import java.util.ArrayList;

public class KthLevel {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kthLevel(root, 0, 2);

        int n1 = 4;
        int n2 = 5;
        System.out.println();
        System.out.println(LCA(root,n1,n2).data);
    }

    public static void kthLevel(Node root, int level, int k) {
        if(root==null) {
            return;
        }
        if(level == k) {
            System.out.print(root.data+" ");
            return;
        }
        kthLevel(root.left,level+1,k);
        kthLevel(root.right,level+1,k);
    }

    public static Node LCA(Node root,int n1 , int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1 , path1);
        getPath(root , n2 , path2);

        //last common ancestor
        int i=0;
        for( ; i < path1.size() && i<path2.size() ; i++) {
            if(path1.get(i) != path2.get(i)) {
                break;
            }
        }

        //last equal node -> i-1 th index
        Node lca = path1.get(i-1);
        return lca;
    }

   public static boolean getPath(Node root, int n, ArrayList<Node> path) {

       if (root == null) {
           return false;
       }
       path.add(root);
       if (root.data == n) {
           return true;
       }
       boolean foundLeft = getPath(root.left, n, path);
       boolean foundRight = getPath(root.right, n, path);

       if (foundLeft || foundRight) {
           return true;
       }
       path.remove(path.size() - 1);
       return false;
   }
}
