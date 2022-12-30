// 965. Univalued Binary Tree
// Easy
// 1.5K
// 59
// Companies
// A binary tree is uni-valued if every node in the tree has the same value.

// Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.

 

// Example 1:


// Input: root = [1,1,1,1,1,null,1]
// Output: true
// Example 2:


// Input: root = [2,2,2,5,2]
// Output: false




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
    int val = -1;
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        if(val == -1){
            val = root.val;
        }
        if(val != root.val){
            return false;
        }
        if(root.left == null && root.right == null){
            return true;
        }

        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
