public class Animal
{
    String colour = "White";

    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    // Override the variable value

    String colour = "Brown";

//    void displayColour(){
//        System.out.println(colour);
//    }

    void displayColour(){
        System.out.println(super.colour);
    }

    // Overriding
//    void eating(){
//        System.out.println("Eating bread");
//    }

    void eating(){
//        System.out.println("Eating bread");
        super.eat();
    }
}


