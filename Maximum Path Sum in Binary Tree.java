// 124. Binary Tree Maximum Path Sum
// Hard
// 13.2K
// 619
// Companies
// A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

// The path sum of a path is the sum of the node's values in the path.

// Given the root of a binary tree, return the maximum path sum of any non-empty path.

 

// Example 1:


// Input: root = [1,2,3]
// Output: 6
// Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.
// Example 2:


// Input: root = [-10,9,20,null,null,15,7]
// Output: 42
// Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
 

// Approach 1: Brute Force
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






// Approach 2: Optimize Method
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
    int maxValue;
    public int maxPathDown(TreeNode node){
        if(node == null) return 0;

        int leftSum = Math.max(0, maxPathDown(node.left));
        int rightSum = Math.max(0, maxPathDown(node.right));

        maxValue = Math.max(maxValue, leftSum + rightSum + node.val);

        return Math.max(leftSum, rightSum) + node.val;
    }
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        
        maxPathDown(root);

        return maxValue;
        
    }
}
