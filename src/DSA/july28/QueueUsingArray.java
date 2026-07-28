package DSA.july28;

import java.util.Scanner;

public class QueueUsingArray {

    // ANSI Color Codes
    static final String RESET = "\u001B[0m";
    static final String BLACK = "\u001B[30m";
    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
    static final String PURPLE = "\u001B[35m";
    static final String CYAN = "\u001B[36m";
    static final String WHITE = "\u001B[37m";
    static final String BOLD = "\u001B[1m";
    static int[] arr;
    static int rear = -1;
    static int front = 0;

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(BLUE + BOLD);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║         QUEUE USING ARRAY           ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.print(RESET + CYAN + "Enter Queue Size : " + RESET);

        int n = scanner.nextInt();
        arr = new int[n];

        while (true) {

            System.out.println("\n" + PURPLE + "════════════ MENU ════════════" + RESET);
            System.out.println(GREEN + "1." + RESET + " Enqueue");
            System.out.println(YELLOW + "2." + RESET + " Dequeue");
            System.out.println(BLUE + "3." + RESET + " Peek");
            System.out.println(CYAN + "4." + RESET + " Is Empty");
            System.out.println(WHITE + "5." + RESET + " Remove All");
            System.out.println(RED + "X." + RESET + " Exit");
            System.out.println(PURPLE + "══════════════════════════════" + RESET);

            System.out.print(BOLD + "Enter Choice : " + RESET);

            String choice = scanner.next();

            switch (choice.toUpperCase()) {

                case "1":
                    System.out.print(CYAN + "Enter Element : " + RESET);
                    int data = scanner.nextInt();
                    enqueue(data);
                    break;

                case "2":
                    dequeue();
                    break;

                case "3":
                    peak();
                    break;

                case "4":
                    if (isEmpty()) {
                        System.out.println(RED + "Queue is Empty." + RESET);
                    } else {
                        System.out.println(GREEN + "Queue is Not Empty." + RESET);
                    }
                    break;

                case "5":
                    removeall();
                    break;

                case "X":
                    System.out.println(RED + "\nThank you for using Queue Program!" + RESET);
                    scanner.close();
                    return;

                default:
                    System.out.println(RED + "Invalid Choice! Try Again." + RESET);
            }
        }
    }

    static void enqueue(int n) {

        if (isFull()) {
            System.out.println(RED + "Queue is Full!" + RESET);
            return;
        }

        rear++;
        arr[rear] = n;

        System.out.println(GREEN + "Element " + n + " inserted successfully." + RESET);
    }

    static void dequeue() {

        if (isEmpty()) {
            System.out.println(RED + "Queue is Empty!" + RESET);
        } else {
            System.out.println(YELLOW + "Removed : " + arr[front] + RESET);
            front++;
        }
    }

    static boolean isEmpty() {
        return front > rear;
    }

    static boolean isFull() {
        return rear == arr.length - 1;
    }

    static void peak() {

        if (isEmpty()) {
            System.out.println(RED + "Queue is Empty!" + RESET);
        } else {

            System.out.println(BLUE + "Front : " + arr[front] + RESET);
            System.out.println(BLUE + "Rear  : " + arr[rear] + RESET);
        }
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    static void removeall() {

        if (isEmpty()) {
            System.out.println(RED + "Queue is Empty!" + RESET);
        } else {

            front = 0;
            rear = -1;

            System.out.println(GREEN + "All elements removed successfully." + RESET);
        }
    }
}