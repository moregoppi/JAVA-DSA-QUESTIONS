// 543. Diameter of Binary Tree
// Easy
// 10.3K
// 653
// Companies
// Given the root of a binary tree, return the length of the diameter of the tree.

// The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

// The length of a path between two nodes is represented by the number of edges between them.

 

// Example 1:


// Input: root = [1,2,3,4,5]
// Output: 3
// Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
// Example 2:

// Input: root = [1,2]
// Output: 1


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int heightofTree(TreeNode root){
        if(root == null){
            return 0;
        }

        int lh = heightofTree(root.left);
        int rh = heightofTree(root.right);

        return Math.max(lh, rh) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftdiameter = diameterOfBinaryTree(root.left);
        int lh = heightofTree(root.left);
        int rightdiameter = diameterOfBinaryTree(root.right);
        int rh = heightofTree(root.right);

        int selfdiameter = lh + rh;

        return Math.max(selfdiameter, Math.max(leftdiameter, rightdiameter));
    
    }
}




// --------------------------------------------------------------------------------------------------------------------------------------------------------








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
    //Approach 2:-
    static class Info{  //T.c:- O(n) because in this we are calculating both at same at same node
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);

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
