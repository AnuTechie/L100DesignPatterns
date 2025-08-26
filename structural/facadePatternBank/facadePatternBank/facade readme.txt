# 🧩 Facade Pattern in Java

This repository demonstrates the **Facade Design Pattern** in Java using a bank account creation example.

---

## What is the Facade Pattern?

The **Facade Pattern** provides a simplified interface to a complex subsystem. It hides the complexities of the system and provides an easy-to-use interface.

---

## How is It Useful in Coding?

- ✅ Simplifies complex systems  
- ✅ Reduces dependencies between subsystems and clients  
- ✅ Promotes loose coupling

---

## Project File Structure (Java)

```plaintext
facadePatternBank/
├── AccountCreator.java
├── BankAccountFacade.java
├── CardService.java
├── CreditCheck.java
├── KYCVerifier.java
├── Main.java
└── Notifier.java
```

---

## How to Run

```sh
javac *.java
java Main
```

---

## ✅ Using Facade Pattern

- Client interacts with a single facade class  
- Facade handles all subsystem interactions

```java
BankAccountFacade facade = new BankAccountFacade();
facade.createAccount("John Doe");
```

---

## ❌ Without Facade Pattern

- Client must interact with each subsystem directly  
- Code becomes tightly coupled and complex

---

## Example Output

```
KYC verified for John Doe
Credit check passed for John Doe
Account created for John Doe
Card issued for John Doe
Notification sent to John Doe
```

---

## Pattern Used

This example uses the **Facade Pattern** to simplify bank account creation.