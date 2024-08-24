import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        // Declaration
//      1.   Map map = new HashMap();
//      2. HashMap hashMap = new HashMap();

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // Adding element
        hm.put(101, "John");
        hm.put(102, "Henry");
        hm.put(103, "Mony");
        System.out.println(hm);  // This bracket is sending values in List
        System.out.println(hm.size());

        // Remove one pair
//        hm.remove(101);
//        System.out.println(hm);

        // Retrieve values of particular key
        System.out.println(hm.get(101));

        // Get all the keys from HashMap
        System.out.println(hm.keySet());

        // Get all the values
        System.out.println(hm.values());

        // Get keys along with the values
        System.out.println(hm.entrySet());  // Gives output in Set


        // Using enhanced for loop

        // Preferred One

//        for(int a: hm.keySet())
//        {
//            System.out.println(a + "  " + hm.get(a));
//        }

        // Using Iterator

//        Iterator it =  // Error
        // hm.Iterator();

        Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator();
        while(it.hasNext()){

            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + entry.getValue());


//            System.out.println(it.next());

            // this will return an entry set

            // hm.entry set contains everything. keys and values. When it is storing this in it, the type of this  iterator is what? Iterator. Iterator contains Integer and String
            // hasNext focus on first pair.
        }






    }
}
