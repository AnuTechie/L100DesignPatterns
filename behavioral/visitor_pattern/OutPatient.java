public class OutPatient implements Patient {
    double bill = 2000;
    public void accept(BillingVisitor visitor) {
        visitor.visit(this);
    }
}
