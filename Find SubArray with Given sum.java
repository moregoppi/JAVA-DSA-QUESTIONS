public class Main
{
    public static void subArraya(int[] arr, int sum){
        for(int i=0; i<arr.length; i++){
            
            int currsum = arr[i];
            
            if(currsum == sum){
                System.out.println(i);
                return;
            }
            
            for(int j=i+1; j<arr.length; j++){
                
                currsum += arr[i];
                
                if(currsum == sum){
                    System.out.println("subarray present at "+i+"th index to "+j+"th index");
                    return;
                }
            }
        }
    }
	public static void main(String[] args) {
		int[] arr = {1,3,5,3,2,1};
		int sum = 10;
	    
	    subArraya(arr, sum);
	}
}
