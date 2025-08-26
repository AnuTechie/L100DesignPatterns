# 🧩 Strategy Pattern in Java

This repository demonstrates the **Strategy Design Pattern** in Java using a smart food delivery example.

---

## What is the Strategy Pattern?

The **Strategy Pattern** defines a family of algorithms, encapsulates each one, and makes them interchangeable. It lets the algorithm vary independently from clients that use it.

---

## How is It Useful in Coding?

- ✅ Supports interchangeable algorithms  
- ✅ Promotes code reuse and flexibility  
- ✅ Simplifies adding new strategies

---

## Project File Structure (Java)

```plaintext
SmartFoodDelivery_StrategyPattern/
└── smartdelivery/
    ├── BikeDelivery.java
    ├── CarDelivery.java
    ├── DeliveryContext.java
    ├── DeliveryStrategy.java
    ├── DroneDelivery.java
    └── SmartFoodDeliveryApp.java
```

---

## How to Run

```sh
javac smartdelivery/*.java
java smartdelivery.SmartFoodDeliveryApp
```

---

## ✅ Using Strategy Pattern

- Delivery method can be changed at runtime  
- Each strategy encapsulates its own logic

```java
DeliveryContext context = new DeliveryContext(new BikeDelivery());
context.executeDelivery("Order123");
```

---

## ❌ Without Strategy Pattern

- All logic is in a single class  
- Hard to add or change delivery methods

---

## Example Output

```
Delivering Order123 by bike.
```

---

## Pattern Used

This example uses the **Strategy Pattern** for flexible food delivery methods.