package CodeForces.A_Level_Easy;

import java.util.Scanner;

public class NextRound158A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int threshold = arr[k - 1];

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= threshold && arr[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}