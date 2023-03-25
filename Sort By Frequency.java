import java.util.TreeMap;

public class sortbyfrequency {
    public static void main(String[] args) {
        String s = new String("zzzzzbbbaa");

        TreeMap<Character, Integer> mp = new TreeMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for(Character key : mp.keySet()){
            int count = mp.get(key);
            while(count != 0){
                sb.append(key);
                count--;
            }
        }
        System.out.println(sb);
    }
}
