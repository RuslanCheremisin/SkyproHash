import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product potato = new Product("Potato");
        Product carrot = new Product("Carrot");
        Product onion = new Product("Onion");
        Product cucumber = new Product("Cucumber");
        Product cucumber2 = new Product(null);

        ProductList pL = new ProductList();
        pL.addProduct(potato);
        pL.addProduct(carrot);
        pL.addProduct(onion);
        pL.addProduct(cucumber);
//        pL.addProduct(cucumber);
//        pL.addProduct(cucumber2);

        System.out.println(Arrays.toString(pL.getProductList().toArray()));


    }
}