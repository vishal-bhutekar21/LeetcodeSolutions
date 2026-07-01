package DSA.july1;

import java.util.Scanner;

public class NoOfSubstring {

    static int noofStrings(String s) {

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {

            boolean hasA = false;
            boolean hasB = false;
            boolean hasC = false;

            for (int j = i; j < n; j++) {

                char ch = s.charAt(j);

                if (ch == 'a') hasA = true;
                if (ch == 'b') hasB = true;
                if (ch == 'c') hasC = true;

                if (hasA && hasB && hasC) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(noofStrings(s));
    }
}