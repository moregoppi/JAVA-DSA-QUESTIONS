import java.util.*;
public class SubsetOfString {
    //time complexity is O(n*2^n)        space complexity is O(n)
    public static void subSets(String str,int i,String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //for yes who want to come in subset
        subSets(str, i+1, ans+str.charAt(i));
        //for no who don't want to come in subset
        subSets(str,i+1,ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        subSets(str, 0, "");
    }    
}
