// 700. Search in a Binary Search Tree
// Easy
// 4.4K
// 163
// Companies
// You are given the root of a binary search tree (BST) and an integer val.

// Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

 

// Example 1:


// Input: root = [4,2,7,1,3], val = 2
// Output: [2,1,3]
// Example 2:


// Input: root = [4,2,7,1,3], val = 5
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return root;
        if(root.val < val) 
            return searchBST(root.right, val);
        if(root.val > val)
            return searchBST(root.left, val);

        return root;
    }
}







// -------------------------------------------------------------------------------------------------------------------------------------------------

//Build From Scratch
public class searchinbst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node buildBst(int val, Node root){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data < val){
            root.right = buildBst(val, root.right);
        }else{
            root.left = buildBst(val, root.left);
        }
        return root;
    }
    
    //Main Search In BST function
    public static boolean searchInBST(int found,Node root){
        if(root == null){
            return false;
        }
        if(root.data == found){
            return true;
        }
        if(root.data > found){
            return searchInBST(found, root.left);
        }
        if(root.data < found){
            return searchInBST(found, root.right);
        }

        return false;
    }
    public static void main(String[] args) {
        int val[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<val.length; i++){
            root = buildBst(val[i], root);
        }
        

        if(searchInBST(10, root)){
            System.out.println("Present in BST");
        }else{
            System.out.println("Not Present in BST");
        }
    }
}
