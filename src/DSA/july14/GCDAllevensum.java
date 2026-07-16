package DSA.july14;

public class GCDAllevensum {

    static int evenoddgcdUsingnumberseries(int n) {
        int odd = n * n;
        int even = n * (n + 1);

        return gcd(odd, even);
    }

    static int gcd(int even, int odd) {
        if (even == 0) {
            return odd;
        }
        return gcd(odd % even, even);
    }

    int gcdOfOddEvenSums(int n) {

        int sumodd = 0;
        int sumeven = 0;
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            sumodd += i;
        }

        for (int i = 2; i <= 2 * n; i += 2) {
            sumeven += i;
        }

        return gcd(sumodd, sumeven);

    }


}
//https://leetcode.com/problems/gcd-of-odd-and-even-sums