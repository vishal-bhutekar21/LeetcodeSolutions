public class longestsubstring_03 {
    static void main(String[] args) {
        String sample="vishalbhal";
        System.out.println("The maximum length of the string is:"+longestsubstring(sample));

    }
    static int longestsubstring(String s) {
        int n = s.length();
        int[] lastSeen = new int[128];
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            left = Math.max(left, lastSeen[c]);


            maxLen = Math.max(maxLen, right - left + 1);


            lastSeen[c] = right + 1;
        }
        return maxLen;
    }
}
