package facadePatternBank;

public class BankAccountFacade {
    private KYCVerifier kyc;
    private CreditCheck credit;
    private AccountCreator accountCreator;
    private CardService cardService;
    private Notifier notifier;

    public BankAccountFacade() {
        kyc = new KYCVerifier();
        credit = new CreditCheck();
        accountCreator = new AccountCreator();
        cardService = new CardService();
        notifier = new Notifier();
    }

    public void openAccount(String name) {
        System.out.println("----- Starting account opening process for " + name + " -----");
        kyc.verify(name);
        credit.check(name);
        accountCreator.createSavingsAccount(name);
        cardService.issueDebitCard(name);
        notifier.sendWelcomeMessage(name);
        System.out.println("✅ Account opening process completed for " + name);
        System.out.println("----------------------------------------------------------");
    }
}