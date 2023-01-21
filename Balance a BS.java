// 1382. Balance a Binary Search Tree
// Medium
// 2.4K
// 61
// Companies
// Given the root of a binary search tree, return a balanced binary search tree with the same node values. If there is more than one answer, return any of them.

// A binary search tree is balanced if the depth of the two subtrees of every node never differs by more than 1.

 

// Example 1:


// Input: root = [1,null,2,null,3,null,4,null,null]
// Output: [2,1,3,null,null,null,4]
// Explanation: This is not the only correct answer, [3,1,4,null,2] is also correct.
// Example 2:


// Input: root = [2,1,3]
// Output: [2,1,3]


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
    public static void createArray(ArrayList<Integer> list, TreeNode root){
        if(root == null){
            return;
        }
        createArray(list, root.left);
        list.add(root.val);
        createArray(list, root.right);
    }

    public static TreeNode createBST(ArrayList<Integer> list, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start+end)/2;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = createBST(list, start, mid-1);
        root.right = createBST(list, mid+1, end);

        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        createArray(list, root);

        TreeNode ans = createBST(list, 0, list.size()-1);
        return ans;
    }
}
