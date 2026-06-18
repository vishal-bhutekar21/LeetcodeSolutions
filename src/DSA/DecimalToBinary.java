package DSA;

import java.util.Scanner;

public class DecimalToBinary {

    static void toBinary(int n) {
        if (n == 0) return;

        toBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        while(n>0){
//
//            System.out.print(n&1);
//            n>>=1;
//        }

        // the above code converts the integer to the binary form but the order is reverse
        // below is the code which we can make the order in correct form



        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n&1);
            n>>=1;

        }
        System.out.println(sb.reverse());




        // now we will use the recursion to convert the decimal to binary
       toBinary(n);
        //built in method to convert the integer to the binary form

        System.out.println(Integer.toBinaryString(n));


    }
}
