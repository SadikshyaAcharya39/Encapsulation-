
// UpCasting -  Converting value from smaller to larger.
// Example: int --> long


// DownCasting : Converting value from larger to smaller.
// Example: long --> int

public class TypeCastingConcept{
    public static void main(String[] args) {

        // Up casting: Automatic ----smaller to larger

//        int intValue = 100;
//        long longValue = intValue;
//        System.out.println(longValue);


        // Directly storing smaller value to larger value

//        float floatValue = 10.5F;  // we need to use a literal
//        double doubleValue = floatValue;
//        System.out.println(doubleValue);


        // Down Casting: Manually ---- Convert larger type to smaller type

        // Error

//        long longValue1 = 2000000000;
//        int intValue = longValue1;


        // Reducing the size so we write int manually

//        long longValue1 = 2000000000;

        // First converting into float then assigning the value to the variable
//        int intValue1 = (int) longValue1;

//        double doubleValue1 = 125.55;
//        float floatValue1 = (float) doubleValue1;

        // Example 1

//        int i = 100;
//        double d = i; // upcasting
//        System.out.println(d);

        // Example
        double d = 10.5;
        int i = (int) d; // downcasting
        System.out.println(i);

    }
}

