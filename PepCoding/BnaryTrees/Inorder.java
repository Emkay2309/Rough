package PepCoding.BnaryTrees;

public class Inorder {
    public static void main(String[] args) {
        TreeConstructors TreeCall = new TreeConstructors();
        Integer[] arr = {50,14,60,null,null,null,null};

        TreeConstructors.Node root = TreeCall.fillTree(arr);

        TreeCall.display(root);
    }
}
