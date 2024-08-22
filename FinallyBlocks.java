public class FinallyBlocks {
    public static void main(String[] args) {
//        String s = null;

        String s = "welcome";
        try
        {
            System.out.println(s.length());
        }

//        catch (NullPointerException e) {
//            System.out.println("Catch block Handled Exception");
//            System.out.println(e.getMessage());
//        }

        catch (NumberFormatException e) {
            System.out.println("Catch block Handled Exception");
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("You entered in finally block");
        }

        System.out.println("Program finished");
    }
}
