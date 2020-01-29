package pub.domain;

public class Beer {
    private String name;
    private Double price;

    public Beer(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Beer{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
    }
}
