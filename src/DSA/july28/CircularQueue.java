package DSA.july28;

import java.util.Scanner;

public class CircularQueue {

    static int[] arr;
    static int front = -1;
    static int rear = -1;

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Queue Size: ");
        int size = sc.nextInt();

        arr = new int[size];

        while (true) {

            System.out.println("\n====== Circular Queue Menu ======");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Is Empty");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Element : ");
                    int value = sc.nextInt();
                    enqueue(value);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    if (isEmpty())
                        System.out.println("Queue is Empty");
                    else
                        System.out.println("Queue is Not Empty");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    // Insert element
    static void enqueue(int value) {

        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        // First element
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % arr.length;
        }

        arr[rear] = value;
        System.out.println(value + " inserted.");
    }

    // Remove element
    static void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(arr[front] + " removed.");

        // Only one element
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }
    }

    // Show front element
    static void peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front Element : " + arr[front]);
    }

    // Display queue
    static void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue : ");

        int i = front;

        while (true) {

            System.out.print(arr[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % arr.length;
        }

        System.out.println();
    }

    // Queue empty?
    static boolean isEmpty() {
        return front == -1;
    }

    // Queue full?
    static boolean isFull() {
        return (rear + 1) % arr.length == front;
    }
}