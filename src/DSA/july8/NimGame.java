package DSA.july8;

import java.util.Scanner;

public class NimGame {
    static boolean nimgame(int n){
        return n%4==0? false: true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("can i win :-    "+nimgame(n));

    }
}
