package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        RomanToInteger_13 obj = new RomanToInteger_13();
        System.out.println(obj.romanToInt("MCMXCIV")); // Output: 1994
    }
}
