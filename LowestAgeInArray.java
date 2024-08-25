public class LowestAgeInArray {
    public static void main(String[] args) {
        int[] ages = {2, 6, 3, 1};

//        int lowestAge = ages[0];
//
//        for(int age: ages){
//            lowestAge = ages[0];
//            if(age < lowestAge){
//                lowestAge = age;
//            }
//        }
//        System.out.println("Lowest Age: " + lowestAge);

        int sum = 0;
        int length = ages.length;

        for(int age: ages){
            sum = sum + age;
        }
        float average = sum/length;
        System.out.println(average);
    }
}
