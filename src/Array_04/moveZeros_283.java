package Array_04;

import java.util.Arrays;
import java.util.Scanner;

public class moveZeros_283 {
   public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter array size");
        int n=scanner.nextInt();
       int arr[]=new int[n];
        System.out.println("enter array elements ");
        for (int i=0; i<n;i++){
            arr[i]=scanner.nextInt();
        }

        System.out.println("the arrays before moving zero "+ Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println("arrays after moving zero "+Arrays.toString(arr));
    }

        static public void moveZeroes(int[] nums) {
            int n=nums.length;
            int  index=0;

            for(int i=0;i<n;i++){
                if(nums[i]!=0){
                    nums[index]=nums[i];
                    index++;
                }
            }
            while(index<n){
                nums[index]=0;
                index++;
            }

        }

}
