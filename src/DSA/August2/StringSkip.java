package DSA.August2;

public class StringSkip {
    static String stringSkip(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            return stringSkip(str.substring(1));
        } else {
            return ch + stringSkip(str.substring(1));
        }
    }

    static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }

    }

    static void main() {
        System.out.println(stringSkip("abcaaadfsgsgs"));
        System.out.println(skipApple("abcaaappledfsgsgs"));
    }
}
