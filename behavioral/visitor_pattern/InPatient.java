public class InPatient implements Patient {
    double bill = 5000;
    public void accept(BillingVisitor visitor) {
        visitor.visit(this);
    }
}
