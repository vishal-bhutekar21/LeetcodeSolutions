package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencySumContestEasy {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter no ");
        int n=sc.nextInt();
        int result=solve(n);
        System.out.println("The sum is "+result);

    }
    static int solve(int n){
        int digit=0;
        int score=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(n!=0){
            digit=n%10;
            map.put(digit, map.getOrDefault(digit,0)+1);
            n/=10;
        }

        for(int key: map.keySet()){
            score+=key*map.get(key);
        }
        return score;
    }
}
