package DSA.july6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArrraySum {
    static int subasum(int []nums,int k){

        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();

        map.put(0,1);
        int sum=0;
        int count=0;

            for(int num:nums){
                sum+=num;

                count+=map.getOrDefault(sum-k,0);
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
            return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int num[]=new int[n];
        for (int i = 0; i < n; i++) {
            num[i]=sc.nextInt();
        }
        int k= sc.nextInt();;
        System.out.println(subasum(num,k));
    }
}


//https://leetcode.com/problems/subarray-sum-equals-k