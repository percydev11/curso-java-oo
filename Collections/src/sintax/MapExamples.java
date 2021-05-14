package sintax;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class MapExamples {

    public static void main(String[] args) {

        //Creating a Map of various types
        Map hashMapA = new HashMap();

        Map<String, String> hashMapB = new HashMap<>();

        Map<String, String> hashtable = new Hashtable<>();

        Map<String, String> hashSet = new TreeMap<>();

        Map<String, String> concurrentMap = new ConcurrentHashMap<>();

        SortedMap sortedMap = new TreeMap();


        //Inserting elements into a Java Map

        hashMapA.put("key a", 1234);
        hashMapA.put("key b", 1235);
        hashMapA.put("key c", 1236);

        hashMapB.put("key1", "element 1");
        hashMapB.put("key2", "element 2");
        hashMapB.put("key3", "element 3");
        hashMapB.put("key4", String.valueOf(123));

        //Get elements from a Java Map
        Object element1 = (Object) hashMapA.get("key a");
        System.out.println(element1);


        String element2 = (String) hashMapB.get("key4");
        System.out.println(element2);

        /*Iterating the keys of a Java Map
         * Options: key iterator - foreach loop - stream*/

        //Using key iterator
        System.out.println("Iterating with key iterator");
        Iterator iterator = hashMapA.keySet().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = hashMapA.get(key);
            System.out.println(value);
        }


        Iterator iterator2 = hashMapB.keySet().iterator();
        while (iterator2.hasNext()) {
            Object key = iterator2.next();
            Object value = hashMapB.get(key);
            System.out.println(value);
        }

        //Using a Key foreach loop
        System.out.println("Iterating with a foreach loop");
        for (Object key : hashMapB.keySet()) {
            Object value = hashMapB.get(key);
            System.out.println(value);
        }

        //Using a value stream
        System.out.println("Iterating with a value stream");
        Stream<String> stream = hashMapB.values().stream();
        stream.forEach((value) -> {
            System.out.println(value);
        });


    }
}
