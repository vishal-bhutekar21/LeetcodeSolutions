package CodeForces.A_Level_Easy;

import java.util.Scanner;

public class HalloumiBoxes1903A {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            solve(in);
        }
    }

    static void solve(Scanner in) {

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }


//        if (k > 1) {
//            System.out.println("YES");
//            return;
//        }

//        too avoid many loops we use this


        boolean sorted = true;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted|| k>1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


//import java.util.Scanner;
//
//public class HalloumiBoxes1903A {
//
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        int t = in.nextInt();
//
//        while (t-- > 0) {
//            solve(in);
//        }
//    }
//
//    static void solve(Scanner in) {
//
//        int n = in.nextInt();
//        int k = in.nextInt();
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        if (k > 1 || isSorted(arr)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//
//    static boolean isSorted(int[] arr) {
//
//        for (int i = 0; i < arr.length - 1; i++) {
//
//            if (arr[i] > arr[i + 1]) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}