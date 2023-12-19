package PepCoding.BnaryTrees;

import java.util.Stack;

public class TreeConstructors {

    public static void main(String[] args) throws Exception{
        Integer [] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        Node root = fillTree(arr);
        display(root);
    }


    public static Node fillTree(Integer [] arr)  {
        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0] , null , null);
        Pair rootPair = new Pair(root,1);

        st.push(rootPair);

        int index = 0;

        while(st.size() > 0 )  {
            Pair top = st.peek();

            if(top.state == 1) {
                index++;
                if(arr[index] != null) {
                    Node leftNode = new Node(arr[index] , null , null);
                    top.node.left = leftNode;

                    Pair leftPair = new Pair(leftNode , 1);
                    st.push(leftPair);
                }
                else {
                    top.node.left = null;
                }
                top.state++;
            }
            else if(top.state == 2) {
                index++;
                if(arr[index] != null)  {
                    Node rightNode = new Node(arr[index] , null , null);
                    top.node.right = rightNode;

                    Pair rightPair = new Pair(rightNode , 1);
                    st.push(rightPair);
                }
                else {
                    top.node.right = null;
                }
                top.state++;
            }
            else {
                st.pop();
            }
        }
        return root;
    }
    public static  void display(Node node)  {
        if(node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "null" : node.left.val + "";
        str += "<--" + node.val + "-->";
        str += node.right == null ? "null" : node.right.val + "";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static  class Node {
        int val;
        Node left;
        Node right;
        Node(int val , Node left , Node right)  {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static class Pair {
        Node node;
        int state;
        Pair(Node node , int state) {
            this.node = node;
            this.state = state;
        }
    }

}
