import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2_2 {
    private static Map<String, Integer> map = new LinkedHashMap<>();

    public static void printMap(){
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("--------------------");

    }

    public static Map<String, Integer> getMap() {
        return map;
    }

}
