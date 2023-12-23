// 1496. Path Crossing
// Solved
// Easy
// Topics
// Companies
// Hint
// Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

// Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.

 

// Example 1:


// Input: path = "NES"
// Output: false 
// Explanation: Notice that the path doesn't cross any point more than once.
// Example 2:


// Input: path = "NESWW"
// Output: true
// Explanation: Notice that the path visits the origin twice.
 

// Constraints:

// 1 <= path.length <= 104
// path[i] is either 'N', 'S', 'E', or 'W'.


class Solution {
    public boolean isPathCrossing(String path) {
        int i = 0, j = 0;
        Set<Integer> vis = new HashSet<>();
        vis.add(0);
        for (int k = 0, n = path.length(); k < n; ++k) {
            switch (path.charAt(k)) {
                case 'N' -> --i;
                case 'S' -> ++i;
                case 'E' -> ++j;
                case 'W' -> --j;
            }
            int t = i * 20000 + j;
            if (!vis.add(t)) {
                return true;
            }
        }
        return false;
    }
}
