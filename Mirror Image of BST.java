public class mirrorimageofbst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node mirrorImageOfBST(Node root){
        if(root == null){
            return null;
        }
        Node leftSubtreeMirror = mirrorImageOfBST(root.left);
        Node rightSubtreeMirror = mirrorImageOfBST(root.right);

        root.left = rightSubtreeMirror;
        root.right = leftSubtreeMirror;

        return root;
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        root.right.left = new Node(10);
        root.right.right = new Node(12);


        root = mirrorImageOfBST(root);

        preOrder(root);
    }
}
