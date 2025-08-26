# 🧩 Mediator Pattern in Java

This repository demonstrates the **Mediator Design Pattern** in Java using a chat room example.

---

## What is the Mediator Pattern?

The **Mediator Pattern** defines an object that encapsulates how a set of objects interact. It promotes loose coupling by preventing objects from referring to each other explicitly.

---

## How is It Useful in Coding?

- ✅ Reduces dependencies between communicating objects  
- ✅ Centralizes complex communications  
- ✅ Simplifies object collaboration

---

## Project File Structure (Java)

```plaintext
MediatorPatternExample/
├── ChatMediator.java
├── ChatMediatorImpl.java
├── ConcreteUser.java
├── Main.java
└── User.java
```

---

## How to Run

```sh
javac *.java
java Main
```

---

## ✅ Using Mediator Pattern

- Users communicate through a mediator  
- Mediator handles message delivery

```java
ChatMediator mediator = new ChatMediatorImpl();
User user1 = new ConcreteUser(mediator, "Alice");
User user2 = new ConcreteUser(mediator, "Bob");
user1.send("Hello Bob!");
```

---

## ❌ Without Mediator Pattern

- Users communicate directly  
- Increases coupling and complexity

---

## Example Output

```
Alice sends: Hello Bob!
Bob receives: Hello Bob!
```

---

## Pattern Used

This example uses the **Mediator Pattern** to manage chat communication.