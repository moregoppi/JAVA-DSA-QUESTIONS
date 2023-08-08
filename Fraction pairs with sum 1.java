// Fraction pairs with sum 1
// MediumAccuracy: 51.09%Submissions: 16K+Points: 4
// Given a list of N fractions, represented as two lists numerator and denominator, the task is to determine the count of pairs of fractions whose sum equals 1.

// Example 1:

// Input:
// N = 4
// numerator = [1, 2, 2, 8]
// denominator = [2, 4, 6, 12]
// Output:
// 2
// Explanation:
// Fractions 1/2 and 2/4 sum to 1. Similarly fractions 2/6 and 8/12 sum to 1. So there are 2 pairs of fractions which sum to 1.
// Example 2:

// Input:
// N = 5
// numerator = [3, 1, 12, 81, 2]
// denominator = [9, 10, 18, 90, 5]
// Output:
// 2
// Explanation:
// Fractions 3/9 and 12/18 sum to 1. Similarly fractions 1/10 and 81/90 sum to 1. So there are 2 pairs of fractions which sum to 1.
// Your task:
// You don't need to read input or print anything. Your task is to complete the function countFractions() which take integer N and arrays numerator and denominator of size N as arguments, and returns an integer.

// Expected Time Complexity: O(N*log(N))
// Expected Auxiliary Space: O(N)

// Constraints:
// 1 <= N <=105
// 1 <= numerator[i] <= denominator[i] <= 109




class Solution {
    public static int countFractions(int n, int[] nume, int[] denom) {
        // code here
        int count = 0;
        HashMap<String, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int k = gcd(nume[i], denom[i]);
            int num = nume[i]/k;
            int den = denom[i]/k;
            
            String a = num +"/"+den;
            String d = den-num+"/"+den;
            
            if(mp.containsKey(d)){
                count = count + mp.get(d);
            }
            int x = mp.getOrDefault(a,0)+1;
            mp.put(a,x);
        }

        return count;
    }
    public static int gcd(int a, int b){
        if(a == 0) return b;
        return gcd(b%a, a);
    }
}
        
