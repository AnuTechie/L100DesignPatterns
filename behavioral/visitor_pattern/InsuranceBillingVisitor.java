public class InsuranceBillingVisitor implements BillingVisitor {
    public void visit(InPatient ip) {
        System.out.println("InPatient after insurance: " + (ip.bill * 0.5));
    }
    public void visit(OutPatient op) {
        System.out.println("OutPatient after insurance: " + (op.bill * 0.7));
    }
    public void visit(EmergencyPatient ep) {
        System.out.println("Emergency after insurance: " + (ep.bill * 0.8));
    }
}
