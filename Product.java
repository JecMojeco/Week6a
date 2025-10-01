import Payments.*;
public abstract class Product {
 protected String name;
 protected double price;
 protected String brand;
 protected int stockQuantity;

 public Product (String name, double price, String brand, int stockQuantity){
     setName(name);
     setPrice(price);
     setBrand(brand);
     setStockQuantity(stockQuantity);
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     if (name == null || name.isBlank()) {
         throw new IllegalArgumentException("name cannot be empty");
     }
     this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0.");
        }
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("The brand cannot be empty");
        }
        this.brand = brand;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity <= 0) {
            throw new IllegalArgumentException("Stock Quantity must be greater than 0.");
        }
        this.stockQuantity = stockQuantity;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price +
                " , Brand: " + brand + ", Stock Quantity: " + stockQuantity;
    }

}
