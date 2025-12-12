package conditional_loops_03;


import java.util.Scanner;

public class ps_1281_subtract_and_sum_of_products {

     static void main(String ...args){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter any number to find its product minus sum answer");
        int x=in.nextInt();
        System.out.println("answer "+subtractProductAndSum(x));

    }

    static int subtractProductAndSum(int n) {

        int prd=1,sum=0;
        int digit=0;
        while(n!=0){

            digit=n%10;
            prd *= digit;
            sum +=digit;
            n/=10;


        }
        return prd-sum;
    }
}
