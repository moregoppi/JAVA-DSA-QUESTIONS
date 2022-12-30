public class Main
{
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
    
    public static int maxSum(Node root){
        if(root == null){
            return 0;
        }
        
        int leftSum = maxSum(root.left);
        int rightSum = maxSum(root.right);
        
        int total = root.data + leftSum + rightSum;
        
        return Math.max(total, Math.max(leftSum, rightSum));
    }
	public static void main(String[] args) {
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(7);
		root.right.left = new Node(15);
		root.right.right = new Node(7);
		
		System.out.println(maxSum(root));
	}
}
