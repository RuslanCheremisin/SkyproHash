import java.util.*;

public class Recipe {

    private final String recipeName;
    private HashMap<Product, Integer> productList = new HashMap<>();
    private double cost = 0;

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
    }

    public void addProduct(Product product, Integer quantity) {
        if (quantity == null || quantity <= 0) {
            quantity = 1;
        }
        for (Map.Entry<Product, Integer> entry : productList.entrySet()) {
            if (entry.getKey().getName().equals(product.getName())) {
                throw new IllegalArgumentException("Product is already in the list!");
            }
        }
        if (product.getName() == null) {
            throw new IllegalArgumentException("Not enough data on the product!");
        } else {
            productList.put(product, quantity);
        }
    }

    public double getTotalProductsCost() {

        for (Map.Entry<Product, Integer> entry : productList.entrySet()) {
            cost += entry.getKey().getPrice() * entry.getValue();
        }
        return cost;
    }

    public void printIngredients() {
        System.out.println(recipeName + " ingredients:");
        for (Map.Entry<Product, Integer> entry : productList.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue() + " pcs");
        }
        System.out.println("----------------------------");
    }
    @Override
    public int hashCode() {
        return Objects.hash(recipeName, productList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipe.recipeName, recipeName);
    }

    public String getRecipeName() {
        return recipeName;
    }


    @Override
    public String toString() {
        return getRecipeName();
    }

}
