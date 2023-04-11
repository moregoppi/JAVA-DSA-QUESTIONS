// 119. Pascal's Triangle II
// Easy
// 3.7K
// 298
// Companies
// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

// Example 1:

// Input: rowIndex = 3
// Output: [1,3,3,1]
// Example 2:

// Input: rowIndex = 0
// Output: [1]
// Example 3:

// Input: rowIndex = 1
// Output: [1,1]

// brute force solution
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            int number = 1;
            for(int j=0; j<=i; j++){
                if(i == rowIndex){
                    ans.add(number);
                    number = number * (i-j)/(j+1);
                }else{
                    number = number * (i-j)/(j+1);
                }
            }
        }
        return ans;
    }
}

// Optimze solution
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<rowIndex+1; i++){
            ans.add(1);
            for(int j=i; j>=0; j--){
                if(j != 0 && j != i){
                    ans.set(j, ans.get(j) + ans.get(j-1));
                }
            }
        }
        return ans;
    }
}
