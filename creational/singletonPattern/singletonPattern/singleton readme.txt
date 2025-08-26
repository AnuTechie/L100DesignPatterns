# 🧩 Singleton Pattern in Java

This repository demonstrates the **Singleton Design Pattern** in Java using a unique ID generator and service classes.

---

## What is the Singleton Pattern?

The **Singleton Pattern** ensures that a class has only one instance and provides a global point of access to it.

---

## How is It Useful in Coding?

- ✅ Ensures controlled access to a single instance  
- ✅ Saves memory by preventing multiple instances  
- ✅ Facilitates shared access to resources  
- ✅ Encourages consistency across the application

---

## Project File Structure (Java)

```plaintext
singletonPattern/
├── Main.java
├── generator/
│   ├── UniqueIdService.java
│   ├── impl/
│   │   └── SimpleIdGenerator.java
│   └── interfaces/
│       └── IdGenerator.java
└── service/
    ├── OrderService.java
    └── UserService.java
```

---

## How to Run

```sh
javac generator/interfaces/*.java generator/impl/*.java generator/*.java service/*.java Main.java
java singletonPattern.Main
```

---

## ✅ Using Singleton Pattern

- The same instance is reused throughout the code  
- Centralized control for generating unique IDs

```java
UniqueIdService idService = UniqueIdService.getInstance();
long id1 = idService.generateId();
long id2 = idService.generateId();
```

---

## ❌ Without Singleton Pattern

- Multiple instances may be created  
- Can lead to inconsistent state and duplicate IDs

---

## Example Output

```
Generated ID: 1
Generated ID: 2
```

---

## Pattern Used

This example uses the **Singleton Pattern** to ensure a single instance of the ID generator.