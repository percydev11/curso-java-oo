package sintax;

import java.util.*;
import java.util.stream.Stream;

public class SetExamples {

    public static void main(String[] args) {

        //---------Create a set------------/

        //HashSet
        Set setHas = new HashSet();


        //TreeSet
        Set setTree = new TreeSet();

        //LinkedHashSet
        Set setLinkHash = new LinkedHashSet();

        Set<String> set3 = new HashSet<>();

        //---------Insert elements-----------/

        // In a HashSet
        set3.add("Hello");
        set3.add("Element A");
        set3.add("Element B");
        set3.add("Element C");

        setHas.add(2);
        setHas.add(11);
        setHas.add(7);

        //In a TreeSet
        setTree.add(24);
        setTree.add(45);
        setTree.add(48);


        //In a LinkedHashSet
        setLinkHash.add("Apple");
        setLinkHash.add("Pinneaple");
        setLinkHash.add("Banana");
        setLinkHash.add(29);
        setLinkHash.add(19);

        //----------Iterate Set elements---------/

        //First option - using Iterator  obtained from the Set
        Iterator<String> iterator = set3.iterator();

        //In a hashSet
        System.out.println("Iterating in a HashSet with while loop");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


        //In a LinkedHashSet
        System.out.println("Iterating in a LinkedHashSet with a while loop");
        Iterator<Object> iteratorLinkHS = setLinkHash.iterator();
        while (iteratorLinkHS.hasNext()) {
            Object element = (Object) iteratorLinkHS.next();
            System.out.println(element);
        }

        //Second option - using foreach loop
        System.out.println("Iterating in a HashSet with foreach loop");
        for (Object object : setHas) {
            int element = (int) object;
            System.out.println(element);
        }


        //In a TreeSet
        System.out.println("Iterating in a TreeSet with a foreach loop");
        for (Object object : setTree) {
            int element = (int) object;
            System.out.println(element);
        }

        System.out.println("Iterating in a LinkedHashSet with a foreach loop");
        for (Object object : setLinkHash) {
            Object element = (Object) object;
            System.out.println(element);
        }


        //Third option - Iterate Set Using the Java Stream API

        //In a HashSet
        System.out.println("Iterating with Java Stream");
        Stream<String> streamHashS = set3.stream();

        streamHashS.forEach((element) ->
        {
            System.out.println(element);
        });


        //-------Remove elements from set -----------/
        set3.remove(3);

    }

}
