// in tgis we have to find largest BST(no. of nodes present in that bst) in binary tree
public class sizeoflargestbstinbt {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBstNodes = 0;

    public static Info largestBST(Node root){
        if(root == null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
    
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;

        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));

        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        // left subtree max is always smaller than the root node and right subtree min is always greater than root node
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, size, min, max);
        }

        if(leftInfo.isBST && rightInfo.isBST){
            maxBstNodes = Math.max(maxBstNodes, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info largestBst = largestBST(root);

        System.out.println("largest BST in BT "+maxBstNodes);
    }
}
