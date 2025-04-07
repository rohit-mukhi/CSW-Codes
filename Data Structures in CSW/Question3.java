public class Question3 {
    static class BSTNode {
        int info;
        BSTNode left, right;
        public BSTNode(int info) {
            this.info = info;
            left = null;
            right = null;
        }
    }

    static boolean isBST(BSTNode root) {
        return isBSTCheck(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean isBSTCheck(BSTNode root, long min, long max) {
        if (root == null) 
            return true;
        
        if (root.info < min || root.info > max)
            return false;
        return isBSTCheck(root.left, min, root.info) && isBSTCheck(root.right, root.info, max);
    }

    public static void main(String[] args) {
        BSTNode root = new BSTNode(10);
        root.left = new BSTNode(5);
        root.right = new BSTNode(20);
        root.left.left = new BSTNode(3);
        root.left.right = new BSTNode(7);
        System.out.println("Is the tree BST : " + isBST(root));
    }
}
