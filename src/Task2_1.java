import java.util.*;
//////////////////// задание про Создайте Map<String, List<Integer>>.
// Заполните ее 5 элементами...
public class Task2_1 {

    private static Map<String, List<Integer>> map1 = new HashMap<>();
    private static Map<String, Integer> map2 = new HashMap<>();
    private static Random rndm = new Random();
    private static List<Integer> intList1 = new ArrayList<>();
    private static List<Integer> intList2 = new ArrayList<>();
    private static List<Integer> intList3 = new ArrayList<>();
    private static List<Integer> intList4 = new ArrayList<>();
    private static List<Integer> intList5 = new ArrayList<>();
    static List<Integer> intList = new ArrayList<>();

    public static List<Integer> getIntList() {
        return intList;
    }

    public static void randomize(){


        map1.put("str1", intList1);
        map1.put("str2", intList2);
        map1.put("str3", intList3);
        map1.put("str4", intList4);
        map1.put("str5", intList5);

        for (Map.Entry entry: map1.entrySet()) {

        }

        for (int i = 0; i < 3; i++) {
            intList1.add(rndm.nextInt(1000));
        }
        for (int i = 0; i < 3; i++) {
            intList2.add(rndm.nextInt(1000));
        }
        for (int i = 0; i < 3; i++) {
            intList3.add(rndm.nextInt(1000));
        }
        for (int i = 0; i < 3; i++) {
            intList4.add(rndm.nextInt(1000));
        }
        for (int i = 0; i < 3; i++) {
            intList5.add(rndm.nextInt(1000));
        }

    }

    public static void convert(){
        for (Map.Entry<String, List<Integer>> entry: map1.entrySet()) {
            int sumValues = 0;
            for(Integer integer:entry.getValue()){
                sumValues += integer;
                System.out.print(integer+"+");
            }
            System.out.println(" = "+sumValues);
            map2.put(entry.getKey(), sumValues);
        }
    }
    public static void printMap2(){
        for(Map.Entry<String, Integer> entry: map2.entrySet()){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
        System.out.println("--------------------");
    }

}
