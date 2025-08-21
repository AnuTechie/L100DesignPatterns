package fooddelivery;

public class SwiggyService extends FoodDeliveryService {
    @Override
    protected void makePayment() {
        System.out.println("Making payment via Swiggy Wallet...");
    }

    @Override
    protected void deliverFood() {
        System.out.println("Swiggy delivery partner delivering food...");
    }
}
