package DSA.june26;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove0AtEnd {

    // ==========================
    // Brute Force (Using Temp Array)
    // Time : O(n)
    // Space: O(n)
    // ==========================
    public static void bruteForce(int[] arr) {

        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    // ==========================
    // Better (Using ArrayList)
    // Time : O(n)
    // Space: O(n)
    // ==========================
    public static void better(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num != 0) {
                list.add(num);
            }
        }

        int index = 0;

        for (int num : list) {
            arr[index++] = num;
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    // ==========================
    // Optimal (Two Pointers)
    // Time : O(n)
    // Space: O(1)
    // ==========================
    public static void optimal(int[] arr) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] original = {1, 0, 2, 3, 0, 4, 0, 1};

        int[] bruteArray = original.clone();
        int[] betterArray = original.clone();
        int[] optimalArray = original.clone();

        System.out.println("Original Array : " + Arrays.toString(original));

        bruteForce(bruteArray);
        System.out.println("Brute Force    : " + Arrays.toString(bruteArray));

        better(betterArray);
        System.out.println("Better         : " + Arrays.toString(betterArray));

        optimal(optimalArray);
        System.out.println("Optimal        : " + Arrays.toString(optimalArray));
    }
}