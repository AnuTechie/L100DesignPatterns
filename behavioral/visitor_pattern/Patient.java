public interface Patient {
    void accept(BillingVisitor visitor);
}
