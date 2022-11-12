import Passports.Passport;
import Passports.PassportRecords;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product potato = new Product("Potato",26);
        Product carrot = new Product("Carrot",34.6);
        Product onion = new Product("Onion",14);
        Product cucumber = new Product("Cucumber",50);
        Product cucumber2 = new Product(null,0);

        Recipe salad = new Recipe("Salad");
        salad.addProduct(potato);
        salad.addProduct(carrot);
        salad.addProduct(onion);
        salad.addProduct(cucumber);
//        salad.addProduct(cucumber);
//        salad.addProduct(cucumber2)

        ;

//        System.out.println(Arrays.toString(salad.getProductList().toArray()));
        System.out.println(salad.getTotalProductsCost());

        Recipe okroshka = new Recipe("Okroshka");
        okroshka.addProduct(potato);
        okroshka.addProduct(carrot);
        okroshka.addProduct(onion);
        okroshka.addProduct(cucumber);
        Recipe neOkroshka = new Recipe("Okroshka");


//        System.out.println(okroshka.equals(salad));

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
//        tasks.printAllTasks();

        PassportRecords passportRecords = new PassportRecords();
        Passport mGibberman = new Passport(1234567890,"Mikhail", null, "Gibbermann", "12.12.2022");
        passportRecords.addPassport(mGibberman);
//        System.out.println(mGibberman);
        passportRecords.printAllPassportsData();
        Passport mPGibberman = new Passport(1234567890,"Mikhail", "Petrovich", "Gibbermann", "31.12.2022");
        passportRecords.addPassport(mPGibberman);
        passportRecords.printAllPassportsData();
//        System.out.println(mPGibberman);

        passportRecords.getPassportByNumber(1234567890).toString();


    }
}