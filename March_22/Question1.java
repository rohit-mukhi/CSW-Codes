// Change of address when shallow copy is made

public class Question1 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(20);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.val);
        System.out.println(obj2.val);
        obj1 = obj2;
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.val);
        System.out.println(obj2.val);
    }
}

class MyClass {
    int val;
    MyClass(int val) {
        this.val = val;
    }
}
