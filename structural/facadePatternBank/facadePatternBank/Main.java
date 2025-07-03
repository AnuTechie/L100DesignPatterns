package facadePatternBank;

public class Main {
    public static void main(String[] args) {
        BankAccountFacade bank = new BankAccountFacade();
        bank.openAccount("Alice");
        bank.openAccount("Bob");
    }
}