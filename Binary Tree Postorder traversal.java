// 145. Binary Tree Postorder Traversal
// Easy
// 5.4K
// 161
// Companies
// Given the root of a binary tree, return the postorder traversal of its nodes' values.

 

// Example 1:


// Input: root = [1,null,2,3]
// Output: [3,2,1]
// Example 2:

// Input: root = []
// Output: []
// Example 3:

// Input: root = [1]
// Output: [1]

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
    public static void postOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root, list);

        return list;
    }
}
