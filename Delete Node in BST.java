// 450. Delete Node in a BST
// Medium
// 6.8K
// 173
// Companies
// Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.

// Basically, the deletion can be divided into two stages:

// Search for a node to remove.
// If the node is found, delete the node.
 

// Example 1:


// Input: root = [5,3,6,2,4,null,7], key = 3
// Output: [5,4,6,2,null,null,7]
// Explanation: Given key to delete is 3. So we find the node with value 3 and delete it.
// One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
// Please notice that another valid answer is [5,2,6,null,4,null,7] and it's also accepted.

// Example 2:

// Input: root = [5,3,6,2,4,null,7], key = 0
// Output: [5,3,6,2,4,null,7]
// Explanation: The tree does not contain a node with value = 0.
// Example 3:

// Input: root = [], key = 0
// Output: []



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
    // Inorder Successor is the left most leaf in right subtree
    public static TreeNode findInOrderSuccessor(TreeNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else{
            // case 1: root is null
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2: single sub child node
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3: node with both children
            TreeNode IS = findInOrderSuccessor(root.right);
            root.val = IS.val;
            root.right = deleteNode(root.right, IS.val);
        }
        return root;

    }
}
