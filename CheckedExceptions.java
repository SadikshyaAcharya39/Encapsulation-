import java.io.FileInputStream;

public class CheckedExceptions {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("program started");
        System.out.println("program in progress....");

        Thread.sleep(5000);

        // This line will open the file.

//        FileInputStream fis = new FileInputStream("location of file");

//        try {
//
//            Thread.sleep(5000);
//        }
//        catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }

        System.out.println("program finished");
        System.out.println("program exited...");
    }
}
