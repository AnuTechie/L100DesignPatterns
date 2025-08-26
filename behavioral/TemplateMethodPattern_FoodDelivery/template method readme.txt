# 🧩 Template Method Pattern in Java

This repository demonstrates the **Template Method Design Pattern** in Java using a food delivery service example.

---

## What is the Template Method Pattern?

The **Template Method Pattern** defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps without changing the algorithm's structure.

---

## How is It Useful in Coding?

- ✅ Promotes code reuse by sharing common logic  
- ✅ Allows customization of specific steps  
- ✅ Enforces a consistent algorithm structure

---

## Project File Structure (Java)

```plaintext
TemplateMethodPattern_FoodDelivery/
└── src/
    └── fooddelivery/
        ├── FoodDeliveryService.java
        ├── Main.java
        ├── SwiggyService.java
        └── ZomatoService.java
```

---

## How to Run

```sh
javac src/fooddelivery/*.java
java -cp src fooddelivery.Main
```

---

## ✅ Using Template Method Pattern

- Common delivery steps are defined in the base class  
- Subclasses override specific steps

```java
FoodDeliveryService swiggy = new SwiggyService();
swiggy.deliverOrder();
```

---

## ❌ Without Template Method Pattern

- Duplicate code for each delivery service  
- Hard to maintain and update

---

## Example Output

```
Order received.
Preparing