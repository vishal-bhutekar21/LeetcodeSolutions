package DSA.july27;

import java.util.*;

public class QueueExample {

    static void main(String[] args) {

        /*
         * ============================================
         * Queue using LinkedList (FIFO)
         * ============================================
         * FIFO = First In First Out
         *
         * Queue Interface Methods:
         * offer()  -> Insert element
         * poll()   -> Remove and return front element
         * peek()   -> Return front element without removing
         * remove() -> Removes front element (throws exception if empty)
         * element()-> Returns front element (throws exception if empty)
         */

        Queue<Integer> queue = new LinkedList<>();

        // Adding elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue after adding elements:");
        System.out.println(queue);

        // Front element
        System.out.println("\nFront element using peek(): " + queue.peek());

        // Remove front element
        System.out.println("Removed using poll(): " + queue.poll());

        System.out.println("Queue after poll():");
        System.out.println(queue);

        // Add multiple elements
        queue.addAll(Arrays.asList(12, 34, 2, 54, 25, 23, 4));

        System.out.println("\nQueue after addAll():");
        System.out.println(queue);



        /*
         * ============================================
         * Sorting a Queue
         * ============================================
         * Queue has NO sort() method.
         * Convert Queue -> List
         * Sort List
         * Rebuild Queue
         */

        List<Integer> list = new ArrayList<>(queue);

        Collections.sort(list);

        Queue<Integer> sortedQueue = new LinkedList<>(list);

        System.out.println("\nSorted Queue:");
        System.out.println(sortedQueue);



        /*
         * ============================================
         * PriorityQueue
         * ============================================
         *
         * PriorityQueue is NOT FIFO.
         *
         * By default:
         * Smallest element has highest priority.
         *
         * Internally implemented using a Min Heap.
         *
         * add()/offer() : O(log n)
         * poll()        : O(log n)
         * peek()        : O(1)
         */

        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(12);
        pq.offer(34);
        pq.offer(2);
        pq.offer(54);
        pq.offer(25);
        pq.offer(23);
        pq.offer(4);

        // Printing PriorityQueue directly
        // This is NOT guaranteed to be sorted.
        System.out.println("\nPriorityQueue:");
        System.out.println(pq);

        System.out.println("\nElements removed from PriorityQueue:");

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }



        /*
         * ============================================
         * Max Heap (Descending Priority)
         * ============================================
         */

        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.addAll(Arrays.asList(12, 34, 2, 54, 25, 23, 4));

        System.out.println("\n\nMax Heap:");

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }



        /*
         * ============================================
         * Queue Utility Methods
         * ============================================
         */

        Queue<Integer> q = new LinkedList<>();

        q.offer(100);
        q.offer(200);
        q.offer(300);

        System.out.println("\n\nUtility Methods");

        System.out.println("Queue : " + q);

        System.out.println("Size : " + q.size());

        System.out.println("Is Empty : " + q.isEmpty());

        System.out.println("Contains 200 : " + q.contains(200));

        System.out.println("Peek : " + q.peek());

        System.out.println("Poll : " + q.poll());

        System.out.println("After Poll : " + q);

        q.clear();

        System.out.println("After Clear : " + q);

        System.out.println("Is Empty : " + q.isEmpty());
    }
}