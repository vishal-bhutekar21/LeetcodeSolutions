package Array_04;

import java.util.Arrays;

public class permutation_1920 {
    static void main(String[] args) {

        int arr[]={1,3,5,2,4,6,0};

        System.out.println("The array solution is "+ Arrays.toString(buildArray(arr)));

    }
    static public int[] buildArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0; i<n;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;

    }

}
