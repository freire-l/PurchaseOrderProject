import java.util.Date;

public class PurchaseOrder {
      private static Integer id = 0;
      private String description;
      private Date date;;
      private Customer customer;
      private  Product[] products;
      private int productCount = 0;


      public PurchaseOrder(String description) {
       this.description = description;
       products = new Product[4];
       id++;
      }

      //Getter Setters

      public static Integer getId() {
       return id;
      }

      public String getDescription() {
       return description;
      }

      public Date getDate() {
       return date;
      }

      public void setDate(Date date) {
       this.date = date;
      }

      public Customer getCustomer() {
       return customer;
      }

      public void setCustomer(Customer customer) {
       this.customer = customer;
      }

      public Product[] getProducts() {
       return products;
      }

      //

      public void addProduct(Product product){
       if(productCount <= 3) {
           products[productCount] = product;
           productCount++;
       }
      }

      public double calculateTotal(){
          double sum = 0.0;
          for (Product product:products) {
              sum += product.getPrice();
          }
          return sum;
      }
 }
