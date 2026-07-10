package DSA.july10;

import java.util.Scanner;

public class MaxNoofVowels {

    static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o') {
            return true;

        }
        return false;
    }

    static int maxVowels(String s, int k) {
        int sum = 0;
        s = s.toLowerCase();
        for (int i = 0; i < k; i++) {

            if (isVowel(s.charAt(i))) {
                sum++;
            }
        }

        int ans = sum;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                sum--;

            }
            if (isVowel(s.charAt(i))) {
                sum++;
            }

            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println("enter window size ");
        int k = sc.nextInt();
        System.out.println("Maximum length no of vowel in range is " + maxVowels(s, k));

    }
}
