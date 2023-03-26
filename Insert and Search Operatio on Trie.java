import java.util.*;

public class insertionintrie {
    static class Node{
        // every node contains an array node which help to insert or for making a tree
        Node[] children = new Node[26];

        // this will check the character is last of the word or not
        boolean endofword = false;
    }

    // root node is always empty
    public static Node root = new Node();

    public static void insertCharacter(String word){
        Node curr = root;

        for(int length=0; length<word.length(); length++){

            // here we are finding the index of character in array by using character's property 
            int idx = word.charAt(length) - 'a';
            // here we are checking that idx is empty or not if not we are making a new node at that point
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            // here we are updating it
            curr = curr.children[idx];
        }
        // here we reach the last character of word then we convert it in true
        curr.endofword = true;
    }
    // for searching a key we are going to traverse through whole key by charcters and check wisely a character is present at that level or not 
    // if that chacacter is not present on level then we are going to return false and for true we are going to check if endofword is true or not
    // if its true its mean all character of key are present on trie
    public static boolean search(String key){
        Node curr = root;

        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.endofword == true;
    }
    public static void main(String[] args) {
        String[] words = {"thee", "there", "their", "a", "then", "any"};

        for(int i=0; i<words.length; i++){
            insertCharacter(words[i]);
        }

        System.out.println(search("their"));
        System.out.println(search("them"));
    }    
}
