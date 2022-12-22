import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		
		for(int i=0; i<m; i++){
		    list1.add(sc.nextInt());
		}
		for(int i=0; i<n; i++){
		    list2.add(sc.nextInt());
		}
		
		list1.addAll(list2);
		
		for(int i:list1){
		    System.out.print(i+" ");
		}
	}
}
