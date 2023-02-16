// 110. Balanced Binary Tree
// Easy
// 8.3K
// 471
// Companies
// Given a binary tree, determine if it is 
// height-balanced
// .

 

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: true
// Example 2:


// Input: root = [1,2,2,3,3,null,null,4,4]
// Output: false
// Example 3:

// Input: root = []
// Output: true


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
    public static int getHeight(TreeNode node){
        if(node == null){
            return 1;
        }
        return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
