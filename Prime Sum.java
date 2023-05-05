// Prime Sum
// Programming
// Math
// Easy
// 32.8% Success

// 156

// 104

// Bookmark
// Asked In:
// Problem Description
 
 

// Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to the given number.
// If there is more than one solution possible, return the lexicographically smaller solution i.e.
// If [a, b] is one solution with a <= b,
// and [c,d] is another solution with c <= d, then

// [a, b] < [c, d] 
// If a < c OR ( a == c AND b < d ).
// NOTE: A solution will always exist. read Goldbach's conjecture


// Problem Constraints
// 1 <= A <= 2 * 107


// Input Format
// The first argument is an integer A.


// Output Format
// Return an array of integers.


// Example Input
// 4


// Example Output
// [2, 2]


// Example Explanation
// 2 + 2 equals 4, which is the lexicographically smaller solution


public class Solution {
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public int[] primesum(int A) {
        boolean[] isPrime = new boolean[A+1];
        
        for(int i=0; i<isPrime.length; i++){
            isPrime[i] = isPrime(i);
        }
        
        for(int i=2; i <= A/2; i++){
            if(isPrime[i] && isPrime[A-i]){
                return new int[]{i, A-i};
            }
        }
        return new int[]{};
    }
}
