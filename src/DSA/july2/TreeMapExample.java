package DSA.july2;

import java.util.TreeMap;
import java.util.Map;
import java.util.Comparator;

public class TreeMapExample {

    public static void main(String[] args) {
        // 1. Initialization (Natural ordering by default)
        TreeMap<Integer, String> map = new TreeMap<>();

        // 2. Core CRUD Operations
        map.put(10, "Apple");
        map.put(30, "Banana");
        map.put(20, "Cherry");
        map.put(50, "Dragonfruit");
        map.put(40, "Elderberry");

        System.out.println("Initial TreeMap (Sorted by Key): " + map);
        // Output: {10=Apple, 20=Cherry, 30=Banana, 40=Elderberry, 50=Dragonfruit}

        // Read
        System.out.println("Value for key 20: " + map.get(20)); // Cherry
        System.out.println("Contains key 30? " + map.containsKey(30)); // true
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple")); // true

        // Update
        map.put(20, "Coconut"); // Overwrites Cherry

        // Delete
        map.remove(40); // Removes 40=Elderberry

        // 3. NavigableMap & SortedMap Specific Functions
        System.out.println("First (Lowest) Key: " + map.firstKey()); // 10
        System.out.println("Last (Highest) Key: " + map.lastKey());   // 50

        // First and Last Entries
        Map.Entry<Integer, String> firstEntry = map.firstEntry();
        System.out.println("First Entry: " + firstEntry.getKey() + " -> " + firstEntry.getValue());

        // Ceil and Floor (Closest matches)
        // floorKey(X): Largest key <= X
        System.out.println("Floor Key of 25: " + map.floorKey(25)); // 20
        // ceilingKey(X): Smallest key >= X
        System.out.println("Ceiling Key of 25: " + map.ceilingKey(25)); // 30

        // Higher and Lower (Strictly greater/less than)
        System.out.println("Lower Key of 20: " + map.lowerKey(20)); // 10
        System.out.println("Higher Key of 20: " + map.higherKey(20)); // 30

        // 4. Sub-Map Operations (Ranges)
        // subMap(fromKey, toKey) -> fromKey is inclusive, toKey is exclusive
        System.out.println("SubMap (10 to 30): " + map.subMap(10, 30)); // {10=Apple, 20=Coconut}

        // headMap(toKey) -> Keys strictly less than toKey
        System.out.println("HeadMap (30): " + map.headMap(30)); // {10=Apple, 20=Coconut}

        // tailMap(fromKey) -> Keys greater than or equal to fromKey
        System.out.println("TailMap (30): " + map.tailMap(30)); // {30=Banana, 50=Dragonfruit}

        // 5. Reverse Ordering
        System.out.println("Descending Map: " + map.descendingMap());


    }
}
