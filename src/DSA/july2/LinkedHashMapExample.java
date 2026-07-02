package DSA.july2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        // 1. Initialization 
        // Default constructor: Maintains insertion order
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // 2. Core CRUD Operations
        map.put(10, "Apple");
        map.put(30, "Banana");
        map.put(20, "Cherry");
        map.put(50, "Dragonfruit");
        map.put(40, "Elderberry");

        // Output maintains the exact order of insertion
        System.out.println("Initial LinkedHashMap (Insertion Order): " + map);
        // Output: {10=Apple, 30=Banana, 20=Cherry, 50=Dragonfruit, 40=Elderberry}

        // Read
        System.out.println("Value for key 20: " + map.get(20)); // Cherry
        System.out.println("Contains key 30? " + map.containsKey(30)); // true
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple")); // true

        // Update (Does not change insertion order position)
        map.put(20, "Coconut");

        // Delete
        map.remove(40);
        System.out.println("After removal of 40: " + map);

        // 3. Iteration Methods
        System.out.println("\n--- Iterating Entries ---");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 4. Access-Order Feature (LRU Cache Behavior)
        // Parameters: initialCapacity, loadFactor, accessOrder (true for access-order, false for insertion-order)
        LinkedHashMap<Integer, String> accessOrderMap = new LinkedHashMap<>( map.size(), map.size(),true);

        accessOrderMap.put(1, "One");
        accessOrderMap.put(2, "Two");
        accessOrderMap.put(3, "Three");

        System.out.println("\nInitial Access-Order Map: " + accessOrderMap); // {1=One, 2=Two, 3=Three}

        // Accessing key 1 moves it to the end of the map
        accessOrderMap.get(1);
        System.out.println("After accessing key 1: " + accessOrderMap);
        // {2=Two, 3=Three, 1=One}
        accessOrderMap.get(2);

        System.out.println("After accessing key 2: " + accessOrderMap); // {2=Two, 3=Three, 1=One}

        // 5. Advanced: Eviction Policy (removeEldestEntry)
        // Creating a fixed-size cache (Max 3 elements)
        LinkedHashMap<Integer, String> cache = new LinkedHashMap<Integer, String>(4, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 3; // Evict when size exceeds 3
            }
        };

        cache.put(100, "A");
        cache.put(200, "B");
        cache.put(300, "C");
        System.out.println("\nCache status: " + cache); // {100=A, 200=B, 300=C}

        cache.put(400, "D"); // Trigger eviction of eldest entry (100)
        System.out.println("Cache status after adding 4th element: " + cache); // {200=B, 300=C, 400=D}
    }
}