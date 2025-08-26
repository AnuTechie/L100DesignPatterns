# 🧩 Flyweight Pattern in Java

This repository demonstrates the **Flyweight Design Pattern** in Java using a car rental example. It shows how to efficiently share objects to minimize memory usage.

---

## What is the Flyweight Pattern?

The **Flyweight Pattern** is used to minimize memory usage by sharing as much data as possible with similar objects. It is especially useful when you need to create a large number of similar objects.

---

## How is It Useful in Coding?

- ✅ Reduces memory footprint by sharing common state  
- ✅ Improves performance for large numbers of objects  
- ✅ Separates intrinsic (shared) and extrinsic (unique) state

---

## Project File Structure (Java)

```plaintext
flyweightPatternCarRental/
├── Car.java
├── CarModel.java
├── CarModelFactory.java
├── Main.java
```

---

## How to Run

```sh
javac *.java
java Main
```

---

## ✅ Using Flyweight Pattern

- Car models are shared between car objects  
- Only unique data (like license plate) is stored per car

```java
CarModel model = CarModelFactory.getCarModel("Sedan", "Red");
Car car1 = new Car("AP01AB1234", model);
Car car2 = new Car("AP01AB5678", model);
```

---

## ❌ Without Flyweight Pattern

- Each car would have its own copy of model data  
- Wastes memory and increases object creation time

---

## Example Output

```
Car AP01AB1234: Sedan, Red
Car AP01AB5678: Sedan, Red
```

---

## Pattern Used

This example uses the **Flyweight Pattern** to share car model data between car objects.