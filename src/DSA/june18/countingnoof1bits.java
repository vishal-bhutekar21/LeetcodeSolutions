package DSA.june18;

import java.util.Scanner;

public class countingnoof1bits {



        static int hammingWeight(int n) {
            int count = 0; // stores number of 1 bits

            // loop until all bits are processed
            while (n != 0) {

                // check last bit (LSB)
                // if it is 1, increase count
                if ((n & 1) == 1) {
                    count++;
                }

                // right shift by 1
                // moves to next bit
                n >>= 1;
            }

            return count; // total number of 1s
        }


    // main method to test the code
    public static void main(String[] args) {


   int n=new Scanner(System.in).nextInt();

        System.out.println("Number of 1 bits = " + hammingWeight(n));
    }
}