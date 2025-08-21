public class Main {
    public static void main(String[] args) {
        Patient[] patients = {new InPatient(), new OutPatient(), new EmergencyPatient()};
        BillingVisitor insurance = new InsuranceBillingVisitor();

        for (Patient p : patients) {
            p.accept(insurance);
        }
    }
}
