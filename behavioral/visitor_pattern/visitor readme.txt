# 🧩 Visitor Pattern in Java

This repository demonstrates the **Visitor Design Pattern** in Java using a hospital billing example.

---

## What is the Visitor Pattern?

The **Visitor Pattern** lets you define new operations on objects without changing the classes of the elements on which it operates.

---

## How is It Useful in Coding?

- ✅ Adds new operations without modifying existing classes  
- ✅ Promotes open/closed principle  
- ✅ Separates algorithms from object structure

---

## Project File Structure (Java)

```plaintext
visitor_pattern/
├── BillingVisitor.java
├── EmergencyPatient.java
├── InPatient.java
├── InsuranceBillingVisitor.java
├── Main.java
├── OutPatient.java
└── Patient.java
```

---

## How to Run

```sh
javac *.java
java Main
```

---

## ✅ Using Visitor Pattern

- New billing operations can be added easily  
- Patients accept visitors for billing

```java
Patient patient = new InPatient();
BillingVisitor visitor = new InsuranceBillingVisitor();
patient.accept(visitor);
```

---

## ❌ Without Visitor Pattern

- Must modify patient classes to add new operations  
- Violates open/closed principle

---

## Example Output

```
Billing InPatient with insurance.
```

---

## Pattern Used

This example uses the **Visitor Pattern** for hospital billing operations.