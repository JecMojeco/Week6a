public class Clothing extends Product implements Discountable, Perishable, Returnable{
    private String size;
    private String color;

    public Clothing (String name, double price, String brand, int stockQuantity, String size, String color){
        super(name, price, brand, stockQuantity);
        setSize(size);
        setColor(color);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.isBlank()) throw new IllegalArgumentException("Size cannot be empty");
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isBlank()) throw new IllegalArgumentException("Color cannot be empty");
        this.color = color;
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.20;
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
