# 🧩 Command Pattern in Java

This repository demonstrates the **Command Design Pattern** in Java using a light control example.

---

## What is the Command Pattern?

The **Command Pattern** encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.

---

## How is It Useful in Coding?

- ✅ Decouples sender and receiver  
- ✅ Supports undo/redo operations  
- ✅ Enables logging and queuing of requests

---

## Project File Structure (Java)

```plaintext
CommandPatternLight/
├── Command.java
├── Light.java
├── Main.java
├── RemoteControl.java
├── TurnOffLightCommand.java
└── TurnOnLightCommand.java
```

---

## How to Run

```sh
javac *.java
java Main
```

---

## ✅ Using Command Pattern

- Commands are encapsulated as objects  
- Remote control can execute any command

```java
Command turnOn = new TurnOnLightCommand(light);
remoteControl.setCommand(turnOn);
remoteControl.pressButton();
```

---

## ❌ Without Command Pattern

- All logic is in the invoker  
- Hard to add new commands or features

---

## Example Output

```
Light is ON
```

---

## Pattern Used

This example uses the **Command Pattern** to control a light using commands.