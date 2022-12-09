//We have balanced strings tr of size N with an equal number of L and R, the task is to find a maximum number X, such that a given string can be partitioned into 
//X balanced substring. A string is called to be balanced if the number of ‘L’s in the string equals the number of ‘R’s.
//Input: “LRRRRLLRLLRL”     Output: 3


public class Main
{
	public static void main(String[] args) {
		String s = "LRRRRLLRLLRL";
		int l = 0, r = 0;
		int ans = 0;
		for(int i=0; i<s.length(); i++){
		    if(s.charAt(i) == 'L'){
		        l++;
		    }
		    if(s.charAt(i) == 'R'){
		        r++;
		    }
		    
		    if(l == r){
		        ans++;
		    }
		}
		System.out.println(ans);
	}
}
