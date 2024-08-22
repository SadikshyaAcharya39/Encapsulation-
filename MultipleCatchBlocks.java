public class MultipleCatchBlocks {
    public static void main(String[] args) {

        System.out.println("program is started...");

        String s1 = null;
        try {
            System.out.println(s1.length());
        }

//        catch (ArithmeticException e)
//        {
//            System.out.println("Handled Exception");
//            System.out.println(e.getMessage());
//        }
//
//        catch (NullPointerException e){
//
//            System.out.println("Handled Exception");
//            System.out.println(e.getMessage());
//        }
//
//        catch (NumberFormatException e)
//        {
//            System.out.println("Handled Exception");
//            System.out.println(e.getMessage());
//        }

        catch (Exception e){

            System.out.println("Handled Exception");
            System.out.println(e.getMessage());
        }

        System.out.println("Program is finished...");
//        System.out.println("Program is completed...");
//        System.out.println("Program is exited...");
    }
}
