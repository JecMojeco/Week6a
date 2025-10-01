import Payments.Refundable;

import java.time.LocalDate;

public class Grocery extends Product implements Discountable, Perishable, Returnable {
    private LocalDate expiryDate;
    private boolean isPerishable;

    public Grocery (String name, double price, String brand, int stockQuantity, LocalDate expiryDate, boolean isPerishable){
        super(name, price, brand, stockQuantity);
        setExpiryDate(expiryDate);
        setPerishable(isPerishable);
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }


    public void setExpiryDate(LocalDate expiryDate) {
        if (expiryDate == null) throw new IllegalArgumentException("Expiry date cannot be empty");
        this.expiryDate = expiryDate;
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.05;
    }

    @Override
    public void returnItem() {

    }
    @Override
    public boolean checkExpiry() {
        LocalDate today = LocalDate.now();
        if (expiryDate.isBefore(today)){
            System.out.println(getName()+ " is expired:(");
        } else {
            System.out.println(getName() + " is still good :)");
        }
        return expiryDate.isBefore(today);
    }

    public boolean isPerishable() {
        return isPerishable;
    }

    public void setPerishable(boolean perishable) {
        this.isPerishable = perishable;
    }
}
