import java.util.Objects;

public class Product {
    private final String name;

    private double price;

    private int weight;

    public Product(String name, double price, int weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getWeight() {
        return weight;
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
