// 728. Self Dividing Numbers
// Easy
// 1.6K
// 361
// Companies
// A self-dividing number is a number that is divisible by every digit it contains.

// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
// A self-dividing number is not allowed to contain the digit zero.

// Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].

 

// Example 1:

// Input: left = 1, right = 22
// Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
// Example 2:

// Input: left = 47, right = 85
// Output: [48,55,66,77]
 

// Constraints:

// 1 <= left <= right <= 104
// Accepted
// 210.2K
// Submissions
// 269.7K
// Acceptance Rate
// 78.0%

class Solution {
    public static boolean divisible(int n){
        for(int i=n; i>0; i = i / 10){
            int lastdigit = i % 10;
            if(i % 10 == 0 || n % lastdigit != 0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(divisible(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
