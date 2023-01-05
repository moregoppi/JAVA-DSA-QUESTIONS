public class searchinbst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node buildBst(int val, Node root){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data < val){
            root.right = buildBst(val, root.right);
        }else{
            root.left = buildBst(val, root.left);
        }
        return root;
    }
    
    //Main Search In BST function
    public static boolean searchInBST(int found,Node root){
        if(root == null){
            return false;
        }
        if(root.data == found){
            return true;
        }
        if(root.data > found){
            return searchInBST(found, root.left);
        }
        if(root.data < found){
            return searchInBST(found, root.right);
        }

        return false;
    }
    public static void main(String[] args) {
        int val[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<val.length; i++){
            root = buildBst(val[i], root);
        }
        

        if(searchInBST(10, root)){
            System.out.println("Present in BST");
        }else{
            System.out.println("Not Present in BST");
        }
    }
}
