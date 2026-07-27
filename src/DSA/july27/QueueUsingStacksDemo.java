package DSA.july27;

import java.util.Stack;

class QueueUsingStack {

    private final Stack<Integer> in;
    private final Stack<Integer> out;

    public QueueUsingStack() {
        in = new Stack<>();
        out = new Stack<>();
    }

    // Add an element to the back of the queue
    public void push(int x) {
        in.push(x);
    }

    // Remove and return the front element
    public int pop() {
        moveIfNeeded();
        return out.pop();
    }

    // Return the front element without removing it
    public int peek() {
        moveIfNeeded();
        return out.peek();
    }

    // Check if the queue is empty
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    // Move elements from 'in' stack to 'out' stack only when needed
    private void moveIfNeeded() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }
}

public class QueueUsingStacksDemo {

    static void main(String[] args) {

        QueueUsingStack queue = new QueueUsingStack();

        System.out.println("Is Queue Empty? " + queue.empty());

        System.out.println("\nPushing Elements...");
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

        System.out.println("Front Element: " + queue.peek());

        System.out.println("\nRemoving Elements...");
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());

        System.out.println("\nFront Element: " + queue.peek());

        System.out.println("\nAdding More Elements...");
        queue.push(50);
        queue.push(60);

        System.out.println("\nRemoving Remaining Elements...");
        while (!queue.empty()) {
            System.out.println("Pop: " + queue.pop());
        }

        System.out.println("\nIs Queue Empty? " + queue.empty());
    }
}