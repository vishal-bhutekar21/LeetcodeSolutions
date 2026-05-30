package CodeForces.A_Level_Easy;

import java.util.Scanner;

public class ConstructanArray2231A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -->0){
            solve(sc);
        }
    }
    static  void solve(Scanner sc){
        int n=sc.nextInt();


        for (int i = 1; i < 2*n; i+=2) {

            System.out.print(i+" ");

        }
        System.out.println();

    }
}
