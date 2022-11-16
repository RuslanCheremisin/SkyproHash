import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static HashMap<String, String> phoneBook = new HashMap<>();
    public static HashMap<String, String> getPhoneBook(){
        return phoneBook;
    }

    public static void printAllRecords(){
        System.out.println("Phone book entries:");
        for (Map.Entry<String, String> entry: phoneBook.entrySet()
             ) {
            System.out.println(entry.getKey() + ": "+entry.getValue());
        }
        System.out.println("----------------------------------");
    }
}
