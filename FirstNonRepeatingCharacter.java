//Assume all character into lower case
import java.util.LinkedList;
import java.util.Queue;

public class firstnonrepeatingcharacter {
    public static void findIt(String str){
        int frequency[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            frequency[ch - 'a']++;  //this will give us the index of array

            while(!q.isEmpty() && frequency[q.peek() - 'a'] > 1){   //this will check that value of that index is greater than one or not
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        findIt(str);
    }
}
