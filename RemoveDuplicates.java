//In this problem we got an string and we need to remove the duplicates and print the string
public class RemoveDuplicates
{
    public static void findduplicate(String str,int index,boolean map[],StringBuilder sb){
        if(index==str.length()){
            System.out.println(sb);
            return;
        }
        char currchar=str.charAt(index);
        if(map[currchar-'a'] == true){
            findduplicate(str,index+1,map,sb);
        }else{
            map[currchar-'a']=true;
            findduplicate(str,index+1,map,sb.append(currchar));
        }
        
    }
    public static void main (String[] args) {
        String str="appnacollege";
        boolean map[]=new boolean[26];
        StringBuilder sb=new StringBuilder();
        findduplicate(str,0,map,sb);
    }
}
