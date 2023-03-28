import org.w3c.dom.Node;

public class startswithproblem {
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;
    }

    public static Node root = new Node();

    public static void insert(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }
    }

    public static boolean checkIt(String s){
        Node curr = root;
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String[] arr = {"apple", "app", "mango", "man", "woman"};

        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }

        System.out.println(checkIt("man"));
    }
}
