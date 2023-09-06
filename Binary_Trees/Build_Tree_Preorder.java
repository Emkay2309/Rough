package Binary_Trees;

import java.util.LinkedList;
import java.util.*;

import static Binary_Trees.Build_Tree_Preorder.BinaryTree.*;

public class Build_Tree_Preorder {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class BinaryTree {
        static int index = -1;
        public static Node buildTree (int nodes []) {
            index++;
            if(nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        //preorder traversal
        public void preorder (Node root) {
            if(root == null) {
                return ;
            }
            System.out.print(root.data + " --> ");
            preorder(root.left);
            preorder(root.right);
        }

        //Inorder traversal
        public void Inorder (Node root) {
            if(root == null) {
                return ;
            }
            Inorder(root.left);
            System.out.print(root.data + " --> ");
            Inorder(root.right);
        }

        //postorder traversal
        public void postorder (Node root) {
            if(root == null) {
                return ;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " --> ");
        }

        //levelorder traversal
        public static void levelorder(Node root) {
            if(root==null) {
                return ;
            }
            Queue <Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while ( !q.isEmpty()) {
                Node currNode = q.remove();

                if(currNode==null) {
                    System.out.println();

                    if(q.isEmpty()) {
                        return;
                    }
                    else {
                        q.add(null);
                    }
                }
                else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int height (Node root) {
            if(root==null){
                return 0;
            }
            int lheight = height(root.left);
            int rheight = height(root.right);
            int exact_ans = Math.max(lheight,rheight)+1;
            return exact_ans;
        }

        public static int countNode (Node root) {
            if(root==null){
                return 0;
            }
            int lcount = countNode(root.left);
            int rcount = countNode(root.right);
            return lcount+rcount+1;
        }

        public static int sumNodes (Node root) {
            if(root==null){
                return 0;
            }
            int leftSum = sumNodes(root.left);
            int rightSum = sumNodes(root.right);
            int treeSum = leftSum+rightSum+root.data;
            return treeSum;
        }

        public static int diameter (Node root) {
            if(root==null) {
                return 0;
            }
            int leftdia = diameter((root.left));
            int rightdia = diameter(root.right);
            int selfdia = height(root.left) + height(root.right) + 1;

            return Math.max(selfdia , Math.max(leftdia , rightdia));
        }

        static class Info {
            int diam;
            int ht;

            public Info(int diam , int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }
        public static Info diameterOptimized (Node root) {
            if(root==null) {
                return new Info(0,0);
            }
            Info leftInfo = diameterOptimized(root.left);
            Info rightInfo = diameterOptimized(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam) , leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

            return new Info(diam,ht);
        }


    }


    public static void main(String[] args) {                        //              1
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};         //              /  \
        BinaryTree tree = new BinaryTree();                       //              2    3
        Node root = tree.buildTree(nodes);                        //             / \    \
//        System.out.println(root.data);                                        4   5    6

        tree.preorder(root);
        System.out.println();
        tree.Inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelorder(root);
        System.out.println();
        System.out.println("Height of the tree : " + height(root));
        System.out.println("Count of the nodes in tree : " + countNode(root));
        System.out.println("Sum of the nodes in tree : " + sumNodes(root));
        System.out.println("Diameter of the tree : " + diameter(root));
        System.out.println("Diameter of the tree optimized : " + diameterOptimized(root).diam);
        System.out.println("Height of the tree optimized : " + diameterOptimized(root).ht);
    }




}
