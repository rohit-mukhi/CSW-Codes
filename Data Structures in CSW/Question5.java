public class Question5 {

    static class Node {
        int info;
        Node left, right;
        public Node(int info) {
            this.info = info;
            left = right = null;
        }
    }

    static Node insert(Node root, int key) {
        if (root == null) 
            return new Node(key);
        if(key < root.info) 
            root.left = insert(root.left, key);
        else if(key > root.info) 
            root.right = insert(root.right, key);
        return root;
    }

    static int findMin(Node root) {
        while(root.left != null) 
            root = root.left;
        return root.info;
    }

    static Node remove(Node root, int key) {
        if (root == null){
            System.out.println("BST is empty");
            return null;
        }

        if(key < root.info) 
            root.left = remove(root.left, key);
        else if(key > root.info) 
            root.right = remove(root.right, key);
        else {
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            else {
                root.info = findMin(root.right);
                root.right = remove(root.right, root.info);
            }
        }
        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.info + " ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root = insert(root, 5);
        root = insert(root, 15);
        root = insert(root, 3);
        root = insert(root, 7);
        root = insert(root, 12);
        root = insert(root, 20);
        System.out.println("Inorder traversal : ");
        inorder(root);
        System.out.println();

        remove(root, 15);
        System.out.println("Inorder traversal after deletion : ");
        inorder(root);
        System.out.println();
    }    
}
