package DSA.july9;

import java.util.Arrays;
import java.util.Scanner;

public class preFixSumInPlace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){

            a[i]= sc.nextInt();
        }

        System.out.println("Origional Arrays is "+ Arrays.toString(a));
            for (int i = 1; i <n ; i++) {

                a[i]=a[i-1]+a[i];
        }

        System.out.println("Prefix sum array is "+Arrays.toString(a));
    }
}
