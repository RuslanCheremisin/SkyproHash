import java.util.Objects;

public class Product {
    private final String name;

    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

    @Override

    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o==null || this.getClass()!=o.getClass()){
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(product.name, name);
    }

    @Override

    public int hashCode(){
        return Objects.hash(name,price);
    }

}
