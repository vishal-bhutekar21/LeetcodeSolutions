package DSA.july21;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

// Stack follows LIFO (Last In First Out)

class Solution {

    public void printStack(Stack<Character> st) {
        if (st.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println(st);
    }
}

public class stackrevision {

    public static void main(String[] args) {

        Stack<Character> s = new Stack<>();
        Solution sol = new Solution();

        // ================= PUSH =================
        System.out.println("Push Elements");
        s.push('a');
        s.push('b');
        s.push('c');
        s.push('d');
        s.push('e');
        sol.printStack(s);

        // ================= PEEK =================
        System.out.println("\nPeek : " + s.peek());

        // ================= POP =================
        System.out.println("\nPop : " + s.pop());
        sol.printStack(s);

        // ================= SIZE =================
        System.out.println("\nSize : " + s.size());

        // ================= EMPTY =================
        System.out.println("\nIs Empty : " + s.isEmpty());
        System.out.println("Empty() : " + s.empty());

        // ================= SEARCH =================
        System.out.println("\nSearch 'c' : " + s.search('c'));
        System.out.println("Search 'z' : " + s.search('z'));

        // ================= CONTAINS =================
        System.out.println("\nContains 'a' : " + s.contains('a'));
        System.out.println("Contains 'x' : " + s.contains('x'));

        // ================= GET =================
        System.out.println("\nElement at index 0 : " + s.get(0));
        System.out.println("Element at index 2 : " + s.get(2));

        // ================= FIRST & LAST =================
        System.out.println("\nFirst Element : " + s.firstElement());
        System.out.println("Last Element : " + s.lastElement());

        // ================= SET =================
        s.set(1, 'x');
        System.out.println("\nAfter set(1,'x') : " + s);

        // ================= ADD =================
        s.add('z');
        System.out.println("\nAfter add('z') : " + s);

        // ================= INSERT =================
        s.insertElementAt('p', 2);
        System.out.println("\nAfter insertElementAt('p',2) : " + s);

        // ================= REMOVE =================
        s.remove(Character.valueOf('p'));
        System.out.println("\nAfter remove('p') : " + s);

        s.remove(0);
        System.out.println("After remove(index 0) : " + s);

        // ================= SORT ASC =================
        Collections.sort(s);
        System.out.println("\nAscending Sort : " + s);

        // ================= SORT DESC =================
        Collections.sort(s, Collections.reverseOrder());
        System.out.println("Descending Sort : " + s);

        // ================= SORT USING LAMBDA =================
        s.sort((a, b) -> Character.compare(a, b));
        System.out.println("\nAscending Lambda : " + s);

        s.sort((a, b) -> Character.compare(b, a));
        System.out.println("Descending Lambda : " + s);

        // ================= REVERSE =================
        Collections.reverse(s);
        System.out.println("\nReverse : " + s);

        // ================= SHUFFLE =================
        Collections.shuffle(s);
        System.out.println("Shuffle : " + s);

        // ================= SWAP =================
        Collections.swap(s, 0, s.size() - 1);
        System.out.println("Swap First & Last : " + s);

        // ================= MIN MAX =================
        System.out.println("\nMinimum : " + Collections.min(s));
        System.out.println("Maximum : " + Collections.max(s));

        // ================= FREQUENCY =================
        s.push('a');
        s.push('a');

        System.out.println("\nAfter adding duplicate 'a' : " + s);
        System.out.println("Frequency of 'a' : "
                + Collections.frequency(s, 'a'));

        // ================= ITERATION =================
        System.out.println("\nEnhanced For Loop");
        for (char ch : s) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nIterator");

        Iterator<Character> it = s.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // ================= CLONE =================
        Stack<Character> copy = (Stack<Character>) s.clone();
        System.out.println("\n\nCloned Stack : " + copy);

        // ================= TO ARRAY =================
        Object[] arr = s.toArray();

        System.out.print("\nArray : ");

        for (Object x : arr) {
            System.out.print(x + " ");
        }

        // ================= CLEAR =================
        s.clear();

        System.out.println("\n\nAfter clear() : " + s);
        System.out.println("Is Empty : " + s.isEmpty());
    }
}