package order;

import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {

    LinkedList<Item> items = new LinkedList<Item>();
    Payment payment;
    Delivery delivery;

    public Order(LinkedList<Item> items, Payment payment, Delivery delivery) {
        this.items = items;
        this.payment = payment;
        this.delivery = delivery;
    }

    public Order() {
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }

    public String processOrder() {
        return "Your Order is being processed.";
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
