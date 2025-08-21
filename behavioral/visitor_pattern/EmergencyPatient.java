public class EmergencyPatient implements Patient {
    double bill = 10000;
    public void accept(BillingVisitor visitor) {
        visitor.visit(this);
    }
}
