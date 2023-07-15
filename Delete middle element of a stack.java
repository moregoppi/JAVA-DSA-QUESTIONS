// Delete middle element of a stack
// EasyAccuracy: 53.71%Submissions: 93K+Points: 2
// POTD July Placement Special : All POTD in the month of July are based on popular interview questions. Solve every day to ace the upcoming Placement Season !
// Registered
// Given a stack, delete the middle element of the stack without using any additional data structure.
// Middle element:- ceil((size_of_stack+1)/2) (1-based indexing) from bottom of the stack.

// Note: The output shown by the compiler is the stack from top to bottom.
 
// Example 1:

// Input: 
// Stack = {10, 20, 30, 40, 50}
// Output:
// ModifiedStack = {10, 20, 40, 50}
// Explanation:
// If you print the stack the bottom-most element will be 10 and the top-most element will be 50. Middle element will be element at index 3 from bottom, which is 30. Deleting 30, stack will look like {10 20 40 50}.
// Example 2:

// Input: 
// Stack = {10 20 30 40}
// Output:
// ModifiedStack = {10 30 40}
// Explanation:
// If you print the stack the bottom-most element will be 10 and the top-most element will be 40. Middle element will be element at index 2 from bottom, which is 20. Deleting 20, stack will look like {10 30 40}.
// Your Task:
// You don't need to read input or print anything. Complete the function deleteMid() which takes the stack and its size as input parameters and modifies the stack in-place.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

// Constraints:
// 2 ≤ size of stack ≤ 105




//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        Stack<Integer> temp = new Stack<>();
        int mid = sizeOfStack/2;
        int count = 0;
        while(count <= mid){
            if(count == mid){
                s.pop();
            }else{
                temp.push(s.pop());
            }
            count++;
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
    } 
}
