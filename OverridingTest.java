public class OverridingTest {
    int x = 3;

    public static void main(String[] args) {
        OverridingTest overridingTest = new OverridingTest();
        overridingTest.x = 44;
        System.out.println(overridingTest.x);
    }
}
