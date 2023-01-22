import java.util.*;

public class merge2bst {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    // step 1 and 2: are performing here by add all bst element in one arraylist;
    public static void inOrder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }

    // step 3: here we are building balanced bst using arraylist
    public static Node buildBst(ArrayList<Integer> list, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start+end)/2;

        Node root = new Node(list.get(mid));

        root.left = buildBst(list, start, mid-1);
        root.right = buildBst(list, mid+1, end);

        return root;
    }
    // this s for checking the balanced bst is valid or not 
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(10);

        ArrayList<Integer> list = new ArrayList<>();

        inOrder(root1, list);
        inOrder(root2, list);

        Collections.sort(list);

        Node root = buildBst(list, 0, list.size()-1);

        preOrder(root);
        
        
    }
}
