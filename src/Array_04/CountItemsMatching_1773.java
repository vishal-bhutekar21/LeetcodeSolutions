package Array_04;

import java.util.*;

public class CountItemsMatching_1773 {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index = 0;

        if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }

        int count = 0;

        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );

        // Example 1
        String ruleKey1 = "type";
        String ruleValue1 = "phone";
        int result1 = countMatches(items, ruleKey1, ruleValue1);
        System.out.println("Result 1: " + result1);  // Expected: 2

        // Example 2
        String ruleKey2 = "color";
        String ruleValue2 = "silver";
        int result2 = countMatches(items, ruleKey2, ruleValue2);
        System.out.println("Result 2: " + result2);  // Expected: 1

        // Example 3
        String ruleKey3 = "name";
        String ruleValue3 = "pixel";
        int result3 = countMatches(items, ruleKey3, ruleValue3);
        System.out.println("Result 3: " + result3);  // Expected: 1
    }
}
//https://leetcode.com/problems/count-items-matching-a-rule/



//other logic