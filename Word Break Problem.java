import java.util.*;

public class wordbreakproblem {
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;

        for(int length=0; length<word.length(); length++){

            int idx = word.charAt(length) - 'a';
        
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
        
            curr = curr.children[idx];
        }
        
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;

        for(int i=0; i<key.length(); i++){

            int idx = key.charAt(i) - 'a';

            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    public static boolean findWord(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0, i)) && findWord(key.substring(i))){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String[] word = {"i", "like", "sam", "samsung", "ice"};
        String key = "ilikesamsung";

        for(int i=0; i<word.length; i++){
            insert(word[i]);
        }

        System.out.println(findWord(key));
    }    
}
