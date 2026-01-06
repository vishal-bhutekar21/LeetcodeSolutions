package Array_04;

import java.util.Arrays;

public class Swap  {
    static void main(String[] args) {
        int [] arr = {1,2,44,18,13};
        System.out.println("before swap "+Arrays.toString(arr)+"\n");

        swap(arr,1,3);
        System.out.println("after swap "+Arrays.toString(arr)+"\n");



    }
    static  void swap(int arr[],int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


    }
}
