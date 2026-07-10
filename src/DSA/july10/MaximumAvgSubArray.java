package DSA.july10;

import java.util.Scanner;

public class MaximumAvgSubArray {
    static double  subarray(int nums[],int k){
        double sum=0;
        double ans;
        for(int i=0;i<k;i++){

            sum+=nums[i];
        }

        ans=sum/k;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];

            ans=Math.max(ans,sum/k);
        }

        return ans;

    }


    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = -Double.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            double sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            maxAvg = Math.max(maxAvg, sum / k);
        }

        return maxAvg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        int k;
        System.out.println("enter window sizse");
        k = sc.nextInt();

        System.out.println("Maximum avg SubArray "+subarray(a,k));

    }

}


//https://leetcode.com/problems/maximum-average-subarray-i/