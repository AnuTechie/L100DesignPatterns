package fooddelivery;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Swiggy Order Process ===");
        FoodDeliveryService swiggy = new SwiggyService();
        swiggy.processOrder();

        System.out.println("\n=== Zomato Order Process ===");
        FoodDeliveryService zomato = new ZomatoService();
        zomato.processOrder();
    }
}
