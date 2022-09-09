import java.util.*;
public class findpermutationofstring {
    //time complexity is O(n*n!) space complexity is O(n)
    public static void findPermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char chr=str.charAt(i);
            String newstr=str.substring(0, i) + str.substring(i+1);
            findPermutation(newstr, ans+chr);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        findPermutation(str, "");
    }
}
