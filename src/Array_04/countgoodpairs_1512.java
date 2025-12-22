package Array_04;

import java.util.Scanner;

public class countgoodpairs_1512 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Frequency array
        int[] hash = new int[101];
        int count = 0;

        // Logic to count good pairs
        for (int i = 0; i < n; i++) {
            count += hash[nums[i]];
            hash[nums[i]]++;
        }

        // Output result
        System.out.println("Number of good pairs = " + count);
    }
}
