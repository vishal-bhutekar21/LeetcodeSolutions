package CodeForces.TLE800;

import java.util.*;

public class DoremisPaint1890A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {

        int n = sc.nextInt();

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        if (freq.size() == 1) {
            System.out.println("YES");
            return;
        }

        if (freq.size() > 2) {
            System.out.println("NO");
            return;
        }

        List<Integer> counts = new ArrayList<>(freq.values());

        if (Math.abs(counts.get(0) - counts.get(1)) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}