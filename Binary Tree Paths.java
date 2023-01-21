// 257. Binary Tree Paths
// Easy
// 5.4K
// 231
// Companies
// Given the root of a binary tree, return all root-to-leaf paths in any order.

// A leaf is a node with no children.

 

// Example 1:


// Input: root = [1,2,3,null,5]
// Output: ["1->2->5","1->3"]
// Example 2:

// Input: root = [1]
// Output: ["1"]

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root, new StringBuilder(), ans);
        return ans;
    }
    public static void dfs(TreeNode root, StringBuilder sb, List<String> ans){
        if(root == null){
            return;
        }
      
        if(root.left == null && root.right == null){
          
            ans.add(sb.append(root.val).toString());
          
            return;
        }
        final int length = sb.length();
      
        dfs(root.left, sb.append(root.val).append("->"), ans);
        sb.setLength(length);
      
        dfs(root.right, sb.append(root.val).append("->"), ans);
        sb.setLength(length);
    }
}
