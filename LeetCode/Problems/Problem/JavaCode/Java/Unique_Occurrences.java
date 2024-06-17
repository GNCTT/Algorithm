import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Unique_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int current = map.get(arr[i]);
                current ++;
                map.replace(arr[i], current);
            }
        }

        Set<Integer> hash_Set = new HashSet<Integer>();

        for (Integer i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
            if (hash_Set.contains(map.get(i))) {
                return false;
            } else {
                hash_Set.add(map.get(i));
            }
        }

        return true;
    }
}
