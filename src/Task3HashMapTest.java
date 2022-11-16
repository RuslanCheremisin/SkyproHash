import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3HashMapTest {

    private static HashMap<String, Integer> hashMapTest = new HashMap<>();

    public static void addEntry(String key, Integer value) {
        if (!hashMapTest.isEmpty()) {
            if (hashMapTest.containsKey(key) && hashMapTest.get(key) == value) {
                throw new IllegalArgumentException("This entry already exists");
            } else {
                hashMapTest.put(key, value);
            }

        } else {
            hashMapTest.put(key, value);
        }
    }

    public static void printAllEntries() {
        for (Map.Entry<String, Integer> entry : hashMapTest.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("---------------------------");
    }

}
