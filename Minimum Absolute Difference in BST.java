// 530. Minimum Absolute Difference in BST
// Easy
// 3.4K
// 167
// Companies
// Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

 

// Example 1:


// Input: root = [4,2,6,1,3]
// Output: 1
// Example 2:


// Input: root = [1,0,48,null,null,12,49]
// Output: 1
 

// Constraints:

// The number of nodes in the tree is in the range [2, 104].
// 0 <= Node.val <= 105
 

// Note: This question is the same as 783: https://leetcode.com/problems/minimum-distance-between-bst-nodes/

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
    public int getMinimumDifference(TreeNode root) {
        int ans = Integer.MAX_VALUE;
        int prev = -1;
        Deque<TreeNode> dq = new ArrayDeque<>();
        while(root != null || !dq.isEmpty()){
            while(root != null){
                dq.push(root);
                root = root.left;
            }
            root = dq.pop();
            if(prev >= 0){
                ans = Math.min(root.val - prev, ans);
            }
            prev = root.val;
            root = root.right;
        }
        return ans;
    }
}
