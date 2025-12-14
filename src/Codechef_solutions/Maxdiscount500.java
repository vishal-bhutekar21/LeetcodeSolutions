package Codechef_solutions;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Maxdiscount500 {
    static void main() {
        /* package codechef; // don't place package name! */



        /* Name of the class has to be "Main" only if the class is public. */


                int t,x;
                int c=0,s=0;
                Scanner sc = new Scanner(System.in);
                t=sc.nextInt();
                while(t-->0)
                {
                    x = sc.nextInt();
                    c= x-(int)(x*0.10d);
                    s= x-100;
                    if(c<s)
                        System.out.println((x*10)/100);
                    else
                        System.out.println(100);

                }
            }
        }


