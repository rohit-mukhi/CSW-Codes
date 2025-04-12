public class Question4 {

    static class Country {
        String name;
        int population;

        public Country(String name, int population) {
            this.name = name;
            this.population = population;
        }
    }

    static class BNode {
        Country c;
        BNode left, right;

        public BNode(String name, int population) {
            c = new Country(name, population);
            left = right = null;
        }

        @Override
        public String toString() {
            return "[ Name : " + c.name + " Population : " + c.population + " ]";

        }
    }

    static void insert(BNode root, String n, int p) {
        if (root == null)
            root = new BNode(n, p);

        if(p < root.c.population) {
            if(root.left == null)
                root.left = new BNode(n, p);
            else 
                insert(root.left, n, p); 
        }

        if(p > root.c.population) {
            if(root.right == null)
                root.right = new BNode(n, p);
            else 
                insert(root.right, n, p);
        }
    }

    static void inorder(BNode root) {
        if(root != null) {
            inorder(root.left);
            System.out.println(root + " ");
            inorder(root.right);
        }
    }

    static void findMax(BNode root) {
        if(root == null) 
            System.out.println("BST is empty");

        while(root.right != null) {
            root = root.right;
        }

        System.out.println("Name : " + root.c.name);
        System.out.println("Population : " + root.c.population);
    }

    static void findMin(BNode root) {
        if(root == null)
            System.out.println("BST is empty");

        while(root.left != null)
            root = root.left;
        
        System.out.println("Name : " + root.c.name);
        System.out.println("Population : " + root.c.population);
    }
    public static void main(String[] args) {
        BNode root = new BNode("India", 1500000000);
        insert(root, "Spain", 500000);
        insert(root, "Australia", 67000000);
        insert(root, "New Zealand", 420000000);

        System.out.println("Inoder traversal : ");
        inorder(root);
        System.out.println("");
        System.out.println("Country with max population : ");
        findMax(root);
        System.out.println("Country with min population : ");
        findMin(root);
    }
}
