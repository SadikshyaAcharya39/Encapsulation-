import java.util.Scanner;

public class HandleExceptions {
    public static void main(String[] args) {
        // Example 1
        // Arithmetic Exception because input is 0.

        System.out.println("program is started...");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int input1 = sc.nextInt(); // This may throw exception

        try
        {
            System.out.println(100/input1);
        }

        // e is the object
        catch (ArithmeticException e){
            System.out.println("Invalid Data");
        }

        System.out.println("Program is completed...");
        System.out.println("Program is exited...");

    }
}
