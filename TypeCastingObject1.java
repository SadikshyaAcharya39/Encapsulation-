
class ParentClass
{
    String name= "John";

    void m1()
    {
        System.out.println("this is m1 from parent...");
    }
}

class Child extends ParentClass
{
    int id = 101;

    void m2()
    {
        System.out.println("this is m2 from Child...");
    }
}


public class TypeCastingObject1 {
    public static void main(String[] args) {

//    Child child = new Child();
//    System.out.println(child.name);   // Parent Class
//    child.m1(); // Parent

//        System.out.println(child.id);  // Child Class
//        child.m2();  // Child



//        ParentClass parentClass = new Child(); // Up Casting
//        // Child is smaller, parent is higher
//
//        System.out.println(parentClass.name); // Parent
//        parentClass.m1();  // Parent


        // Object is created for child class but the reference is a parent class.
        // Not possible because Parent class does not belongs to Child Class.

        // We cannot access
//        System.out.println(parentClass.id);
//        parentClass.m2();

        // Down Casting

        // Getting an error

        ParentClass p = new ParentClass();
        Child c = (Child) p;

        System.out.println(c.name);
        System.out.println(c.id);
        c.m2();
        c.m1();


    }
}
