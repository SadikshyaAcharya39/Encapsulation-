class FinalMethod1
{
    final void m(){
        System.out.println("This is a method from Test 1...");
    }
}


class FinalMethod2 extends FinalMethod1
{

    /*

    // Override
    void m(){ // Incorrect because m is a final method in parent class
        System.out.println("This is a method from test2 class...");
    }

    */

    // But we can overload even after making a method final
    void m(int a){
        System.out.println(a);
    }


}



public class FinalKeywordMethod {
    public static void main(String[] args) {

    }
}
