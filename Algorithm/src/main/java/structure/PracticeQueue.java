package structure;

import java.util.LinkedList;
import java.util.Queue;

public class PracticeQueue {

    // Queue Insert Method.
    private void queueInsert(Queue queue, int[] values) {
        System.out.println("# queueInsert method called");
        for(int value : values)
            queue.add(value);
        System.out.println("# queueInsert method ended");
    }

    // Queue Read Method.
    private void queueRead(Queue queue) {
        System.out.println("# queueRead method called");
        System.out.println("# first=" + queue.peek());
        System.out.println("# all=" + queue);
        System.out.println("# queueRead method ended");
    }

    // Queue Remove Method.
    private void queueRemove(Queue queue) {
        System.out.println("# queueRemove method called");
        queue.poll();
        System.out.println("# first element removed");
        queue.clear();
        System.out.println("# all elements removed");
        System.out.println("# queueRemove method ended");
    }

    public void queueAccess(int[] values) {
        // print start message
        System.out.println("##### QUEUE START #####");

        // queue creation process
        System.out.println("# queue type declared");
        Queue<Integer> queue = new LinkedList<>(); // in java, queue used with linkedlist.

        // call queueInsert method
        queueInsert(queue, values);

        // call queueRead method
        queueRead(queue);

        // call queueRemove method
        queueRemove(queue);

        // print end message
        System.out.println("##### QUEUE ENDED #####");
    }
}
