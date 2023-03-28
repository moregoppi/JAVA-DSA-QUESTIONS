
public class prefixproblem {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int frequency;

        public Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
            frequency = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String s){
        Node curr = root;

        for (int i=0; i<s.length(); i++) {

            int idx = s.charAt(i) - 'a';

            if (curr.children[idx] == null) {

                curr.children[idx] = new Node();

            } else {
                curr.children[idx].frequency++;
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans){
        if(root == null){
            return;
        }

        if(root.frequency == 1){
            System.out.print(ans+" ");
            return;
        }

        for(int i=0; i<root.children.length; i++){
            if(root.children[i] != null){
                // i+'a' means we are converting integer into character
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    
    // We are going to store the frequency at every children node for every character if any character have more than 1 frequency
    // its mean we can add at it as a prefix if frequency is 1 then we can stop bexause from that unqiue characters are start
    public static void main(String[] args) {
        String words[] = {"zebra", "dog", "dove", "duck"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        root.frequency = -1;
        
        findPrefix(root, "");
    }   
}
