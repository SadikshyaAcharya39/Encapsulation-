//import java.util.Scanner;
//
public class RevisingFromTheStart
{
    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter your name: ");
////
////        // There is a huge difference between Next and nextLine.
////        // Next will take only one input where as next line will take two inputs from the user.
////        String name = sc.nextLine();
////        System.out.println("Your name is " + name);
//
//
//        // Primitive Data Type   // Directly stored in a stack
//
//        int x = 10;
//        int y = x;
//
//        // Changes does not affect the original value when changes are made in copied variable
//        System.out.println("Value of x is : " + x + "  " +  "Value of y is: " + y);
//
//        // When copied
//
//        // Two different variables are created along with different parameters even though there values are same.
//        y = 3;
//        System.out.println("Value of X is: " + x + "  " + " Y is : " +  y);
//
//        // Primitive data types does not have default value
//
//        // Non - Primitive Data Type
//
//        // When copied
//        int[] a = { 2, 3, 4, 5 , 6};
//
//        // Original value is stored in a heap.
//        // Reference variable a is stored in a stack
//
//        // Two reference variables are created but both are pointing to the same object.
//        int[] b = a;
//
//        // Changes affect the original value when changes are made in copied variable
//        a[1] = 1;
//
//
//        // Default value of non - primitive type is always zero.
//        for(int value1: a){
//            System.out.print(value1 + " , ");
//        }
//
//        System.out.println();
//        for(int value2: b){
//            System.out.print(value2 + " , ");
//        }


        // String Reverse

//        String s = "Sadikshya";
//        for(int i = s.length() - 1; i >= 0; i-- ){
//            System.out.println(s.charAt(i));
//        }

//        StringBuilder sb = new StringBuilder("Sadikshya");
//        System.out.println(sb.reverse());

//            String s = "Sadikshya/Acharya";
//            String splittedValue[] = s.split("/", 9);
//            for(String splitted: splittedValue){
//                System.out.println(splitted);
//            }

//        String value[] = {"Sadikshya", "Acharya"};
//        String joiningString = String.join(" ", value);
//        System.out.println(joiningString);
//
//        String s1 = "Sadikshya";
//        String s2 = "Acharya";
////        String joinedValue = String.join(" ", s1, s2);
//        System.out.println(String.join(" ", s1, s2));


//        String s1 = "Sadikshya Acharya";
//        String formattedString = String.format("What's your name? , %s " , s1);
//        System.out.println(formattedString);


//        String s1 = "I'm from \"Nepal\" ";
//        System.out.println(s1);

//        String s1 = "Let\'s dance together";
//        System.out.println(s1);

//        String s1 = "Nepal";
//        String s2 = "Nepal";
//        System.out.println(s1.equals(s2));  // true
//        System.out.println(s1 == s2);   // true
//
//        String string1 = new String("Nepal");
//        String string2 = new String("Nepal");
//        System.out.println(string1 == string2); // false
//        System.out.println(string1.equals(string2) ); //true

//        String name = "SadikshyaAcharyaisagoodgirl";
//        System.out.println(name.substring(-1));

//        String value = "abc123@gmail.com";
//        String split1[] = value.split(1, 3);


//         Converting string to char array type

        String name = "Sadikshya";
        String rev = "";
        char a[] = name.toCharArray();

        // To Char Array is a method, it will convert enter thing into character array

        for(int i = a.length - 1; i >= 0; i--) {
            rev = rev + a[i];
        }
        System.out.println(rev);
    }
}
