package DSA.july21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListSortDemo {

    public static void main(String[] args) {

        // ===================== int[] =====================
        int[] arr = {5, 2, 8, 1, 9};

        System.out.println("Original int[] : " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Ascending (Arrays.sort) : " + Arrays.toString(arr));

        reverse(arr);
        System.out.println("Descending (Reverse after sort) : " + Arrays.toString(arr));


        // ===================== Integer[] =====================
        Integer[] nums = {5, 2, 8, 1, 9};

        System.out.println("\nOriginal Integer[] : " + Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println("Ascending (Arrays.sort) : " + Arrays.toString(nums));

        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println("Descending (Collections.reverseOrder) : " + Arrays.toString(nums));

        Arrays.sort(nums, (a, b) -> Integer.compare(b, a));
        System.out.println("Descending (Lambda) : " + Arrays.toString(nums));


        // ===================== char[] =====================
        char[] chars = {'d', 'a', 'z', 'b', 'm'};

        System.out.println("\nOriginal char[] : " + Arrays.toString(chars));

        Arrays.sort(chars);
        System.out.println("Ascending (Arrays.sort) : " + Arrays.toString(chars));

        reverse(chars);
        System.out.println("Descending (Reverse after sort) : " + Arrays.toString(chars));


        // ===================== Character[] =====================
        Character[] ch = {'d', 'a', 'z', 'b', 'm'};

        System.out.println("\nOriginal Character[] : " + Arrays.toString(ch));

        Arrays.sort(ch);
        System.out.println("Ascending : " + Arrays.toString(ch));

        Arrays.sort(ch, Collections.reverseOrder());
        System.out.println("Descending (Collections.reverseOrder) : " + Arrays.toString(ch));

        Arrays.sort(ch, (a, b) -> Character.compare(b, a));
        System.out.println("Descending (Lambda) : " + Arrays.toString(ch));


        // ===================== ArrayList<Integer> =====================
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));

        System.out.println("\nOriginal ArrayList<Integer> : " + list);

        Collections.sort(list);
        System.out.println("Ascending (Collections.sort) : " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending (reverseOrder) : " + list);

        list.sort((a, b) -> Integer.compare(a, b));
        System.out.println("Ascending (Lambda) : " + list);

        list.sort((a, b) -> Integer.compare(b, a));
        System.out.println("Descending (Lambda) : " + list);


        // ===================== ArrayList<Character> =====================
        ArrayList<Character> charList =
                new ArrayList<>(Arrays.asList('d', 'a', 'z', 'b', 'm'));

        System.out.println("\nOriginal ArrayList<Character> : " + charList);

        Collections.sort(charList);
        System.out.println("Ascending : " + charList);

        Collections.sort(charList, Collections.reverseOrder());
        System.out.println("Descending (reverseOrder) : " + charList);

        charList.sort((a, b) -> Character.compare(a, b));
        System.out.println("Ascending (Lambda) : " + charList);

        charList.sort((a, b) -> Character.compare(b, a));
        System.out.println("Descending (Lambda) : " + charList);


    }

    // Reverse int[]
    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Reverse char[]
    static void reverse(char[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


}