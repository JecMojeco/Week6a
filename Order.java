import Payments.*;
import java.util.UUID;

public class Order implements Trackable, Cancelable {
    private Cart cart;
    private Payment payment;
    private String orderId;
    private String status;

    public Order(Cart cart, Payment payment){
        setCart(cart);
        setPayment(payment);
        this.orderId = "ORD" + UUID.randomUUID().toString().substring(0, 8);
        this.status = "Pending";
    }

    public void placeOrder() {
        System.out.println("Placing Order ID: " + orderId);
        cart.printCartSummary();
        payment.processPayment();
        status = "Paid";
        System.out.println("Order confirmed! Status: " + status);
    }


    @Override
    public void trackOrder() {
        System.out.println("Order " + orderId + " status: " + status);
    }

    @Override
    public void cancelOrder() {
        if (status.equals("Cancelled")) {
            System.out.println("Order " + orderId + " is already cancelled.");
        } else if (!status.equals("Delivered")) {
            status = "Cancelled";
            System.out.println("Order " + orderId + " has been cancelled.");
        }
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}