
// Single Inheritance


// Parent Class
class A
{
//    int a = 100;

    // Assign through object
    int a;
    void display(){
        System.out.println(a);
    }
}

// Child Class of A
class B extends A
{

    // Assign through object
    int b;

//    int b = 10;
    void show(){
        System.out.println(b);
    }
}

// Multi Level Inheritance


// Child class of B
class C extends B
{

    // Assign through object
    int c;

//    int c = 33;
    void print(){
        System.out.println(c);
    }
}


public class InheritanceTypes {
    public static void main(String[] args) {
    // For Single Level Inheritance

//        B bobj = new B();
//
//        System.out.println(bobj.a);
//        System.out.println(bobj.b);
//
//    bobj.display();
//    bobj.show();


        // For Multi Level Inheritance

        C cObj = new C();
        cObj.a = 1;
        cObj.b = 2;
        cObj.c = 3;

        // Directly printing the value
//        System.out.println(cObj.a);
//        System.out.println(cObj.b);
//        System.out.println(cObj.c);

        cObj.display();
        cObj.show();
        cObj.print();
    }
}
