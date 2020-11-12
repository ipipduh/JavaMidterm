package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<String> queue = new PriorityQueue<>();
        queue.add("Scotland");
        queue.add("France");
        queue.add("Ireland");
        queue.add("Poland");
        queue.add("Ukraine");

        System.out.println(queue.peek()); //TO PEEK A SINGLE VALUE

        System.out.println(queue.remove("France")); // TO REMOVE A VALUE - BAI FRANCE

        System.out.println("retrieve value using for Each loop: "); // RETRIEVING VALUE VIA FOR-EACH LOOP
        for (String countries : queue) {
            System.out.println(countries);
        }
        System.out.println(queue.poll()); // POLL RETRIEVE AND REMOVE THE HEAD OF QUEUE

        Iterator value = queue.iterator(); //RETRIEVE VALUE USING ITERATOR WHILE LOOP
        System.out.println("retrieve value using iterator: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }

}
