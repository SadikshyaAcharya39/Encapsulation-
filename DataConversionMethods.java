public class DataConversionMethods {
    public static void main(String[] args) {

        String x = "100";
        System.out.println(Integer.parseInt(x));
        System.out.println(x);

//        // String --> int
//        String s = "Welcome";
//        int sint = Integer.parseInt(s);


        String s1 = "10";
        String s2 = "20";
        System.out.println(s1 + s2);

        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

        String s3 = "10.3";
        System.out.println(Double.parseDouble(s3));

        float floatNum = Float.parseFloat(s3);
        System.out.println(floatNum);


        String s4 = "Welcome";  //Cannot convert from string to boolean only possible if True and False is there is string.
        System.out.println(Boolean.parseBoolean(s4));


        // Other than true, if we pass any string that will return false.
        String s5 = "true";
        System.out.println(Boolean.parseBoolean(s5));


        // Opposite Way Scenario - 2
        // int, double, boolean, char ----> String     TARGET TYPE IS STRING


        // Multiple methods we can use, so this is a overloading
        int a = 10;
        double d = 10.5;
        char c = 'C';
        boolean bool = false;
        String s6 = String.valueOf(a);
        System.out.println(s6);
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(c));




    }
}
