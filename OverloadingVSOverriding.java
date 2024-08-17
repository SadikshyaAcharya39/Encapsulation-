
class ABC
{
    void m1(int x){
        System.out.println(x);
    }

    void m2( int y ){
        System.out.println(y);
    }
}

class XYZ extends ABC
{

    // Example of overriding
    void m1(int x){
        System.out.println(x*x);
    }

    // Overrided Method
    void m2( int y ){
        System.out.println(y*y);
    }

    // Overloading
    void m2(int a, int b){
        System.out.println(a + b);
    }
}

public class OverloadingVSOverriding {
    public static void main(String[] args) {
        XYZ xyz = new XYZ();
        xyz.m1(3);
        xyz.m2(1, 2);
        xyz.m2(8);

        // Overided method will be executed always like m1.
    }
}
