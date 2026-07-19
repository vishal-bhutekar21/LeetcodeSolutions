package DSA.july19;

import java.util.*;

public class FrequencySort {
    static String frequencySort(String s) {


        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Map.Entry<Character, Integer>> order = new ArrayList<>(map.entrySet());
        Collections.sort(order, (a, b) -> b.getValue() - a.getValue());

        StringBuilder ans = new StringBuilder();

// Build answer
        for (Map.Entry<Character, Integer> entry : order) {

            for (int i = 0; i < entry.getValue(); i++) {
                ans.append(entry.getKey());
            }
        }

        return ans.toString();

    }

    static String frequencySort2(String s) {

        // Step 1: Count the frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Create buckets where index = frequency

        List<Character>[] bucket = new ArrayList[s.length() + 1];

        // Place every character into its corresponding frequency bucket
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            int freq = entry.getValue();

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(entry.getKey());
        }

        // Step 3: Build the answer from highest frequency to lowest
        StringBuilder ans = new StringBuilder();

        for (int freq = s.length(); freq >= 1; freq--) {

            if (bucket[freq] == null) {
                continue;
            }

            // Characters having the same frequency
            for (char ch : bucket[freq]) {

                // Append character 'freq' times
                for (int i = 0; i < freq; i++) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The sorted string is:" + frequencySort(str));
        System.out.println("The sorted string is:" + frequencySort2(str));
    }
}
