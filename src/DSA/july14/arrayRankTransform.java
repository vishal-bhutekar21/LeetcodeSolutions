package DSA.july14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class arrayRankTransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.println("The Sequence is " + Arrays.toString(arraytransform(arr)));
    }

    static int[] arraytransform(int[] arr) {
        int[] temp = arr.clone();

        Arrays.sort(temp);

        HashMap<Integer, Integer> rank = new HashMap<>();
        int r = 1;

        for (int num : temp) {
            if (!rank.containsKey(num)) {
                rank.put(num, r++);
            }
        }


        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }


        return arr;
    }
}//https://leetcode.com/problems/sequential-digits/
