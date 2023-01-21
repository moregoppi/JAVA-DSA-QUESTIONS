// 1373. Maximum Sum BST in Binary Tree
// Hard
// 1.9K
// 153
// Companies
// Given a binary tree root, return the maximum sum of all keys of any sub-tree which is also a Binary Search Tree (BST).

// Assume a BST is defined as follows:

// The left subtree of a node contains only nodes with keys less than the node's key.
// The right subtree of a node contains only nodes with keys greater than the node's key.
// Both the left and right subtrees must also be binary search trees.
 

// Example 1:



// Input: root = [1,4,3,2,4,2,5,null,null,null,null,null,null,4,6]
// Output: 20
// Explanation: Maximum sum in a valid Binary search tree is obtained in root node with key equal to 3.
// Example 2:



// Input: root = [4,3,null,1,2]
// Output: 2
// Explanation: Maximum sum in a valid Binary search tree is obtained in a single root node with key equal to 2.
// Example 3:

// Input: root = [-4,-2,-5]
// Output: 0
// Explanation: All values are negatives. Return an empty BST.


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
    static class Info{
        boolean isBst;
        int min;
        int max;
        int sum;
        Info(boolean isBst, int min, int max, int sum){
            this.isBst = isBst;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }
    
    public int maxSumBST(TreeNode root) {
        Info largestBST = largestBst(root);

        return ans;
    }
    public static int ans = 0;
    public static Info largestBst(TreeNode root){
        if(root == null){
            return new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        Info leftBst = largestBst(root.left);
        Info rightBst = largestBst(root.right);

        
        int min = Math.min(root.val, Math.min(leftBst.min, rightBst.min));
        int max = Math.max(root.val, Math.max(leftBst.max, rightBst.max));

        if(root.val <= leftBst.max || root.val >= rightBst.min){
            return new Info(false, min, max, 0);
        }
        if(leftBst.isBst && rightBst.isBst){
            int sum = leftBst.sum + rightBst.sum + root.val;
            ans = Math.max(sum, ans);
            return new Info(true, min, max, sum);
        }

        return new Info(false, min, max, 0);
    }
}
