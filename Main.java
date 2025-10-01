/*
Name: Jec Dainel D. Mojeco
Block: 3026 BIT213L-OBa
Date: 10/01/25
*/

import Payments.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cart cart1 = new Cart("John Xi Na");
        cart1.addProduct(new Electronics("GTX 1650", 8500.05, "Nvidia", 1, 30, 45));
        Payment cc = new CreditDebitPayment(8499.59,"php",345812,"John Xi Na");
        Order order1 = new Order(cart1, cc);
        order1.placeOrder();
        order1.trackOrder();

        Cart cart2 = new Cart("Juan Nepo Jr.");
        cart2.addProduct(new Clothing("Custom Gucci Barong", 85000, "Gucci x Malacañang Collab", 1, "L", "Gold Embroidered"));
        Payment gcash = new GCashPayment("09991234567");
        Order order2 = new Order(cart2, gcash);
        order2.placeOrder();
        order2.cancelOrder();

        Cart cart3 = new Cart("Maria Influence-a Lot");
        cart3.addProduct(new Electronics("Limited Edition LV Rice Cooker", 45000, "Louis Vuitton Home Line", 1, 24, 200));
        cart3.addProduct(new Grocery("Truffle Sinangag", 5000, "Private Chef Imports", 3, LocalDate.now().plusDays(2), true));
        Payment cod = new CashOnDeliveryPayment("Exclusive Village, Taguig City");
        Order order3 = new Order(cart3, cod);
        order3.placeOrder();
        order3.trackOrder();
    }
}

