package DSA.july19;

public class EvenKnightMoves {

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Example 1
        int[] start1 = {1, 1};
        int[] target1 = {2, 2};

        System.out.println("Example 1");
        System.out.println("Start  : (" + start1[0] + ", " + start1[1] + ")");
        System.out.println("Target : (" + target1[0] + ", " + target1[1] + ")");
        System.out.println("Can reach in even moves? "
                + solution.canReach(start1, target1));

        System.out.println();

        // Example 2
        int[] start2 = {4, 5};
        int[] target2 = {6, 6};

        System.out.println("Example 2");
        System.out.println("Start  : (" + start2[0] + ", " + start2[1] + ")");
        System.out.println("Target : (" + target2[0] + ", " + target2[1] + ")");
        System.out.println("Can reach in even moves? "
                + solution.canReach(start2, target2));
    }

    static class Solution {

        public boolean canReach(int[] start, int[] target) {

            // Find the color (parity) of the starting square.
            // Even sum -> Black (0)
            // Odd sum  -> White (1)
            int startParity = (start[0] + start[1]) % 2;

            // Find the color (parity) of the target square.
            int targetParity = (target[0] + target[1]) % 2;

            // A knight changes color after every move.
            // Therefore:
            // Even number of moves  -> Same color
            // Odd number of moves   -> Different color

            // If both squares have the same color,
            // an even-length path exists.
            return startParity == targetParity;

            // Otherwise, only an odd-length path exists.
        }
    }
}