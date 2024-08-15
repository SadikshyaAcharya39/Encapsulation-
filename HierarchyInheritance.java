
// Hierarchy Inheritance - One parent, multiple child class

// Parent Class
class Parent{

    void display(int a){
        System.out.println(a);
    }
}

class Child1 extends Parent{
    void print(int b){
        System.out.println(b);
    }
}

class Child2 extends Parent{
    void show(int c){
        System.out.println(c);
    }
}

public class HierarchyInheritance {
    public static void main(String[] args) {

        // We dont have to do this, we can assign value from child class by calling a method.
//        Parent parent = new Parent();
//        parent.display(1);

        Child1 c1 = new Child1();
        c1.display(1);
        c1.print(2);

        Child2 c2 = new Child2();
        c2.display(1);
        c2.show(3);
    }
}
