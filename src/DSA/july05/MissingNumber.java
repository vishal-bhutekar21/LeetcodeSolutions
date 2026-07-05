package DSA.july05;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    static  int missingno(int arr[]){
        int org=0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            org+=arr[i];
        }
        int act=n*(n+1)/2;

        return act-org;

    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        int []a=new int[n];
        for (int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        System.out.println("Missing no is "+missingno(a));
    }
}

//time complexity isTime Complexity: O(n) — one loop traverses the array once; the sum formula is O(1).
//Space Complexity: O(1) — only a few variables are used, with no extra data structures.
