package DSA.july17;

public class RecursionTemplate {
    static int fact(int n) {
        if (n == 1) {
            return 1;

        }
        return n * fact((n - 1));
    }

    static void print(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }


    }

    static void printAscending(int n) {
        if (n == 0) {
            return;
        }
        printAscending(n - 1); // Go to bottom first
        System.out.println(n); // Print on the way back up
    }

    static void printdec(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printdec(n - 1);
    }


    public static void main(String[] args) {
//        int n = new Scanner(System.in).nextInt();
//        System.out.println(fact(n));
//        print(n);
        printAscending(23);
        printdec(23);


    }
}
