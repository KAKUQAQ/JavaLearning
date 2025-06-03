package Compare;

public class Product implements Comparable {
    @Override
    // 在此方法中指明如何判断当前类的对象的大小
    public int compareTo(Object o) {
        if(o == this){
            return 0;
        }
        if(o instanceof Product){
            Product p = (Product)o;

            return Double.compare(this.price, p.price);
        }
        throw new RuntimeException("类型不匹配");
    }

    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
