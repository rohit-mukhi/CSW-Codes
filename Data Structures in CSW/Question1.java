public class Question1 {

    static class BSTNode {
        int info;
        BSTNode left, right;
        public BSTNode(int info) {
            this.info = info;
            left = null;
            right = null;
        }
    }

    static void insert(BSTNode root, int key) {
        if(key < root.info) {
            if(root.left == null) {
                root.left = new BSTNode(key);
            } else {
                insert(root.left, key);
            }
        }

        if(key > root.info) {
            if(root.right == null) {
                root.right = new BSTNode(key);
            } else {
                insert(root.right, key);
            }
        }
    }

    static void inorder(BSTNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.info + " ");
            inorder(root.right);
        }
    }

    static void preorder(BSTNode root) {
        if (root != null) {
            System.out.print(root.info + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder(BSTNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.info + " ");
        }
    }
    public static void main(String[] args) {
        BSTNode root = new BSTNode(10);
        insert(root, 1);
        insert(root, 5);
        insert(root, 15);
        insert(root, 20);
        insert(root, 25);

        System.out.print("Inorder Traversal : ");
        inorder(root);
        System.out.println();
        System.out.print("Preorder traversal : ");
        preorder(root);
        System.out.println();
        System.out.print("Postorder traversal : ");
        postorder(root);
    }    
}

