//For a given integer array of size N. You have to find all the occurrences (indices) of a given element (Key) and print them. Use a recursive function to solve this problem.
//Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2Sample Output: 1 5 7 8

public class findoccurence {
    public static void findOut(int arr[],int n,int index){
        if(index==arr.length){
            return;
        }
        if(n==arr[index]){
            System.out.print(index+" ");
            findOut(arr,n,index+1);
        }else{
            findOut(arr,n,index+1);
        }
    }
	public static void main(String[] args) {
	    int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
	    int n=2;
	    findOut(arr,n,0);
	}
}
