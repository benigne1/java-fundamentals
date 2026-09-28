package java_objects;

import java.util.Scanner;

public class ShoppingCart {

    private int totalItems;
    private double totalPrice;

    public void addItem(double price) {
        totalItems = totalItems + 1;
        totalPrice = totalPrice + price;
        getCartSummary("added");
    }

    public void removeItem(double price) {
        if (totalItems > 0) {
            totalItems = totalItems - 1;
            totalPrice = totalPrice - price;
            getCartSummary("removed");
        }
    }

    public void emptyCart() {
        totalItems = 0;
        totalPrice = 0;
    }

    private void getCartSummary(String action) {
        System.out.println("Cart has " + totalItems + " items " + action + ". Total: $" + totalPrice);
    }

    public int getTotalItems() {
        return totalItems;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.print("Item name: ");
        String name = input.next();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        System.out.print("Price: ");
        double price = input.nextDouble();

        for (int i = 0; i < quantity; i++) {
            cart.addItem(price);
        }

        System.out.print("Remove one " + name + "? (yes/no): ");
        if (input.next().equals("yes")) {
            cart.removeItem(price);
        }

        System.out.println("Products in cart: " + cart.getTotalItems());
    }
}
