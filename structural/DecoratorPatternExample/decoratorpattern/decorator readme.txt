# 🧩 Decorator Pattern in Java

This repository demonstrates the **Decorator Design Pattern** in Java using a coffee customization example.

---

## What is the Decorator Pattern?

The **Decorator Pattern** allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class.

---

## How is It Useful in Coding?

- ✅ Adds new functionality without modifying existing code  
- ✅ Promotes code reuse and flexibility  
- ✅ Supports open/closed principle

---

## Project File Structure (Java)

```plaintext
DecoratorPatternExample/
├── decoratorpattern/
│   ├── Coffee.java
│   ├── CoffeeDecorator.java
│   ├── CreamDecorator.java
│   ├── Main.java
│   ├── MilkDecorator.java
│   ├── SimpleCoffee.java
│   └── SugarDecorator.java
```

---

## How to Run

```sh
javac decoratorpattern/*.java
java decoratorpattern.Main
```

---

## ✅ Using Decorator Pattern

- Add milk, sugar, or cream to coffee dynamically  
- Each decorator adds its own behavior

```java
Coffee coffee = new SimpleCoffee();
coffee = new MilkDecorator(coffee);
coffee = new SugarDecorator(coffee);
System.out.println(coffee.getDescription());
```

---

## ❌ Without Decorator Pattern

- You would need a subclass for every combination (e.g., CoffeeWithMilkAndSugar)  
- Code becomes hard to maintain and extend

---

## Example Output

```
Simple Coffee, Milk, Sugar
```

---

## Pattern Used

This example uses the **Decorator Pattern** to add features to coffee objects dynamically.