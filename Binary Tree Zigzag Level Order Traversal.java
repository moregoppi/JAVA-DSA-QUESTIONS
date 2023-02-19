// 103. Binary Tree Zigzag Level Order Traversal
// Medium
// 8.5K
// 227
// Companies
// Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

 

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[20,9],[15,7]]
// Example 2:

// Input: root = [1]
// Output: [[1]]
// Example 3:

// Input: root = []
// Output: []
 

// Constraints:

// The number of nodes in the tree is in the range [0, 2000].
// -100 <= Node.val <= 100


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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        List<List<Integer>> ans = new ArrayList<>();

        Deque<TreeNode> q = new ArrayDeque<>(Arrays.asList(root));

        boolean isLeftToRight = true;

        while(!q.isEmpty()){
            List<Integer> currLevel = new ArrayList<>();
            for(int sz = q.size(); sz > 0; --sz){
                if(isLeftToRight){
                    TreeNode node = q.pollFirst();
                    currLevel.add(node.val);
                    if(node.left != null){
                        q.addLast(node.left);
                    }
                    if(node.right != null){
                        q.addLast(node.right);
                    }
                }else{
                    TreeNode node = q.pollLast();
                    currLevel.add(node.val);
                    if(node.right != null){
                        q.addFirst(node.right);
                    }
                    if(node.left != null){
                        q.addFirst(node.left);
                    }
                }
            }
            ans.add(currLevel);
            isLeftToRight = !isLeftToRight;
        }
        return ans;
    }
}
