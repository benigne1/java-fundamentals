package java_methods;

public class CafePOS {

    public static void main(String[] args) {
        String customerName = "Alex";
        double coffeePrice = 4.50;
        int quantity = 6;
        boolean hasLoyaltyCard = true;

        double baseTotal = coffeePrice * quantity;
        double total = baseTotal;

        if (hasLoyaltyCard) {
            total = baseTotal - 2.50;
        } else if (baseTotal > 15.00) {
            total = baseTotal - baseTotal * 0.10;
        }

        System.out.println("Brewing in 3... 2... 1... Coffee is ready!");

        double finalTotal = calculateTax(total, 0.08);
        generateReceipt(customerName, finalTotal);
    }

    public static double calculateTax(double amount, double taxRate) {
        return amount + amount * taxRate;
    }

    public static void generateReceipt(String name, double finalAmount) {
        System.out.println("---- RECEIPT ----");
        System.out.println("Customer: " + name);
        System.out.println("Total: $" + finalAmount);
    }
}