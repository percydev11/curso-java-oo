package sintax;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeExamples {

    public static void main(String[] args) {

        //Create a Deque
        Deque deque = new LinkedList();

        Deque deque1 = new ArrayDeque();

        Deque<String> deque2 = new LinkedList<>();

        /*Add element to Deque
         * Options: add() - addLast() - addFirst()
         * offer() - offerFist() - offerLast() */

        deque2.add("Element 1");
        deque2.addLast("Element 10");
        deque2.addFirst("Element 0");
        deque2.offer("Element offer");


        /*Iterate Elements of Deque
         *Options: Iterator - Foreach loop
         */

        Iterator<String> iterator = deque2.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

    }
}
