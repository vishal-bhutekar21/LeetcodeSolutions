package CodeForces.A_Level_Easy;

import java.util.Scanner;

public class Square2167A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while (t-- >0){
            solve(sc);
        }


    }
    static void solve(Scanner sc){

        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
    int temp=a;
        if(temp==b&&temp==c&&temp==d){
            System.out.println("YES");
        }
        else
            System.out.println("NO");

    }
}
