package company.concurrency;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
    }

    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();


        /*
        *   When have the for loop and new Thread with new Runnable Currency
        *  tasks will run asynchronous.
        * */


        Thread stack_ = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    stack.push("x");
                }
            }
        });

        Thread pop_ = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    stack.pop();
                }
            }
        });
        stack_.start();
        pop_.start();
        try {
            stack_.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            pop_.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}