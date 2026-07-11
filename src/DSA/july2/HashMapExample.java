package DSA.july2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        // SMOOTH: We use the Map interface on the left side.
        // This gives us the freedom to swap implementations instantly.
        Map<Integer, String> map = new HashMap<>();

        // 1. Works as a standard HashMap (order is unpredictable)
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");
        System.out.print("1. HashMap (Unordered): ");
        printDataSmooth(map);

        System.out.println();
        // 2. SMOOTH UPDATE: Change to TreeMap (Keys will instantly auto-sort)
        // No errors! The variable 'map' accepts it easily.
        map = new TreeMap<>();
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");
        System.out.print("2. Updated to TreeMap (Auto-sorted): ");
        printDataSmooth(map);

        System.out.println();
        // 3. SMOOTH UPDATE: Change to LinkedHashMap (Preserves insertion order)
        map = new LinkedHashMap<>();
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");
        System.out.print("3. Updated to LinkedHashMap (Insertion Order): ");
        // Reusable method accepts this map variant too!
        printDataSmooth(map);
        System.out.println();

    }

    // SMOOTH METHOD: This method accepts ANY object that implements the Map interface.
    // It doesn't care if it's a HashMap, TreeMap, or LinkedHashMap.
    public static void printDataSmooth(Map<Integer, String> anyMap) {
        System.out.println(anyMap);
    }
}
