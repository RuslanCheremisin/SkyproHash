import Passports.Passport;
import Passports.PassportRecords;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product potato = new Product("Potato",26, 1);
        Product carrot = new Product("Carrot",34.6,1);
        Product onion = new Product("Onion",14,2);
        Product cucumber = new Product("Cucumber",50,2);
        Product cucumber2 = new Product(null,0,2);

        Recipe salad = new Recipe("Salad");
        salad.addProduct(potato,potato.getWeight());
        salad.addProduct(carrot,2);
        salad.addProduct(onion,2);
        salad.addProduct(cucumber,null);
//        salad.addProduct(cucumber,2);
//        salad.addProduct(cucumber2,1)

        ;

//        System.out.println(Arrays.toString(salad.getProductList().toArray()));
        System.out.println(salad.getTotalProductsCost());

        Recipe okroshka = new Recipe("Okroshka");
        okroshka.addProduct(potato,2);
        okroshka.addProduct(carrot,1);
        okroshka.addProduct(onion,1);
        okroshka.addProduct(cucumber,1);
        Recipe neOkroshka = new Recipe("Okroshka");


        RecipeLibrary rL = new RecipeLibrary();
        rL.addRecipe(salad);
        rL.addRecipe(okroshka);
//        rL.addRecipe(neOkroshka);

        salad.printIngredients();
        rL.printRecipeLibrary();

        Task2 task2 = new Task2();
        task2.randomizeIntegers();
        System.out.println(Arrays.toString(task2.getIntegers().toArray()));
        task2.removeOdds();
        System.out.println(Arrays.toString(task2.getIntegers().toArray())+"\n" +
                "---------------------------------");

        MultiplicationTasksForStudents tasks = new MultiplicationTasksForStudents();
        tasks.randomizeTasks(15);
        tasks.printAllTasks();

        PassportRecords passportRecords = new PassportRecords();
        Passport mGibberman = new Passport(1234567890,"Mikhail", null, "Gibbermann", "12.12.2022");
        passportRecords.addPassport(mGibberman);
//        System.out.println(mGibberman);
        passportRecords.printAllPassportsData();
        Passport mPGibberman = new Passport(1234567890,"Mikhail", "Petrovich", "Gibbermann", "31.08.1981");
        passportRecords.addPassport(mPGibberman);
        passportRecords.printAllPassportsData();
//        System.out.println(mPGibberman);
        Passport rATsybulsky = new Passport(1234123412, "Roman", "Aleksandrovich", "Tsybulsky", "12.08.1990");
        passportRecords.addPassport(rATsybulsky);

//        passportRecords.printAllPassportsData();

        passportRecords.getPassportByNumber(1234567890).toString();

        /////////////////////////// Задание про телефонную книгу ////////////////////////////

        PhoneBook.getPhoneBook().put("George", "+13456789075");
        PhoneBook.getPhoneBook().put("Peter", "+13445265789");
        PhoneBook.getPhoneBook().put("Linda", "+13456678910");
        PhoneBook.getPhoneBook().put("Sandy", "+13455567890");
        PhoneBook.getPhoneBook().put("Ahmed", "+14354758678");
        PhoneBook.getPhoneBook().put("Luna", "+134576237890");
        PhoneBook.getPhoneBook().put("Boris", "+13745678910");
        PhoneBook.getPhoneBook().put("Tasha", "+113456789306");
        PhoneBook.getPhoneBook().put("Theodor", "+15348567870");
        PhoneBook.getPhoneBook().put("Ruth", "+13456789012");
        PhoneBook.getPhoneBook().put("Stephan", "+13334567456");
        PhoneBook.getPhoneBook().put("Camila", "+13456712378");
        PhoneBook.getPhoneBook().put("Ross", "+13496857890");
        PhoneBook.getPhoneBook().put("Wendy", "+14354755564");
        PhoneBook.getPhoneBook().put("Terry", "+138887237890");
        PhoneBook.getPhoneBook().put("Pam", "+13745193470");
        PhoneBook.getPhoneBook().put("Quentin", "+113454447306");
        PhoneBook.getPhoneBook().put("Ivan", "+15340987870");
        PhoneBook.getPhoneBook().put("Justin", "+13456677542");
        PhoneBook.getPhoneBook().put("Beverly", "+13318567456");

        PhoneBook.printAllRecords();

        /////////////////////////// Задание про добавление в мапу ////////////////////////////
//
//        Task3HashMapTest.addEntry("str1", 1);
////        Task3HashMapTest.addEntry("str1", 1);
//        Task3HashMapTest.addEntry("str2", 1);
////        Task3HashMapTest.addEntry("str2", 1);
//        Task3HashMapTest.addEntry("str3", 1);
//        Task3HashMapTest.addEntry("str4", 1);
//        Task3HashMapTest.printAllEntries();
//        не решил(((

        //////////////////// задание про Создайте Map<String, List<Integer>>.
        // Заполните ее 5 элементами...
        Task2_1.randomize();
        Task2_1.convert();
        Task2_1.printMap2();

        //////////////////// задание про Создайте Map<Integer, String>, заполните ее 10 произвольными значениями.
        Task2_2.getMap().put("string 01", 1);
        Task2_2.getMap().put("string 02", 2);
        Task2_2.getMap().put("string 03", 3);
        Task2_2.getMap().put("string 04", 4);
        Task2_2.getMap().put("string 05", 5);
        Task2_2.getMap().put("string 06", 6);
        Task2_2.getMap().put("string 07", 7);
        Task2_2.getMap().put("string 08", 8);
        Task2_2.getMap().put("string 09", 9);
        Task2_2.getMap().put("string 10", 10);

        Task2_2.printMap();


    }

}