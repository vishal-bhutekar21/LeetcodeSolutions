package DSA.june18;

import java.util.Scanner;

public class Reversebits {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();

        String s=Integer.toBinaryString(n);
        while(s.length()<32){
            s="0"+s;
        }
        String reverse=new StringBuilder(s).reverse().toString();

        System.out.println(Long.parseLong(reverse,2));

    }
}
