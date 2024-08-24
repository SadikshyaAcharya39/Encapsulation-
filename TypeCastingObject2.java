

//      Cats ct = (Cats) an;
//       A    B     C     D

// A is class, B is a variable, C is a class, D is also a variable


// Empty Classes
class Animals {}

class Dogs extends Animals{}
class Cats extends Animals{}

public class TypeCastingObject2
{
    public static void main(String[] args) {

        // Rule 1:  Conversion is valid or not
        // The type of 'd' and 'c' must have some relationship ( either parent to child or child to parent)

//        Animals an = new Dogs();
//        Cats ct = (Cats) an;    // valid as per Rule 1

//        Dogs dogs = new Dogs();
//        Cats ct = (Cats) dogs;  // invalid as per Rule 1


        // Rule 2: assignment is valid or not
        // 'C' must be either same or child of 'A'

//        Animals an = new Dogs();
//        Cats ct = (Cats) an;  // this will return a cats object.
        // Valid both rule of rule 2 is valid


        // Rule 1 is valid but rule 2 is not valid. Type is mismatched.

//        Animals an = new Dogs();
//        Cats ct = (Dog) an;  // invalid as per rule 2

        // Rule 3:

        // The underlying object type of 'd' must be either same or child of 'c'.

        // When we run this, we will get an error.

//        Animals an = new Dogs();
//        Cats ct = (Cats) an; // not valid acc to rule 3


        // Combining all rules
        Animals an = new Dogs();
        Dogs dg = (Dogs) an;  // rule 1 - yes,  rule 2 - yes, rule 3: yes


    }
}
