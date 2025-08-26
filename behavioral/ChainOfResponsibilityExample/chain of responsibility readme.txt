# 🧩 Chain of Responsibility Pattern in Java

This repository demonstrates the **Chain of Responsibility Design Pattern** in Java using a request handling example.

---

## What is the Chain of Responsibility Pattern?

The **Chain of Responsibility Pattern** passes a request along a chain of handlers. Each handler decides either to process the request or to pass it to the next handler in the chain.

---

## How is It Useful in Coding?

- ✅ Decouples sender and receiver  
- ✅ Supports dynamic addition/removal of handlers  
- ✅ Promotes flexibility in assigning responsibilities

---

## Project File Structure (Java)

```plaintext
ChainOfResponsibilityExample/
└── src/
    └── com/
        └── designpatterns/
            └── chainofresponsibility/
                └── Main.java
```

---

## How to Run

```sh
javac src/com/designpatterns/chainofresponsibility/Main.java
java -cp src com.designpatterns.chainofresponsibility.Main
```

---

## ✅ Using Chain of Responsibility Pattern

- Handlers are linked in a chain  
- Each handler can process or forward the request

```java
Handler handler1 = new ConcreteHandler1();
Handler handler2 = new ConcreteHandler2();
handler1.setNext(handler2);
handler1.handle(request);
```

---

## ❌ Without Chain of Responsibility Pattern

- All logic must be handled in a single class  
- Hard to extend or modify the chain

---

## Example Output

```
Request handled by Handler2
```

---

## Pattern Used

This example uses the **Chain of Responsibility Pattern** for flexible request handling.