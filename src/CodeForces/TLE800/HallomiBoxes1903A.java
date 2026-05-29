package CodeForces.TLE800;

import java.util.Scanner;

public class HallomiBoxes1903A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            solve(sc);
        }
    }
    static void solve(Scanner sc){
        int n;
        n=sc.nextInt();
        int k=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean sorted=true;
        if(k>1){

            System.out.println("YES");
            return;
        }
        for (int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])
            {
                sorted=false;
                break;
            }
        }

        if(sorted){
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }




    }
}
