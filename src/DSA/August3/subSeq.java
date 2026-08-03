package DSA.August3;

public class subSeq {
    static void main() {

        sbseq("", "abc");
    }

    static void sbseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sbseq(ch + p, up.substring(1));
        sbseq(p, up.substring(1));

    }
}
