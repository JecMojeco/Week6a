import java.util.ArrayList;
import java.util.List;

public class Cart implements CartOperations {
    private List<Product> products = new ArrayList<>();
    private String ownerName;

    public Cart (String ownerName){
        setOwnerName(ownerName);
    }

    public List<Product> getProducts() { return products; }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.isEmpty()) ownerName = "Guest";
        this.ownerName = ownerName;
    }

    @Override
    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public void removeProduct(Product p) {

    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.calculateDiscount();
        }
        return total;
    }

    public void printCartSummary() {
        System.out.println("-------- Cart Summary for " + ownerName + " -------- ");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("--------  Total after discounts: " + calculateTotal() + " --------" );
    }

}
