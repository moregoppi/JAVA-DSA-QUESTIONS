// 6. Zigzag Conversion
// Medium
// 4.9K
// 10.5K
// Companies
// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"

// Write the code that will take a string and make this conversion given a number of rows:

// string convert(string s, int numRows);
 

// Example 1:

// Input: s = "PAYPALISHIRING", numRows = 3
// Output: "PAHNAPLSIIGYIR"
// Example 2:

// Input: s = "PAYPALISHIRING", numRows = 4
// Output: "PINALSIGYAHRPI"
// Explanation:
// P     I    N
// A   L S  I G
// Y A   H R
// P     I
// Example 3:

// Input: s = "A", numRows = 1
// Output: "A"
 

// Constraints:

// 1 <= s.length <= 1000
// s consists of English letters (lower-case and upper-case), ',' and '.'.
// 1 <= numRows <= 1000






class Solution {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        List<Character>[] rows = new List[numRows];
        int k = 0;
        int direction = numRows == 1 ? 0 : -1;

        for(int i=0; i<numRows; ++i){
            rows[i] = new ArrayList<>();
        }
        for(final char c : s.toCharArray()){
            rows[k].add(c);
            if(k == 0 || k == numRows - 1){
                direction *= -1;
            }
            k += direction;
        }

        for(List<Character> row : rows){
            for(final char c : row){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
