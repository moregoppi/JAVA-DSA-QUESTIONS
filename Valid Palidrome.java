// 125. Valid Palindrome
// Easy
// 5.5K
// 6.4K
// Companies
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.


class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=32 && s.charAt(i)<=47){
                continue;
            }else if(s.charAt(i)>=58 && s.charAt(i)<=64){
                continue;
            }else if(s.charAt(i)>=91 && s.charAt(i)<=96){
                continue;
            }else if(s.charAt(i)>=123 && s.charAt(i)<=126){
                continue;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        String a=sb.toString();
        String s1=a.toLowerCase();
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s1.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
