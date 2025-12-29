package Array_04;

public class largestAltitude_1732 {

    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestAltitude = 0;

        for (int g : gain) {
            currentAltitude += g;
            highestAltitude = Math.max(highestAltitude, currentAltitude);
        }

        return highestAltitude;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};

        int result = largestAltitude(gain);

        System.out.println("Highest altitude = " + result);
    }


    public static int largestAltitude2(int[] gain) {
        int n = gain.length;
        int[] altitude = new int[n + 1];
        altitude[0] = 0;

        for (int i = 0; i < n; i++) {
            altitude[i + 1] = altitude[i] + gain[i];
        }

        int max = altitude[0];

        for (int x : altitude) {
            max = Math.max(max, x);
        }

        return max;
    }
}
//https://leetcode.com/problems/find-the-highest-altitude/description/


