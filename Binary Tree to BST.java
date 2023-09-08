// Binary Tree to BST
// EasyAccuracy: 60.75%Submissions: 57K+Points: 2
// Given a Binary Tree, convert it to Binary Search Tree in such a way that keeps the original structure of Binary Tree intact.
//  Example 1:

// Input:
//       1
//     /   \
//    2     3
// Output: 
// 1 2 3
// Explanation:
// The converted BST will be 
//       2
//     /   \
//    1     3

// Example 2:

// Input:
//           1
//        /    \
//      2       3
//    /        
//  4       
// Output: 
// 1 2 3 4
// Explanation:
// The converted BST will be

//         3
//       /   \
//     2     4
//   /
//  1
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function binaryTreeToBST() which takes the root of the Binary tree as input and returns the root of the BST. The driver code will print inorder traversal of the converted BST.

// Expected Time Complexity: O(NLogN).
// Expected Auxiliary Space: O(N).

// Constraints:
// 1 <= Number of nodes <= 105




//User function Template for Java

/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */


class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    public static void convertIt(ArrayList<Integer> list, Node root){
        if(root == null){
            return;
        }
        
        list.add(root.data);
        convertIt(list, root.left);
        convertIt(list, root.right);
    }
    public static Node convertBST(ArrayList<Integer> list, int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(list.get(mid));
        root.left = convertBST(list, start, mid - 1);
        root.right = convertBST(list, mid+1, end);
        return root;
    }
    Node binaryTreeToBST(Node root)
    {
       // Your code here
       ArrayList<Integer> list = new ArrayList<>();
       convertIt(list, root);
       Collections.sort(list);
       return convertBST(list, 0, list.size()-1);
       
    }
    
}
 
