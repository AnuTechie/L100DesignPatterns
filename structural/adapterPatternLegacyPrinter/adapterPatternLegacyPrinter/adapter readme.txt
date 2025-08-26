# 🧩 Adapter Pattern in Java

This repository demonstrates the **Adapter Design Pattern** in Java using a legacy printer example. It shows how to make incompatible interfaces work together by introducing an adapter.

---

## What is the Adapter Pattern?

The **Adapter Pattern** allows objects with incompatible interfaces to collaborate. It acts as a bridge between two incompatible interfaces by wrapping one of the objects with an adapter class.

It is part of the **Structural Design Patterns** and is useful when you want to use some existing code but its interface does not match what you need.

---

## How is It Useful in Coding?

- ✅ Enables reuse of legacy or third-party code without modification  
- ✅ Promotes flexibility by decoupling code from specific implementations  
- ✅ Facilitates integration between new and old systems  
- ✅ Encourages single responsibility by separating adaptation logic

---

## Project File Structure (Java)

```plaintext
adapterPatternLegacyPrinter/
├── adapters/
│   └── OldPrinterAdapter.java
├── interfaces/
│   └── ModernPrinter.java
├── legacy/
│   └── OldPrinter.java
└── Main.java
```

---

## How to Run

```sh
javac adapters/*.java interfaces/*.java legacy/*.java Main.java
java Main
```

---

## ✅ Using Adapter Pattern

- Allows the modern interface to use the legacy printer  
- No need to change the legacy code  
- Adapter handles the conversion between interfaces

```java
ModernPrinter printer = new OldPrinterAdapter(new OldPrinter());
printer.print("Hello, Adapter Pattern!");
```

---

## ❌ Without Adapter Pattern

- You must use the legacy interface directly  
- Code becomes tightly coupled to the legacy implementation  
- Difficult to switch to a new implementation later

```java
OldPrinter legacyPrinter = new OldPrinter();
legacyPrinter.printOld("Hello, Adapter Pattern!");
```

---

## Example Output

```
Printing using the old printer: Hello, Adapter Pattern!
```

---

## Pattern Used

This example uses the **Adapter Pattern** to allow modern code to work with a legacy printer interface.