package DSA.june28;

public class ToLowerCase {

    // ---------------------------------------------------------
    // Approach 1 : Built-in Method
    // Time Complexity : O(n)
    // Space Complexity: O(n)
    // ---------------------------------------------------------
    public static String approach1(String s) {
        return s.toLowerCase();
    }

    // ---------------------------------------------------------
    // Approach 2 : Using Character.toLowerCase()
    // Time Complexity : O(n)
    // Space Complexity: O(n)
    // ---------------------------------------------------------
    public static String approach2(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(Character.toLowerCase(s.charAt(i)));
        }

        return sb.toString();
    }

    // ---------------------------------------------------------
    // Approach 3 : ASCII Conversion using StringBuilder
    // Time Complexity : O(n)
    // Space Complexity: O(n)
    // ---------------------------------------------------------
    public static String approach3(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            sb.append(ch);
        }

        return sb.toString();
    }

    // ---------------------------------------------------------
    // Approach 4 : ASCII Conversion using Character Array
    // Time Complexity : O(n)
    // Space Complexity: O(n)
    // ---------------------------------------------------------
    public static String approach4(String s) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32);
            }

        }

        return new String(arr);
    }

    // ---------------------------------------------------------
    // Approach 5 : Character Array + Character.toLowerCase()
    // Time Complexity : O(n)
    // Space Complexity: O(n)
    // ---------------------------------------------------------
    public static String approach5(String s) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.toLowerCase(arr[i]);
        }

        return String.valueOf(arr);
    }

    // ---------------------------------------------------------
    // Main Method
    // ---------------------------------------------------------
    public static void main(String[] args) {

        String s = "HeLLo WoRLD 123";

        System.out.println("Original String : " + s);

        System.out.println("\nApproach 1 (Built-in)");
        System.out.println(approach1(s));

        System.out.println("\nApproach 2 (Character.toLowerCase)");
        System.out.println(approach2(s));

        System.out.println("\nApproach 3 (ASCII + StringBuilder)");
        System.out.println(approach3(s));

        System.out.println("\nApproach 4 (ASCII + Char Array)");
        System.out.println(approach4(s));

        System.out.println("\nApproach 5 (Char Array + Character.toLowerCase)");
        System.out.println(approach5(s));
    }
}