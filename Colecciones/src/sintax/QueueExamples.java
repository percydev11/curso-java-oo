package sintax;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

    public static void main(String[] args) {

        //Create a Queue
        Queue queueA = new LinkedList();
        Queue queueB = new PriorityQueue();

        Queue<String> queue = new LinkedList<>();

        //Add elements to Queue
        queue.add("Element1");
        queue.add("Element 2");


        //Iterate all elements in Queue

        //Access via Iterator
        System.out.println("Iterate via Iterator");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
           // System.out.println(element);
        }

        //Access via  foreach-loop
        System.out.println("Iterate via foreach loop");
        for (String element : queue) {
            //System.out.println(element);
        }


        //Remove first element of queue
        String element1 = queue.poll();

        String element2 = queue.remove();


    }
}
