

// // User function Template for Java

// class Solution {
//     // Function to insert a node in a BST.
//     public static void insertUtil(Node root, int key){
//         Node node = new Node(key);
//         if (root == null) {
//             root = node;
//             return;
//         }
//         Node prev = null;
//         Node temp = root;
//         while (temp != null) {
//             if (temp.data > key) {
//                 prev = temp;
//                 temp = temp.left;
//             }
//             else if (temp.data < key) {
//                 prev = temp;
//                 temp = temp.right;
//             }
//         }
//         if (prev.data > key)
//             prev.left = node;
//         else
//             prev.right = node;
//     }
//     Node insert(Node root, int key) {
//         // your code here
//         if (root == null) {
//             root = new Node(key);
//             return root;
//         }
 
//         // Otherwise, recur down the tree
//         else if (key < root.data)
//             root.left = insert(root.left, key);
//         else if (key > root.data)
//             root.right = insert(root.right, key);
 
//         // Return the (unchanged) node pointer
//         return root;
//     }
// }



// User function Template for Java

class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int key) {
        // your code here
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        // Otherwise, recur down the tree
        else if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
 
        // Return the (unchanged) node pointer
        return root;
    }
}
