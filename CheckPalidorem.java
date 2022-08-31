
public class Main
{
    public static boolean checkIt(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=32 && str.charAt(i)<=64) {
                continue;
            }else{
                sb.append(str.charAt(i));
            }
        }
        String a=sb.toString();
        String s1=a.toLowerCase();
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s1.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		String str="A man, a plan, a canal: Panama";
 		System.out.println(checkIt(str));
	}
}
