package structure;

import java.util.Iterator;
import java.util.Stack;

public class PracticeStack {

    // Stack Insert Method.
    private void stackInsert(Stack stack, int[] values) {
        System.out.println("# stackInsert method called");
        for(int value : values)
            stack.push(value);
        System.out.println("# stackInsert method ended");
    }

    // Stack Read Method.
    private void stackRead(Stack stack) {
        System.out.println("# stackRead method called");

        // print first & last elements.
        System.out.println("# first=" + stack.firstElement());
        System.out.println("# last=" + stack.lastElement());

        // print all elements.
        Iterator iterator = stack.iterator();
        System.out.println("# all=");
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println("# stackRead method ended");
    }

    // Stack Remove Method.
    private void stackRemove(Stack stack) {
        System.out.println("# stackRemove method called");
        stack.pop();
        System.out.println("# last element removed");
        stack.clear();
        System.out.println("# all elements removed");
        System.out.println("# stackRemove method ended");
    }

    // Stack Public Method.
    public void stackAccess(int[] values) {
        // print start message
        System.out.println("##### STACK START #####");

        // stack creation process
        System.out.println("# stack type declared");
        Stack<Integer> stack = new Stack<>(); // int type stack declaration.

        // call stackInsert method
        stackInsert(stack, values);

        // call stackRead method
        stackRead(stack);

        // call stackRemove method
        stackRemove(stack);

        // print end message
        System.out.println("##### STACK ENDED #####");
    }

}
