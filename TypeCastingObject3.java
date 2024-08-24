
// A b = (c) d;

public class TypeCastingObject3
{
    public static void main(String[] args) {

        // Example 1
//       Object o = new String("Welcome");
//       StringBuffer sb = (StringBuffer) o; // Rule 1 is satisfied. rule 2 - yes, rule 3: failed

        // because object is the root class pf all classes like string buffer

        // The underlying object of string is what? String but  reference we are using is String buffer. But there is no relation between string and string buffer.


        // Example 2:
//        String s = new String("Welcome");
//        StringBuffer sb = (StringBuffer) s;  // rule 1 - no

        // Because no relation between c and d. means String and StringBuffer


        // Example 3:
//        Object o = new String("Welcome");
//        // String is a child class of object
//
//        StringBuffer sb = (StringBuffer) o; // rule 1 : yes, rule 2 : yes, rule 3 : not

        // Example 4
//        Object o = new String("Welcome");
//        StringBuffer sb = (String) o; // rule 1 : yes, rule 2: no, rule 3: yes


        // Example 5:
//        String s = new String("Welcome");
//        StringBuffer sb = (String) s; // Rule 1: yes, rule 2: failed

        // // because string string same. for rule no 1 to pass

// Example 6:
//Object o = new String("Welcome");
//StringBuffer sb = (StringBuffer) o;  // rule 1: pass, rule 2: pass, rule 3: failed

// Example 7:
        Object o = new String("Welcome");
        String s = (String) o; // rule 1: yes, rule 2: yes, rule 3: yes
        System.out.println(s);
    }
}
