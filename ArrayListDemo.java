
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Declaration
//        1. ArrayList myList = new ArrayList();
        // myList is a reference variable


//        2. List myList = new ArrayList();
        // child class object we can hold from parent class.


//        3. ArrayList<Integer> myList = new ArrayList<Integer>();


        // Adding data into ArrayList

        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(true);
        arrayList.add("Sadikshya");
        arrayList.add('A');
        arrayList.add(20.5);
        arrayList.add(20.5);
        arrayList.add(null);
        arrayList.add(null);

        // To find a size of an array List
        System.out.println(arrayList.size());

        // Printing data from array list
        System.out.println(arrayList);

        // To remove an element from array list
//        arrayList.remove(4);
//        System.out.println("After Removing: " + arrayList);

        // Insert some values between
//        arrayList.add(2,333);
//        System.out.println(arrayList);


        // But i want to replace that 333 with some other values then what to do?

        // Modify element in the arraylist or replacement or change
//        arrayList.set(2, "Python");

        // Access specific element
//        System.out.println(arrayList.get(2));

        // Reading all the elements from ArrayList

        // 3 ways

        // 1. Using normal for loop

//        for(int i = 0; i <= arrayList.size() - 1; i++){
//            System.out.println(arrayList.get(i));
//        }

        // 2. Using for each loop

//        for( Object values: arrayList){
//            System.out.println(values);
//        }

        // 3. Using Iterator

        Iterator it = arrayList.iterator();
        // that will return iterator type of object

        while(it.hasNext()){ // this will check if the first element is present or not. If this becames true then will go inside while statement
            System.out.println(it.next());
        }

//        System.out.println(it.next());  // print 1st element

        // Checking if arraylist is empty or not
        System.out.println(arrayList.isEmpty());

        // Remove all elements from arrayList
        ArrayList myList2 = new ArrayList();
        myList2.add('A');
        myList2.add(100);

        arrayList.removeAll(myList2);
        System.out.println(arrayList);


        // It will create a arrayList empty.

        arrayList.clear();
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());

    }
}
