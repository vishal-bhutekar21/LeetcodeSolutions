package Array_04;

public class FlipAndInvertImage_832 {

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {

            // Step 1: reverse the row
            int left = 0;
            int right = image[i].length - 1;

            while (left < right) {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                left++;
                right--;
            }

            // Step 2: invert bits in the row
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] ^= 1;   // 0->1, 1->0
            }
        }

        return image;
    }

    // Simple test runner
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        int[][] result = flipAndInvertImage(image);

        System.out.println("Result:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
//https://leetcode.com/problems/flipping-an-image