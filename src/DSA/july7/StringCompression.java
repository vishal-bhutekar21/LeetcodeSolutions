package DSA.july7;

import java.util.Scanner;

public class StringCompression {
    static int compress(char[] chars) {
        int write = 0;
        int i = 0;

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            chars[write++] = current;

            if (count > 1) {
                String str = String.valueOf(count);
                for (char c : str.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("output is "+compress(s.toCharArray()));
    }
}



//https://leetcode.com/problems/string-compression/description/
