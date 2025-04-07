public class Question2 {
    static class BSTNode {
        int info;
        BSTNode left, right;

        public BSTNode(int info) {
            this.info = info;
            left = null;
            right = null;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70 ,80, 90, 100};
        BSTNode root = CreateTree(arr, 0, arr.length-1);
        System.out.println("Inorder Traversal : ");
        Inorder(root);
        System.out.println();
    }

    static BSTNode CreateTree(int[] arr, int i, int j) {
        if(i > j) 
            return null;
        int mid = (i + j) / 2;
        BSTNode node = new BSTNode(arr[mid]);
        node.left = CreateTree(arr, i, mid - 1);
        node.right = CreateTree(arr, mid+1, j);
        return node;
    }

    static void Inorder(BSTNode root) {
        if (root != null) {
            Inorder(root.left);
            System.out.print(root.info + " ");
            Inorder(root.right);
        }
    }
}
