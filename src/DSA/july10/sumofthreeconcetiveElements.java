package DSA.july10;

import java.util.Scanner;

public class sumofthreeconcetiveElements {
    static int winsum(int []a,int k){


        int winsum=0;


        for (int i = 0; i < k; i++) {

            winsum+=a[i];
        }
        int ans=winsum;

        for (int i = k; i < a.length; i++) {

            winsum+=a[i];
            winsum-=a[i-k];
            ans=Math.max(ans,winsum);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int []a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();

        }
        int k;
        System.out.println("enter window sizse");
        k= sc.nextInt();
        System.out.println("sum of 3 window is "+winsum(a,k));



    }
    // 2 4 6
}
