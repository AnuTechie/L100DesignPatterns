package proxyPatternInternetAccess.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {
    private String employeeName;
    private RealInternetAccess realAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            realAccess = new RealInternetAccess(employeeName);
            realAccess.grantInternetAccess();
        } else {
            System.out.println("No Internet access granted to employee: " + employeeName);
        }
    }

    private int getRole(String empName) {
        // Simulate access level check (e.g., from DB)
        // Higher number = higher access
        if (empName.equalsIgnoreCase("Alice")) return 5;
        else return 2;
    }
}