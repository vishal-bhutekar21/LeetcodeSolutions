package CodeForces.A_Level_Easy;

import java.util.Scanner;

public class PetyAndStrings112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();

        if (a.equals(b)) {
            System.out.println(0);
        }
        else if (a.compareTo(b) < 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(1);
        }
    }
}
