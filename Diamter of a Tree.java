public class diameteroftree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }

        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int sumOfNode(Node root){
        if(root == null){
            return 0;
        }

        int ln = sumOfNode(root.left);
        int rn = sumOfNode(root.right);

        return ln + rn + root.data;
    }

    //Approach 1:-
    public static int diameteroftree(Node root){  //Tc:- o(n^2)
        if(root == null){
            return 0;
        }

        int leftdiameter  = diameteroftree(root.left);
        int lh = heightOfTree(root.left);
        int rightdiameter = diameteroftree(root.right);
        int rh = heightOfTree(root.right);

        int selfDiameter = lh + rh + 1;

        return Math.max(selfDiameter, Math.max(leftdiameter, rightdiameter));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameteroftree(root));
    }

}
