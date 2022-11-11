import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Product> productList = new HashSet<>();

    public void addProduct(Product product) throws IllegalArgumentException{
        if (productList.contains(product)) {
            throw new IllegalArgumentException("Product is already in the list!");
        } else if (product.getName()==null) {
            throw new IllegalArgumentException("Not enough data on the product!");
        } else {
            productList.add(product);
        }
    }
    public Set<Product> getProductList(){
        return productList;
    }

}
