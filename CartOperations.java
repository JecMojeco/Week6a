public interface CartOperations {
    void addProduct(Product p);
    void removeProduct(Product p);
    double calculateTotal();
}
