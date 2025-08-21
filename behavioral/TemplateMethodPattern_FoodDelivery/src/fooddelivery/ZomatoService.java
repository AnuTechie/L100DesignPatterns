package fooddelivery;

public class ZomatoService extends FoodDeliveryService {
    @Override
    protected void makePayment() {
        System.out.println("Making payment using Zomato Pay...");
    }

    @Override
    protected void deliverFood() {
        System.out.println("Zomato rider delivering food...");
    }
}
