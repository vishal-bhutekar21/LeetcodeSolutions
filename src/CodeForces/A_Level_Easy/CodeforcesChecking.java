package CodeForces.A_Level_Easy;

import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        String word="codeforces";
        while (t-- > 0){
            char c=sc.next().charAt(0);

            if (word.indexOf(c) != -1){
                System.out.println("YES");
            }
            else
                System.out.println("NO");


        }
    }
}
