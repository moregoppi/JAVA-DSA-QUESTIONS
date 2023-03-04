// STRONG_OR_NOT_STRONG
// Problem Statement:
// Write a program to check whether a number is strong or not. A number is called strong number if sum of the factorial of its digit is equal to number itself. For example: 145 as 1! + 4! + 5! = 1 + 24 + 120 = 145

// Input:
// First line contains number of test cases T. Then following T lines contains an integer N.

// Output:
// Output "Strong" if given number is strong else "Not Strong" .

// Constraints:
// 1 <= T <= 50
// 0 <= N <= 1000

// Time Limit:
// 1 sec

// Example 1:
// Input
// 2
// 145
// 10

// Output
// Strong
// Not Strong
// Sample I/O Explanation:
// 145 is strong as 1! + 4! + 5! = 1 + 24 + 120 = 145 10 is not a strong number

import java.util.*;
public class solution {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i=0; i<t; i++){
	        int n = sc.nextInt();
	        int temp = n;
	        int sum = 0;
	        while(temp != 0){
	            int lastdigit = temp % 10;
	            sum += factorial(lastdigit);
	            temp /= 10;
	        }
	        if(sum == n){
	            System.out.println("Strong");
	        }else{
	            System.out.println("Not Strong");
	        }
	    }
}
}
