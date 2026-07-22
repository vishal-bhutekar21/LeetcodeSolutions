package DSA.july22;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class monotonicstack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> num = new Stack<>();
        while (num.size() <= 5) {
            num.push(sc.nextInt());
        }
        System.out.println("Origional stack " + num);

        Collections.reverse(num);
        System.out.println("Reverse stack " + num);
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Sorted stack " + num);


    }
}
