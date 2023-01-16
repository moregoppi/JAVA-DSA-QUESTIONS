import java.util.ArrayList;

public class roottoleafdistance {
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

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
//   ----------------------------------------------------------------------------------------------------------------------
    // Main function
    public static void findPath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);

        if(root.left == null && root.right == null){
            printPath(path);
        }

        findPath(root.left, path);

        findPath(root.right, path);
        
        path.remove(path.size()-1);
    }
  
  
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = buildBst(values[i], root);
        }

        findPath(root, new ArrayList<>());
    }
}
