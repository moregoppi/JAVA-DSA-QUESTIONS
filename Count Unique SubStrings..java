public class countuniquesubstrings {
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
        curr.eow = true;
    }

    // we are checking if the children index is empty then we are not adding + 1 into ans
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int ans = 0;
        for(int i=0; i<root.children.length; i++){
            if(root.children[i] != null){
                ans += countNodes(root.children[i]);
            }
        }

        return ans+1;
    }
    public static void main(String[] args) {
        String key = "ababa";

        for(int i=0; i<key.length(); i++){
            // this means from the ith index to the last index
            String sufix = key.substring(i);
            insert(sufix);
        }

        System.out.println(countNodes(root));
    }
}
