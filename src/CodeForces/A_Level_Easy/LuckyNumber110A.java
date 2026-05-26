package CodeForces.A_Level_Easy;

import java.util.Scanner;

public class LuckyNumber110A {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.next();
        int count = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '4' || ch == '7') {
                count++;
            }
        }

        if(count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}