package Collection;
// its FIFO -first in first out
//element add by using offer()

import java.util.LinkedList;
import java.util.Queue;

//element remove by using poll().

public class QueuesExample {

    public static void main(String[]args){
        
        Queue<String>customerQueue = new LinkedList<>();

        customerQueue.offer("customer1");
        customerQueue.offer("customer2");
        customerQueue.offer("customer3");

        System.out.println("customer queue: " + customerQueue);

        System.out.println("Servered Customer: " + customerQueue.poll());

    }
}
    
   
