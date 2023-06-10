// Leaders in an array
// EasyAccuracy: 29.94%Submissions: 481K+Points: 2
// Apply for Mega Job-A-Thon: Fresher Edition | 30+ Opportunities | Avg CTC: 7 LPA  

// Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

 

// Example 1:

// Input:
// n = 6
// A[] = {16,17,4,3,5,2}
// Output: 17 5 2
// Explanation: The first leader is 17 
// as it is greater than all the elements
// to its right.  Similarly, the next 
// leader is 5. The right most element 
// is always a leader so it is also 
// included.
 

// Example 2:

// Input:
// n = 5
// A[] = {1,2,3,4,0}
// Output: 4 0
 

// Your Task:
// You don't need to read input or print anything. The task is to complete the function leader() which takes array A and n as input parameters and returns an array of leaders in order of their appearance.

 

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(n)

 

// Constraints:
// 1 <= n <= 107
// 0 <= Ai <= 107




class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int a[], int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int greater = a[n-1];
        list.add(greater);
        for(int i=n-2; i>=0; i--){
            if(a[i] >= greater){
                greater = a[i];
                list.add(greater);
            }
        }
        int left = 0;
        int right = list.size()-1;
        while(left < right){
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        return list;
    }
}
