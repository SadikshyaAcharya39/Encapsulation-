import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        // Declaration

        // Allows heterogeneous data
        // HashSet mySet = new HashSet();


        // It is also correct. Set is a parent class variable.
//        Set set = new HashSet();

        // Homogeneous because we mention string data type there.

        HashSet hashSet = new HashSet();

        // Adding elements into HashSet

        hashSet.add("Sadikshya");
        hashSet.add("Sadikshya");
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add('A');
        hashSet.add(100);
        hashSet.add(11.11);

        // Printing HashSet
        System.out.println(hashSet);

        // Remove specific element from the Set.
        hashSet.remove("Sadikshya");
        System.out.println(hashSet);

        // Inserting elements is not possible in Hashing.

        // Accessing  specifc element - Not Possible

        // Can convert from set to ArrayList

        // Convert HashSet to ArrayList

        // Cannot directly access it from HashSet

//        ArrayList arrayList = new ArrayList(hashSet);
//        System.out.println(arrayList);
//        System.out.println(arrayList.get(2));


        // Read all elements using for each loop
//         for(Object hashSets: hashSet){
//             System.out.println(hashSets);
//         }

         // Using Iterator

        // It should be iterator type of variable
//        Iterator iterator = hashSet.iterator();
//         while(iterator.hasNext()){
//             System.out.println(iterator.next());
//         }

        hashSet.contains("Sadikshya");
        hashSet.clear();
        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty());

        System.out.println(hashSet.size());
    }
}
