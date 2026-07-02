package DSA.july2;
import java.util.HashMap;
import java.util.Map;

public class CachingExample {
    // We use a Map to cache previously calculated Fibonacci numbers
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) return n;

        // If we already calculated this value, return it instantly from cache
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Otherwise, calculate it, save it to the cache, and return it
        long result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        // Will compute near-instantly instead of freezing your computer
        System.out.println("Fibonacci of 50: " + fibonacci(50));
    }
}
