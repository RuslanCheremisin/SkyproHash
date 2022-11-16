import java.util.*;

public class Task2 {

    private Set<Integer> integers = new HashSet<>();

    private int maxInteger = 1000;
    private int integersCount = 20;

    public void randomizeIntegers() {
        Random rndm = new Random();
        for (int i = 0; i < integersCount; i++) {
            integers.add(rndm.nextInt(maxInteger));
        }
    }

    public void removeOdds() {
        Iterator<Integer> itr = integers.iterator();
        while(itr.hasNext()) {
            if (itr.next() % 2 != 0){
                itr.remove();
            }
        }
    }

    public Set<Integer> getIntegers() {
        return integers;
    }


}
