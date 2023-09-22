// First and last occurrences of x
// MediumAccuracy: 37.36%Submissions: 219K+Points: 4
// Learn Google Cloud with Curated Lab Assignments. Register, Earn Rewards, Get noticed by experts at Google & Land your Dream Job! 
// Given a sorted array arr containing n elements with possibly duplicate is to find indexes of first elements, the task is to find the first and last occurrences of an element x in the given array.
// Note: If the number x is not found in the array then return both the indices as -1.


// Example 1:

// Input:
// n=9, x=5
// arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
// Output:  
// 2 5
// Explanation: 
// First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 
// Example 2:

// Input:
// n=9, x=7
// arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
// Output:  
// 6 6
// Explanation: 
// First and last occurrence of 7 is at index 6.
// Your Task:
// Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function find() that takes array arr, integer n and integer x as parameters and returns the required answer.

// Expected Time Complexity: O(logN)
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 ≤ N ≤ 106
// 1 ≤ arr[i],x ≤ 109

//User function Template for Java


class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int first = -1, last = -1;
        
        for(int i=0; i<n; i++){
            if(x != arr[i]){
                continue;
            }
            if(first == -1){
                first = i;
            }
            last = i;
        }
        list.add(first);
        list.add(last);
        return list;
    }
}



//User function Template for Java


class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(arr[i]);
        }
        
        int first = list.indexOf(x);
        int last = list.lastIndexOf(x);
        
        list.clear();
        list.add(first);
        list.add(last);
        return list;
    }
}
