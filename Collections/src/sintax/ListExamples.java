package sintax;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* List an ordered collection of objects
 * I can access the elements in the order they occur in the list*/

public class ListExamples {

    public static void main(String[] args) {

        //Create a List
        //No generic type specified
        List myList = new ArrayList();

        //Insert elements in a List
        myList.add("Object 1");
        myList.add("Object 2");
        myList.add("Object 3");

        //Remove elements in a List
        myList.remove(2);

        //Get a element
        //System.out.println(myList.get(0));
        Object o = myList.get(0);
        String firstObject = (String) myList.get(0);
       //System.out.println(firstObject);

        //Obtain size of a list
        int size = myList.size();
        //System.out.println(size);

        //Iterate in a List
        Iterator iterator = myList.iterator();

        //First option - while loop
        while (iterator.hasNext()){
            Object next = iterator.next();
            //System.out.println(next);
        }

        //Second option - foreach loop
        for(Object next: myList){
            //System.out.println(next);
        }
        
        //Third option - traditional for loop
        for (int i = 0; i < myList.size(); i++) {
            //System.out.println(i);
            //System.out.println(myList.get(i));

            //Object next = myList.get(i);
           //System.out.println(next);
            
        }

        //Clear list - remove all elements
        myList.clear();

        myList.add(new Integer((3)));

        for(Object next: myList){
            //System.out.println(next);
        }

        //Create list - with generic type specified
        List<String> myList2 = new ArrayList<String>();

        //Insert elements
        myList2.add(new String(("3")));
        myList2.add(new String("11"));
        myList2.add("Object v");

        //Iterate
        Iterator<String> iterator2 = myList2.iterator();
        while (iterator2.hasNext()){
            String next = iterator2.next();
           // System.out.println(next);
        }

        for (String next: myList2) {
            System.out.println(next);
        }
    }
}
