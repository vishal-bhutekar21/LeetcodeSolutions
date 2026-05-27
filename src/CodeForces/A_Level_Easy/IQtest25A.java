package CodeForces.A_Level_Easy;

import java.util.Scanner;

public class IQtest25A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );

        int n=sc.nextInt();
        int evencount=0;
        int oddcount=0;
        int eveni=-1;
        int oddi=-1;
        int []arr=new int[n+1];
        for (int i = 1; i <= n; i++) {

            arr[i]=sc.nextInt();



        }
        for (int i = 1; i <=n; i++) {
            if(arr[i]%2==0){
                evencount++;
                eveni=i;
            }
            else {
                oddcount++;
                oddi=i;
            }

        }

        if(evencount==1){
            System.out.println(eveni);
        }
        else
            System.out.println(oddi);
    }
}
