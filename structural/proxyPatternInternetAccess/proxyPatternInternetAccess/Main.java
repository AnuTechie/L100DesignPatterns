package proxyPatternInternetAccess;

import proxyPatternInternetAccess.proxy.ProxyInternetAccess;
import proxyPatternInternetAccess.proxy.OfficeInternetAccess;

public class Main {
    public static void main(String[] args) {
        OfficeInternetAccess emp1 = new ProxyInternetAccess("Alice");
        emp1.grantInternetAccess();  // Should allow

        OfficeInternetAccess emp2 = new ProxyInternetAccess("Bob");
        emp2.grantInternetAccess();  // Should deny
    }
}