import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final String recipeName;
    private Set<Product> productList = new HashSet<>();
    private double cost=0;

    public Recipe(String recipeName){
        this.recipeName = recipeName;
    }

    public void addProduct(Product product) throws IllegalArgumentException{
        for (Product p : productList) {
            if (product.equals(p)) {
                throw new IllegalArgumentException("Product is already in the list!");
            }
        }
        if (product.getName()==null) {
            throw new IllegalArgumentException("Not enough data on the product!");
        } else {
            productList.add(product);
        }
    }

    public double getTotalProductsCost(){

        for(Product p: getProductList()){
            cost += p.getPrice();
        }
        return cost;
    }


    @Override
    public int hashCode(){
        return Objects.hash(recipeName,productList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o==null || this.getClass()!=o.getClass()){
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipe.recipeName, recipeName);
    }
    public String getRecipeName() {
        return recipeName;
    }
    public Set<Product> getProductList(){
        return productList;
    }

    @Override
    public String toString(){
        return getRecipeName();
    }

}
