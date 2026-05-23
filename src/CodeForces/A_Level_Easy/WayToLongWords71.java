package CodeForces.A_Level_Easy;

import java.util.Scanner;

public class WayToLongWords71 {

    public static void main(String... s) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n-- > 0) {
            solve(scanner);
        }
    }

    static void solve(Scanner scanner) {

        String word = scanner.next();

        if (word.length() > 10) {

            System.out.println("" + word.charAt(0)+ (word.length() - 2) + word.charAt(word.length() - 1)
            );

        } else {
            System.out.println(word);
        }
    }
}