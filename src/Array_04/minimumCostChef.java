package Array_04;

import java.util.Scanner;

/*
 * Class Name: minimumCostChef
 * Problem:
 * Chef wants to buy 'c' chocolates.
 * He already has 'x' chocolates.
 * Each additional chocolate costs 'y'.
 * We need to calculate the minimum cost Chef has to pay.
 */
public class minimumCostChef {

    // Main method: Program execution starts here
    public static void main(String[] args) throws java.lang.Exception {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Reading number of test cases
        int t = sc.nextInt();

        // Loop for each test case
        while (t-- > 0) {
            solve(sc); // Call solve method for each test case
        }

        // Closing scanner to avoid resource leak
        sc.close();
    }

    /*
     * solve() method:
     * Reads inputs and calculates minimum cost
     */
    static void solve(Scanner sc) {

        // Total chocolates Chef wants
        int c = sc.nextInt();

        // Chocolates Chef already has
        int x = sc.nextInt();

        // Cost of one chocolate
        int y = sc.nextInt();

        // Calculate chocolates Chef still needs to buy
        // Math.max is used to avoid negative values
        int chocolatesToBuy = Math.max(0, c - x);

        // Total cost Chef has to pay
        int cost = chocolatesToBuy * y;

        // Printing the final cost
        System.out.println(cost);
    }
}
