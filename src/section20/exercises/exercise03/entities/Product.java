package section20.exercises.exercise03.entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }

    public void nonStaticPriceUpdate(){
        this.setPrice(this.getPrice() * 1.1);
    }

    @Override
    public String toString() {
        return this.getName() + ", $" + String.format("%.2f", this.getPrice());
   }
}
