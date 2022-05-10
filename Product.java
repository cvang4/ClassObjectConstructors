public class Product {
    
    private double cost;
    private int quantity;
    private String name;
    private double totalCost;

    // Class constructor
    public Product (double productCost, int productquantity, String productName) {
        this.cost = productCost;
        this.quantity = productquantity;
        this.name = productName;
    }

    public void totalCost() {
        totalCost = this.cost * this.quantity;
    }

    public void printProduct() {
        System.out.println(this.name + " costs " + this.cost + " and " + this.quantity + " units were purchased");
        System.out.println("Total cost is " + totalCost);
    }
}
