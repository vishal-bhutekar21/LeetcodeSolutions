package DSA.june19;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {

    static void reverse(int []arr){
        int left=0;
        int right=arr.length-1;
        while (left<right){
            swap(arr,left,right);
            left++;
            right--;
        }

    }
    static void swap(int []arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={12,32,543,64,7,3,2};

        System.out.println(Arrays.toString(arr));
        System.out.println("After sort");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
