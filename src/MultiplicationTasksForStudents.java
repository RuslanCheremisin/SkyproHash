import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class MultiplicationTasksForStudents {
    private Set<String> multiplicationTasks = new HashSet<>();

    public void randomizeTasks() {
        int min = 2;
        int max = 9;
        Random random = new Random();
        while (multiplicationTasks.size() < 15) {
            int multiplier = random.nextInt(max - min) + min;
            int multiplicand = random.nextInt(max - min) + min;
            String task = (multiplier + "*" + multiplicand);
            String taskRev = (multiplicand + "*" + multiplier);
            if (!multiplicationTasks.contains(task) && !multiplicationTasks.contains(taskRev)){
                multiplicationTasks.add(task);
            }


        }
    }
    public void printAllTasks(){
        System.out.println("15 tasks for multiplication:");
        System.out.println(Arrays.toString(multiplicationTasks.toArray()));
    }

}
