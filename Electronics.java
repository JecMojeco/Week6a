public class Electronics extends Product implements Discountable, Perishable, Returnable{
    private int warrantyPeriod;
    private int powerUsage;

    public Electronics (String name, double price, String brand, int stockQuantity, int warrantyPeriod, int powerUsage){
        super(name, price, brand, stockQuantity);
        setWarrantyPeriod(warrantyPeriod);
        setPowerUsage(powerUsage);
    }


    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if (warrantyPeriod <= 0) throw new IllegalArgumentException("Warranty Period should not be 0");
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(int powerUsage) {
        if (powerUsage <= 0) throw new IllegalArgumentException("The power usage should not be zero");
        this.powerUsage = powerUsage;
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.10;
    }

    @Override
    public void returnItem() {
        System.out.println("Electronics return processed with warranty check.");
    }

    @Override
    public boolean checkExpiry() {
        return false;
    }
}
