package Array_04;

import java.util.Arrays;

public class ReverseArray { static void main(String[] args) {
    int [] arr = {1,2,44,18,13};
    System.out.println("origional aray  "+ Arrays.toString(arr)+"\n");


    int end=arr.length-1;
    int start=0;

    while (start<end){
        swap(arr,start,end);
        start++;
        end--;
    }


    System.out.println("after Reverse  "+Arrays.toString(arr)+"\n");



}
    static  void swap(int arr[],int start,int end){

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;


    }
}


