package DSA.june18;

import java.util.Scanner;
import java.math.*;

public class GCDNumber {

    public static int gcd1(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    static int gcd(int a,int b){
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=gcd(a,b);
        System.out.println(gcd(a,b));
        System.out.println(gcd1(b,a));

    }
}
