
import java.util.Arrays;

public class ArraysSorting {
    public static void main(String[] args) {
//        String name[] = {"Sadikshya", "Acharya", "Amir", "Amshu", "Anshu", "Shraddha", "Narayani", "Amit", "Sarala", "Subin", "Sumit"};
//        System.out.println(name[1]);
//        name[2] = "Amir";
//        System.out.println(name[2]);

//        for(int i = 0; i <= name.length - 1; i++){
//            System.out.println(name[i]);
//        }

//        for(String names: name){
//            System.out.println(names);
//        }

//        for(int i = name.length - 1; i >= 0; i--){
//            System.out.println(name[i]);
//        }

        // Sorting An Array
        String s[] = {"scott", "marry", "john", "david"};
        System.out.println("Before Sorting: " + Arrays.toString(s));

        Arrays.sort(s);
        System.out.println("After sorting: " + Arrays.toString(s));
    }
}
