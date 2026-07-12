package DSA.july12;

import java.util.Scanner;

public class contestQ1 {
    static int timeDifferecne(String s1, String s2) {

        String[] t1 = s2.split(":");
        String[] t2 = s1.split(":");

        int totaltime1 = Integer.parseInt(t1[0]) * 3600 + Integer.parseInt(t1[1]) * 60 + Integer.parseInt(t1[2]);
        int totaltime2 = Integer.parseInt(t2[0]) * 3600 + Integer.parseInt(t2[1]) * 60 + Integer.parseInt(t2[2]);

        int differenceInSeconds = Math.abs(totaltime1 - totaltime2);

        return differenceInSeconds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();


        System.out.println("The time difference is " + timeDifferecne(s1, s2));
    }
}

