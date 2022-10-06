package structure;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PracticeStack {

    // Stack Insert Method.
    private void stackInsert(Stack stack, int[] values) {
        for(int value : values)
            stack.push(value);
    }

    // Stack Read Method.
    private void stackRead(Stack stack) {
        System.out.print("RESULT: ");
        // read first stack.
        System.out.print("FIRST[" + stack.firstElement() + "], ");
        // read last stack.
        System.out.print("LAST[" + stack.lastElement() + "], ");
        // read stack all.
        Iterator iterator = stack.iterator();
        System.out.print("ALL");
        while(iterator.hasNext())
            System.out.print("[" + iterator.next() + "]");
        System.out.println(".");
    }

    // Stack Remove Method.
    private void stackRemove(Stack stack) {
        System.out.print("RESULT: ");
        // remove stack once.
        System.out.println("DELETE[" + stack.pop() + "]");
        // remove all stacks.
        stack.clear();
    }

    // Stack Public Method.
    public void stackAccess(int[] values) {
        System.out.println("##### STACK START #####");
        // stack creation process.
        System.out.println("SYSTEM: Stack Creation Process..");
        Stack<Integer> stack = new Stack<>(); // int type stack declaration.
        System.out.println("SYSTEM: Stack Creation Complete..");

        // call stackInsert Method.
        System.out.println("SYSTEM: Stack Insert Process..");
        stackInsert(stack, values);
        System.out.println("SYSTEM: Stack Insert Complete..");

        // call stackRead Method.
        System.out.println("SYSTEM: Stack Read Process..");
        stackRead(stack);
        System.out.println("SYSTEM: Stack Read Complete..");

        // call stackRemove Method.
        System.out.println("SYSTEM: Stack Remove Process..");
        stackRemove(stack);
        System.out.println("SYSTEM: Stack Remove Complete..");
        System.out.println("##### STACK QUIT #####");
    }

}
