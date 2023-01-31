// 67. Add Binary
// Easy
// 6.4K
// 669
// Companies
// Given two binary strings a and b, return their sum as a binary string.
// Example 1:
// Input: a = "11", b = "1"
// Output: "100"
// Example 2:
// Input: a = "1010", b = "1011"
// Output: "10101"






class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0){
            int temp = (i>=0?(a.charAt(i)-'0'):0) + (j>=0?(b.charAt(j)-'0'):0) + carry;
            carry = temp/2;
            int digit = temp%2;
            result = digit + result;
            i--;
            j--;
        }
        if(carry > 0){
            result = carry + result;
        }
        return result;
    }
}
