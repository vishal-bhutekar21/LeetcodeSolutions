package DSA.july18;

public class isPerfectSquare {
    static boolean isSquare(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square == n) {
                return true;
            } else if (square < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    static boolean isPerfectSquare(int num) {

        int sq = (int) Math.sqrt(num);

        return sq * sq == num;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println("is perfect Square   " + isSquare(n));
        System.out.println("is perfecs square :" + isPerfectSquare(n));
    }
}
