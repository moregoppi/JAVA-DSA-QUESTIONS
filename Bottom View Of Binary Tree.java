import java.util.*;
public class bottomviewofbinarytree {
    static class Node{
        int data;
        Node left;
        Node right;
        int hd;
        Node(int data){
            this.hd = Integer.MAX_VALUE;
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void bottomView(Node root){
        Queue<Node> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = 0, max = 0;

        q.add(root);
        int hd = 0;
        root.hd = hd;
        while(!q.isEmpty()){
            Node curr = q.remove();

            hd = curr.hd;

            map.put(curr.hd, curr.data);

            if(curr.left != null){
                curr.left.hd = hd - 1;
                q.add(curr.left);
                min = Math.min(min, curr.left.hd-1);
            }
            if(curr.right != null){
                curr.right.hd = hd + 1;
                q.add(curr.right);
                max = Math.max(max, curr.right.hd+1);
            }
        }
        
        for(int i=min+1; i<max; i++){
            System.out.print(map.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        bottomView(root);
    }
}
