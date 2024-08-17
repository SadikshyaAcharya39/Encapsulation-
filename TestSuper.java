public class TestSuper {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayColour(); // Brown but after super it will print white

        // To get the old value from child class

        dog.eating(); // Before using super, it will print the value of overriden method

    }
}
