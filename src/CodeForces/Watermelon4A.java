package CodeForces;

import java.util.Scanner;

public class Watermelon4A {
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%2==0&& n!=2){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
