// Kth largest element in BST
// EasyAccuracy: 49.31%Submissions: 115K+Points: 2
// Given a Binary Search Tree. Your task is to complete the function which will return the Kth largest element without doing any modification in Binary Search Tree.

// Example 1:

// Input:
//       4
//     /   \
//    2     9
// k = 2 
// Output: 4
// Example 2:

// Input:
//        9
//         \ 
//           10
// K = 1
// Output: 10
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function kthLargest() which takes the root of the BST and an integer K as inputs and returns the Kth largest element in the given BST.

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(H) where H is max recursion stack of height H at a given time.

// Constraints:
// 1 <= N <= 105
// 1 <= K <= N



//User function Template for Java

/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public static void inOrder(ArrayList<Integer> list, Node root){
        if(root == null){
            return;
        }
        inOrder(list, root.left);
        list.add(root.data);
        inOrder(list, root.right);
    }
    public int kthLargest(Node root,int k)
    {
        //Your code here
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(list, root);
        return list.get(list.size()-k);
    }
}
