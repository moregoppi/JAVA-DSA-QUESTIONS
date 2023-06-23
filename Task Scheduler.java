// Task Scheduler
// MediumAccuracy: 58.08%Submissions: 15K+Points: 4
// Given a character array tasks of size N, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.
// CPU has a cooldown period for each task. CPU can repeat a task only after atleast K units of time has passed after it did same task last time. It can perform other tasks in that time, can stay idle to wait for repeating that task.

// Return the least number of units of times that the CPU will take to finish all the given tasks.

// Example 1:

// Input:
// N = 6
// K = 2
// task[ ] = {'A', 'A', 'A', 'B', 'B', 'B'}
// Output: 8
// Explanation: 
// A -> B -> idle -> A -> B -> idle -> A -> B
// There is atleast 2 units of time between any two same tasks.
 
// Example 2:

// Input:
// N = 12
// K = 2
// task[ ] = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}
// Output: 16
// Explanation:  
// One possible solution is 
// A -> B -> C -> A -> D -> E -> A -> F -> G -> A -> idle -> idle -> A -> idle -> idle -> A.
 

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function leastInterval() which takes the interger N, integer K and an character array tasks as parameters and returns the minimum unit of time required to complete all tasks.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ N ≤ 104
// 0 ≤ K ≤ 100
// taski is upper-case English letter.


//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            char a[] = new char[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.next().charAt(0);
            }
            Solution obj = new Solution();
            int ans = obj.leastInterval(n, k, a);
            System.out.println(ans);
        }
    }
    static class FastReader {

        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;

        FastReader(InputStream is) { in = is; }

        int scan() throws IOException {
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0) {
                    return -1;
                }
            }
            return buf[index++];
        }

        String next() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan())
                ;
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char)c);
            }
            return sb.toString();
        }

        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan())
                ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }

        long nextLong() throws IOException {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan())
                ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
    }
}

// } Driver Code Ends



// User function Template for Java
// Solution
class Solution {
    static int leastInterval(int N, int k, char tasks[]) {
        // code here
        int[] freq = new int[26];
        for(int i=0; i<N; i++){
            freq[tasks[i] - 'A']++;
        }
        Arrays.sort(freq);
        int maxFreq  = freq[25];
        int chunks = maxFreq - 1;
        int idlespots = chunks * k;
        for(int i=24; i>=0; i--){
            idlespots -= Math.min(chunks, freq[i]);
        }
        return idlespots > 0? idlespots+N : N;
    }
}
