public class validatebst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node buildBst(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data < val){
            root.right = buildBst(root.right, val);
        }else{
            root.left = buildBst(root.left, val);
        }
        return root;
    }

    
    public static boolean checkIt(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        //this checking right subtree
        if(min != null && root.data <= min.data){
            return false;
        }
        // this checking left subtree
        else if(max != null && root.data >= max.data){
            return false;
        }

        return checkIt(root.left, min, root) 
                && checkIt(root.right, root, max);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = buildBst(root, values[i]);
        }

        if(checkIt(root, null, null)){
            System.out.println("Valid BST");
        }else{
            System.out.println("Invalid BST");
        }
    }
}
