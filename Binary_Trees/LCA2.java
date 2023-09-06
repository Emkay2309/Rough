package Binary_Trees;

public class LCA2 {

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

        int n1 = 4;
        int n2 = 5;
        System.out.println();
        System.out.println(LCAoptimized(root,n1,n2).data);

        System.out.println("Minimum Distance : "
                + minDistance(root,4,6));
    }

    public static Node LCAoptimized(Node root, int n1, int n2) {

        if(root==null || root.data == n1 || root.data==n2) {
            return root;
        }
        Node leftlca = LCAoptimized(root.left , n1,n2);
        Node rightlca = LCAoptimized(root.right , n1,n2);

        //leftLCA = val rightLCA = null

        if(rightlca == null) {
            return leftlca;
        }
        if(leftlca == null) {
            return rightlca;
        }
        return root;
    }

    public static int minDistance(Node root, int n1, int n2) {
        Node lca = LCAoptimized(root , n1,n2);
        int dist1 = lcaDist(root,n1);
        int dist2 = lcaDist(root,n2);

        return dist1+dist2;
    }

    public static int lcaDist(Node root, int n) {
        if(root==null) {
            return -1;
        }
        if(root.data==n) {
            return 0;
        }
        int leftDistance = lcaDist(root.left,n);
        int rightDistance = lcaDist(root.right,n);

        if(leftDistance == -1 && rightDistance == -1) {
            return -1;
        }
        else if(leftDistance == -1) {
            return rightDistance+1;
        }
        else {
            return leftDistance+1;
        }
    }
}
