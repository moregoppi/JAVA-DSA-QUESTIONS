


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int l = -10;  //this is range 
		int r = 10;   //this is where range is ended
		int k = 8;   //third largest number 
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=l; i<=r; i++){
		    list.add(i);
		}
		System.out.println(list);
		
		for(int i=list.size()-1; i>=0; i--){
		    if(list.get(i) % 2 != 0){
		        k--;
		    } 
		    if(k == 0){
		        System.out.println(list.get(i));
		        break;
		    }
		}
		
	}
}
