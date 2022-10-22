import java.util.Date;

public class OrderExample {

    public static void printOrder(PurchaseOrder order){
        String out = "Id: " + order.getId() + " Description: "+ order.getDescription() + " Date: " + order.getDate()
                    + " Name: " + order.getCustomer() +'\n' + "Products: \n";
        for (Product product: order.getProducts()) {
            out += product + "\n";
        }
        out += "\nOrder Total: " + order.calculateTotal() + "\n\n\n";
        System.out.println("Purchase Order Details: \n" + out);
    }


    public static void main(String[] args) {
        //Creating First Product
        PurchaseOrder order1 = new PurchaseOrder("Garden Tools");
        order1.setDate(new Date());
        order1.setCustomer(new Customer("Carlos", "Gonzalez"));
        //Adding Products
        order1.addProduct(new Product("Vendor1", "Cutter", 4.50));
        order1.addProduct(new Product("Vendor2", "Gloves", 8.90));
        order1.addProduct(new Product("Vendor3", "Glasses", 7.00));
        order1.addProduct(new Product("Vendor4", "Scissors", 2.50));

        //Creating Second Product
        PurchaseOrder order2 = new PurchaseOrder("Office Supplies");
        order2.setDate(new Date());
        order2.setCustomer(new Customer("Carlos", "Gonzalez"));
        //Adding Products
        order2.addProduct(new Product("Vendor1", "Stappler", 6.50));
        order2.addProduct(new Product("Vendor2", "Paper", 3.90));
        order2.addProduct(new Product("Vendor3", "Clips", 2.00));
        order2.addProduct(new Product("Vendor4", "Scissors", 9.50));

        //Creating Third Product
        PurchaseOrder order3 = new PurchaseOrder("Clothes");
        order3.setDate(new Date());
        order3.setCustomer(new Customer("Carlos", "Gonzalez"));
        //Adding Products
        order3.addProduct(new Product("Vendor1", "Pants", 1.50));
        order3.addProduct(new Product("Vendor2", "Shirt", 4.90));
        order3.addProduct(new Product("Vendor3", "Tie", 5.00));
        order3.addProduct(new Product("Vendor4", "Socks", 7.50));

        printOrder(order1);
        printOrder(order2);
        printOrder(order3);
    }
}
