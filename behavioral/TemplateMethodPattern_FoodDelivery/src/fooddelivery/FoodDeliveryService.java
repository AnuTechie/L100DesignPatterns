package fooddelivery;

public abstract class FoodDeliveryService {
    // Template method
    public final void processOrder() {
        selectRestaurant();
        placeOrder();
        makePayment();
        deliverFood();
    }

    protected void selectRestaurant() {
        System.out.println("Selecting restaurant based on user preference...");
    }

    protected void placeOrder() {
        System.out.println("Placing the order...");
    }

    protected abstract void makePayment();
    protected abstract void deliverFood();
}
