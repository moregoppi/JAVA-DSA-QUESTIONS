// Median of BST
// EasyAccuracy: 27.43%Submissions: 64K+Points: 2
// POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !
// Registered
// Given a Binary Search Tree of size N, find the Median of its Node values.

// Example 1:

// Input:
//        6
//      /   \
//    3      8   
//  /  \    /  \
// 1    4  7    9
// Output: 6
// Explanation: Inorder of Given BST will be:
// 1, 3, 4, 6, 7, 8, 9. So, here median will 6.

// Example 2:

// Input:
//        6
//      /   \
//    3      8   
//  /   \    /   
// 1    4   7   
// Output: 5
// Explanation:Inorder of Given BST will be:
// 1, 3, 4, 6, 7, 8. So, here median will
// (4 + 6)/2 = 10/2 = 5.
 

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function findMedian() which takes the root of the Binary Search Tree as input and returns the Median of Node values in the given BST.
// Median of the BST is:

// If number of nodes are even: then median = (N/2 th node + (N/2)+1 th node)/2
// If number of nodes are odd : then median = (N+1)/2th node.

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(Height of the Tree).


class Tree
{
    public static void inOrder(ArrayList<Integer> list, Node root){
        if(root == null){
            return;
        }
        inOrder(list, root.left);
        list.add(root.data);
        inOrder(list, root.right);
    }
    public static float findMedian(Node root)
    {
        // code here.
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(list, root);
        if(list.size() % 2 != 0){
            return list.get(list.size()/2);
        }
        int a = list.get(list.size()/2);
        int b = list.get((list.size()/2)-1);
        return (float)((a+b)/2);
    }
}
