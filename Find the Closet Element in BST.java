// Find the Closest Element in BST
// MediumAccuracy: 47.51%Submissions: 69K+Points: 4
// Apply for Mega Job-A-Thon: Fresher Edition | 30+ Opportunities | Avg CTC: 3-15 LPA  

// Given a BST and an integer. Find the least absolute difference between any node value of the BST and the given integer.

// Example 1:

// Input:
//         10
//       /   \
//      2    11
//    /  \ 
//   1    5
//       /  \
//      3    6
//       \
//        4
// K = 13
// Output: 
// 2
// Explanation: K=13. The node that has
// value nearest to K is 11. so the answer
// is 2
// Example 2:

// Input:
//       8
//     /   \
//    1     9
//     \     \
//      4    10
//     /
//    3
// K = 9
// Output: 
// 0
// Explanation: K=9. The node that has
// value nearest to K is 9. so the answer
// is 0.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function minDiff() that takes the root of the BST and an integer K as its input and returns the minimum absolute difference between any node value of the BST and the integer K.

// Expected Time Complexity: O(Height of the BST).
// Expected Auxiliary Space: O(Height of the BST).

// Constraints:
// 1 <= Number of nodes <= 105
// 1 <= Value stored at nodes(data), K <= 105



//User function Template for Java

/*
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
*/

class Solution
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    public static void findit(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        findit(root.left, list);
        list.add(root.data);
        findit(root.right, list);
    }
    static int minDiff(Node  root, int k) 
    { 
        // Write your code here
        ArrayList<Integer> list = new ArrayList<>();
        findit(root, list);
        Collections.sort(list);
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++){
            int diff = Math.abs(list.get(i)-k);
            ans = Math.min(ans, diff);
        }
        return ans;
    } 
}
