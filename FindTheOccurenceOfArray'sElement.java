
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {4, 4, 4, 5, 5, 6,6};
		for(int i=0; i<arr.length; i++){
		    int count = 1;
		    for(int j=i+1; j<arr.length; j++){
		        if(arr[i] == arr[j]){
		            count++;
		        }
		    }
		    if(count > 1){
		        System.out.println(arr[i]+" "+count);
		        i += (count -1);
		    }
		}
	}
}
