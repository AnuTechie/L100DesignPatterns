# 🧩 Abstract Factory Pattern in Java

This repository demonstrates the **Abstract Factory Design Pattern** in Java using a GUI theme example.

---

## What is the Abstract Factory Pattern?

The **Abstract Factory Pattern** provides an interface for creating families of related or dependent objects without specifying their concrete classes.

---

## How is It Useful in Coding?

- ✅ Supports creation of related objects without tight coupling  
- ✅ Promotes consistency among products  
- ✅ Makes it easy to switch between product families

---

## Project File Structure (Java)

```plaintext
abstractFactoryPattern/
├── AbstractFactoryPattern.java
├── concreteproducts/
│   ├── dark/
│   │   ├── DarkButton.java
│   │   ├── DarkCheckbox.java
│   │   └── DarkThemeFactory.java
│   └── light/
│       ├── LightButton.java
│       ├── LightCheckbox.java
│       └── LightThemeFactory.java
├── interfaces/
│   ├── Button.java
│   ├── Checkbox.java
│   └── GUIFactory.java
```

---

## How to Run

```sh
javac interfaces/*.java concreteproducts/dark/*.java concreteproducts/light/*.java AbstractFactoryPattern.java
java AbstractFactoryPattern
```

---

## ✅ Using Abstract Factory Pattern

- Easily switch between dark and light themes  
- All components are created from the same family

```java
GUIFactory factory = new DarkThemeFactory();
Button button = factory.createButton();
Checkbox checkbox = factory.createCheckbox();
```

---

## ❌ Without Abstract Factory Pattern

- Must instantiate each component manually  
- Risk of mixing incompatible components

---

## Example Output

```
Dark Button rendered
Dark Checkbox rendered
```

---

## Pattern Used

This example uses the **Abstract Factory Pattern** to create themed GUI components.