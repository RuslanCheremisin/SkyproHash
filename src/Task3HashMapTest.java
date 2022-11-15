import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3HashMapTest {

    private static HashMap<String, Integer> hashMapTest = new HashMap<>();

    public static void addEntry(String key, Integer value) {
        if (!hashMapTest.isEmpty()) {
            Iterator<Map.Entry<String, Integer>> itr = hashMapTest.entrySet().iterator();
            while (itr.hasNext()) {
                if (itr.next().getKey() == key && itr.next().getValue()==value) {
                    throw new IllegalArgumentException("This entry already exists");
                } else {
                    hashMapTest.put(key, value);
                }
            }
        } else {
            hashMapTest.put(key, value);
        }

        //            for (Map.Entry<String, Integer> entry: hashMapTest.entrySet()) {
//                if (entry.getKey().equals(key)&& entry.getValue()==value){
//                    throw new IllegalArgumentException("This entry already exists");
//                }else {
//                    hashMapTest.put(key,value);
//                }
    }

    public static void printAllEntries() {
        for (Map.Entry<String, Integer> entry : hashMapTest.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
