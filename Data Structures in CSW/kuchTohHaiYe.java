public class A6Q3 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

      static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static boolean isBST(TreeNode root) {
        if (root == null)
            return true;

        if (root.left != null && getMax(root.left) > root.val)
            return false;

        if (root.right != null && getMin(root.right) < root.val)
            return false;

        if (!isBST(root.left) || !isBST(root.right))
            return false;
        return true;
    }

    static int getMax(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(getMax(root.left), getMax(root.right)));
    }

    static int getMin(TreeNode root) {
        if (root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(getMin(root.left), getMin(root.right)));

    }

    static TreeNode getMinValueNode(TreeNode node) {
        TreeNode current = node;
        while(current.left != null) {
            current = current.left;
        }
        return current;
    }

    static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return root;
        if(key < root.val) 
            root.left = deleteNode(root.left, key);
        else if(key > root.val)
            root.right = deleteNode(root.right, key);
        else {
            if(root.left == null)
                return root.right;
            else if(root.right == null) 
                return root.left;
            TreeNode successor = getMinValueNode(root.right);
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }  
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(6);
        root.right = new TreeNode(14);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(18);

        if (isBST(root)) {
            System.out.println("Binary tree is BST");
        } else {
            System.out.println("Binary tree is not BST");
        }
        inorder(root);
        System.out.println();
        System.out.print("Minimum value stored in node : ");
        System.out.println(getMinValueNode(root).val);
        deleteNode(root, 11);
        System.out.println("After deletion : ");
        inorder(root);
        System.out.println();
    }
}
