// 557. Reverse Words in a String III
// Solved
// Easy
// Topics
// Companies
// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

// Example 1:

// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
// Example 2:

// Input: s = "God Ding"
// Output: "doG gniD"
 

// Constraints:

// 1 <= s.length <= 5 * 104
// s contains printable ASCII characters.
// s does not contain any leading or trailing spaces.
// There is at least one word in s.
// All the words in s are separated by a single space.
// Accepted
// 768.2K
// Submissions
// 931.5K
// Acceptance Rate
// 82.5%

class Solution {
    public static String reverse(String s){
        String ans = "";
        for(int i=s.length()-1; i>=0; i--){
            ans += s.charAt(i);
        }

        return ans;
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            String str = reverse(arr[i]);
            sb.append(str);
            if(i != arr.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
