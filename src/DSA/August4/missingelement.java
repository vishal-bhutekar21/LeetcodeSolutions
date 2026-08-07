package DSA.August4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missingelement {
//    static List<Integer> findMissingElements(int[] nums) {
//
//        List<Integer> ans = new ArrayList<>();
//        Arrays.sort(nums);
//       int big=nums[nums.length-1];
//        int sum=(big*big+1)/2; {
//        })
//
//        return ans;
//    }

    static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//
//        }

//        System.out.println(findMissingElements(new int[]{1, 2, 5, 4}));


        int[] nums = {1, 2, 3, 5};
        int k = 0;
        Arrays.sort(nums);
        int s = nums[0];
        int big = nums[nums.length - 1];
        

        List<Integer> list = new ArrayList<>();
        for (int i = s; i <= big; i++) {

        }
        int sum = (big * (big + 1) / 2);
        for (int i = 0; i < nums.length; i++) {

            k += nums[i];
        }
        System.out.println(sum - k);
    }
}

