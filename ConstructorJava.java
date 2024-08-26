public class ConstructorJava {

//    int x ;

//
//    public ConstructorJava(){
//        x = 3;
//    }
//
//    public static void main(String[] args) {
//        ConstructorJava constructorJava = new ConstructorJava();
//        System.out.println(constructorJava.x);
//
//    }

    // Constructor Parameters

//    public ConstructorJava(int num1, int num2){
//        System.out.println(num1 + num2);
//    }
//
//    public static void main(String[] args) {
//        ConstructorJava constructorJava = new ConstructorJava(3 , 3);
//
//    }

    // Constructor Parameters


//    String firstName ;
//    String lastName ;
//    int age ;
//
//    public ConstructorJava(String firstName, String lastName, int age){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }
//
//    public static void main(String[] args) {
//
//        ConstructorJava constructorJava = new ConstructorJava("Sadikshya", "Acharya", 20);
//        System.out.println("Full Name: " + constructorJava.firstName + " " + constructorJava.lastName + "   Age :  " + constructorJava.age);

//        ConstructorJava constructorJava = new ConstructorJava("Sadikshya", "Acharya", 20);
//        System.out.println("Full Name: " + constructorJava.firstName + " " + constructorJava.lastName + "   Age :  " + constructorJava.age);
//    }


    String fullName = "Sadikshya Acharya";
    int age = 20;
    String university = "PCPS";

    public ConstructorJava(String name, int myAge, String uni){
        fullName = name;
        age = myAge;
        university = uni;
    }

    public static void main(String[] args) {
        ConstructorJava constructorJava = new ConstructorJava("Sadikshya Acharya", 20, "PCPS");
        System.out.println("Name : " + constructorJava.fullName + " Age: " + constructorJava.age + " " + " University: " + constructorJava.university);

    }




}
