public class Product {
    private String vendor;
    private String name;
    private double price;

    public Product(String vendor, String name, double price) {
        this.vendor = vendor;
        this.name = name;
        this.price = price;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
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

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
