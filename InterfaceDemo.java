
interface Shape
{
    // final and static variables by default

    int length = 10; // final and static
    int width = 20; // final and static

    /*
    Three types of methods is allowed.
    1. Default Method
    2. Abstract Method
    3. Static Method

     */

    // We cannot implement a method as soon as we write bracket implementation starts.
    // This method is not allowed. We have to make it default. so we can implement


    // Not Allowed
//    void square(){
//
//    }


    // Default Method
     default void square(){
         System.out.println("this is an square - default method");
    }

    void circle(); // Abstract Method

    // Static Method
    static  void rectangle(){
        System.out.println("This is rectangle- static method");
    }

}

// Child Class

public class InterfaceDemo implements Shape
{

    // It became default method.
//    void circle(){
//        System.out.println("This is a circle -  abstract method");
//    }

    // Method in interface are public

    public void circle(){
        System.out.println("This is a circle -  abstract method");
    }

    void triangle(){
        System.out.println("This is a triangle - default method");
    }

    // 3 method are there in interfacedemo class.

    public static void main(String[] args) {

        // Scenario 1

        InterfaceDemo  interfaceDemo = new InterfaceDemo();
        interfaceDemo.circle(); // abstract method
        interfaceDemo.square(); // default method

        // Showing error because rectangle belongs to the interface but not directly created in the class.
        // We get it from shape interface

        // Using interface name. Like we use to access it by Class name.

        // Static can directly access from interface.
        Shape.rectangle();

        // Can access because this method is from child class
        interfaceDemo.triangle();


        // Scenario 2
        Shape shape = new InterfaceDemo(); // Create an object for class and class object is stored in a interface variable
        shape.circle();
        shape.square();
        Shape.rectangle();

//        Shape.triangle(); // No we can't access
    }
}
