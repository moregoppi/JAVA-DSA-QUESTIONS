public class longestwordeithprefixall {
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

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder sb){        
        if(root == null){
            return;
        }

        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i + 'a');
                sb.append(ch);
                if(sb.length() > ans.length()){
                    ans = sb.toString();
                }
                longestWord(root.children[i], sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String[] word = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<word.length; i++){
            insert(word[i]);
        }
        StringBuilder sb = new StringBuilder("");
        longestWord(root, sb);
        System.out.println(ans);
    }
}
