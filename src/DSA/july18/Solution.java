package DSA.july18;

// Define the parent class locally to avoid compilation errors
abstract class GuessGame {
    private final int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    // This method simulates the API provided by LeetCode
    int guess(int num) {
        if (num == pick) return 0;
        if (num < pick) return 1;
        return -1;
    }
}

public class Solution extends GuessGame {

    public Solution(int pick) {
        super(pick);
    }

    public static void main(String[] args) {
        int target = 6; // Example target
        Solution sol = new Solution(target);
        System.out.println("The guessed number is: " + sol.guessNumber(10));
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid;
            } else if (res == 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}