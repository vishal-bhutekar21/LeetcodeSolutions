package conditional_loops_03;

public class sqrt {


    static void main(String[] args) {
        int x=20;

        System.out.println(mySqrt(x));
    }



    static public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1, right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid; // avoid overflow

            if (sq == x) {
                return mid;
            } else if (sq < x) {
                ans = mid;      // possible answer
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}


