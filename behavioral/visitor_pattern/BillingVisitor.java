public interface BillingVisitor {
    void visit(InPatient ip);
    void visit(OutPatient op);
    void visit(EmergencyPatient ep);
}
