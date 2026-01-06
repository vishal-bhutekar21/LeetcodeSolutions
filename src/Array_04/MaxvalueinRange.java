package Array_04;

import java.util.Arrays;
import java.util.Scanner;

public class MaxvalueinRange {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Array length :");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("The array elements are :"+ Arrays.toString(arr));

        System.out.println("maximum no is "+maximum(arr,1,3));
        max2(arr);

    }
    public static int maximum(int [] arr,int start,int end){
        int max=arr[0];

//        for(int a:arr){
//            if(a>max)
//                max=a;
//        }
            for (int i = start; i <= end; i++) {

                if(arr[i]>max){
                    max=arr[i];
                }
        }

        return max;
    }

    public static void max2(int arr[]){
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        System.out.println(max);
    }
}
