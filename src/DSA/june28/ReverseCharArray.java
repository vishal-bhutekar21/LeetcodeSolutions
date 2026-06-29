package DSA.june28;

import java.util.Arrays;

public class ReverseCharArray {

    // ---------------------------------------------------------
    // Approach 1 : Two Pointers (Optimal)
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // ---------------------------------------------------------
    public static void approach1(char[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // ---------------------------------------------------------
    // Approach 2 : Using For Loop
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // ---------------------------------------------------------
    public static void approach2(char[] arr) {

        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {

            char temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    // ---------------------------------------------------------
    // Approach 3 : Using Extra Array
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // ---------------------------------------------------------
    public static char[] approach3(char[] arr) {

        char[] ans = new char[arr.length];

        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            ans[index++] = arr[i];
        }

        return ans;
    }

    // ---------------------------------------------------------
    // Approach 4 : Using StringBuilder
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // ---------------------------------------------------------
    public static char[] approach4(char[] arr) {

        StringBuilder sb = new StringBuilder();

        for (char ch : arr) {
            sb.append(ch);
        }

        sb.reverse();

        return sb.toString().toCharArray();
    }

    // ---------------------------------------------------------
    // Approach 5 : Using Recursion
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // ---------------------------------------------------------
    public static void approach5(char[] arr, int left, int right) {

        if (left >= right)
            return;

        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        approach5(arr, left + 1, right - 1);
    }

    // ---------------------------------------------------------
    // Main Method
    // ---------------------------------------------------------
    public static void main(String[] args) {

        char[] original = {'H', 'E', 'L', 'L', 'O'};

        // Approach 1
        char[] a1 = original.clone();
        approach1(a1);
        System.out.println("Approach 1 : " + Arrays.toString(a1));

        // Approach 2
        char[] a2 = original.clone();
        approach2(a2);
        System.out.println("Approach 2 : " + Arrays.toString(a2));

        // Approach 3
        char[] a3 = approach3(original);
        System.out.println("Approach 3 : " + Arrays.toString(a3));

        // Approach 4
        char[] a4 = approach4(original);
        System.out.println("Approach 4 : " + Arrays.toString(a4));

        // Approach 5
        char[] a5 = original.clone();
        approach5(a5, 0, a5.length - 1);
        System.out.println("Approach 5 : " + Arrays.toString(a5));
    }
}