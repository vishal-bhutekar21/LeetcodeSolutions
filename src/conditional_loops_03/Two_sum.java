package conditional_loops_03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Two_sum {
    static void main(String[] args) {
        int nums[]={2,3,4,5,6,7};

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter target size");
        int target=scanner.nextInt();
        System.out.println("solution of two sum problem is:"+ Arrays.toString(solutiontwosum(nums,target)));
    }

//    private static int []  solutiontwosum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j <nums.length ; j++) {
//                if (target==nums[i]+nums[j]){
//                    return new int[]{i,j};
//
//                }
//                                                  uses approach O(n2)
//            }
//        }
//        return new int[]{};
//    }


    private static int [] solutiontwosum(int nums[],int target){

        HashMap<Integer,Integer>map=new HashMap<>();

        for (int i = 0; i <nums.length  ; i++) {

            int c=target-nums[i];

            if (map.containsKey(c)){
                return new int[]{map.get(c),i};
            }
            map.put(nums[i],i );

        }

        return new int []{};
    }
}
