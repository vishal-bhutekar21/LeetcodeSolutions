package DSA.August6;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo {

    static Node head = null;

    // Print Linked List
    static void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Count Nodes
    static void countNodes() {
        int count = 0;

        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Nodes : " + count);
    }

    // Search
    static void search(int target) {
        Node temp = head;

        while (temp != null) {

            if (temp.data == target) {
                System.out.println(target + " Found");
                return;
            }

            temp = temp.next;
        }

        System.out.println(target + " Not Found");
    }

    // Insert at Beginning
    static void insertFirst(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }

    // Insert at End
    static void insertLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at Position (1-based)
    static void insertAtPosition(int position, int data) {

        if (position == 1) {
            insertFirst(data);
            return;
        }

        Node newNode = new Node(data);

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;

        temp.next = newNode;
    }

    // Update Value
    static void update(int oldValue, int newValue) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == oldValue) {
                temp.data = newValue;
                System.out.println("Updated Successfully");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Value Not Found");
    }

    // Delete First
    static void deleteFirst() {

        if (head == null) {
            return;
        }

        head = head.next;
    }

    // Delete Last
    static void deleteLast() {

        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Delete By Value
    static void deleteValue(int value) {

        if (head == null)
            return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value Not Found");
            return;
        }

        temp.next = temp.next.next;
    }

    public static void main(String[] args) {

        // Create 10 Nodes
        insertLast(10);
        insertLast(20);
        insertLast(30);
        insertLast(40);
        insertLast(50);
        insertLast(60);
        insertLast(70);
        insertLast(80);
        insertLast(90);
        insertLast(100);

        System.out.println("Original List");
        printList();

        System.out.println();

        countNodes();

        System.out.println();

        search(50);
        search(500);

        System.out.println();

        System.out.println("Insert 5 at Beginning");
        insertFirst(5);
        printList();

        System.out.println();

        System.out.println("Insert 110 at End");
        insertLast(110);
        printList();

        System.out.println();

        System.out.println("Insert 35 at Position 5");
        insertAtPosition(5, 35);
        printList();

        System.out.println();

        System.out.println("Update 70 to 700");
        update(70, 700);
        printList();

        System.out.println();

        System.out.println("Delete First");
        deleteFirst();
        printList();

        System.out.println();

        System.out.println("Delete Last");
        deleteLast();
        printList();

        System.out.println();

        System.out.println("Delete Value 50");
        deleteValue(50);
        printList();

        System.out.println();

        countNodes();
    }
}