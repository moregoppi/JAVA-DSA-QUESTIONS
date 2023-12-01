// Check whether BST contains Dead End
// EasyAccuracy: 35.99%Submissions: 57K+Points: 2
// Money can’t buy you happiness. But Geekbits can buy you GfG goodies and it’s the same thing. Earn 2X Geekbits Now

// banner
// Given a Binary Search Tree that contains unique positive integer values greater than 0. The task is to complete the function isDeadEnd which returns true if the BST contains a dead end else returns false. Here Dead End means a leaf node, at which no other node can be inserted.

// Example 1:

// Input :   
//                8
//              /   \ 
//            5      9
//          /  \     
//         2    7 
//        /
//       1     
          
// Output : 
// Yes
// Explanation : 
// Node 1 is a Dead End in the given BST.
// Example 2:

// Input :     
//               8
//             /   \ 
//            7     10
//          /      /   \
//         2      9     13

// Output : 
// Yes
// Explanation : 
// Node 9 is a Dead End in the given BST.
// Your Task: You don't have to input or print anything. Complete the function isDeadEnd() which takes BST as input and returns a boolean value.

// Expected Time Complexity: O(N), where N is the number of nodes in the BST.
// Expected Space Complexity: O(N)

// Constraints:
// 1 <= N <= 1001
// 1 <= Value of Nodes <= 10001



/*class Node {
        int data;
        Node left, right;
 
        Node(int item) {
            data = item;
            left = right = null;
        }
    }*/

//Function should return true if a deadEnd is found in the bst otherwise return false.
class Solution
{
    public static boolean isDeadEndUtil(Node root, int min, int max){
        if(root == null){
            return false;
        }
        if(min == max){
            return true;
        }
        return isDeadEndUtil(root.left, min, root.data-1) || isDeadEndUtil(root.right, root.data+1, max);
    }
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        return isDeadEndUtil(root, 1, 10001);
    }
}
