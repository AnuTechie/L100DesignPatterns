# 🧩 Interpreter Pattern in Java

This repository demonstrates the **Interpreter Design Pattern** in Java using a smart home command interpreter example.

---

## What is the Interpreter Pattern?

The **Interpreter Pattern** defines a representation for a grammar and an interpreter to interpret sentences in the language.

---

## How is It Useful in Coding?

- ✅ Useful for implementing simple languages or expressions  
- ✅ Makes it easy to add new grammar rules  
- ✅ Promotes extensibility

---

## Project File Structure (Java)

```plaintext
interpreter_pattern/
├── Expression.java
├── Interpreter.java
├── Main.java
├── SetTemperature.java
├── TurnOff.java
└── TurnOn.java
```

---

## How to Run

```sh
javac *.java
java Main
```

---

## ✅ Using Interpreter Pattern

- Each command is represented as an expression  
- Interpreter parses and executes commands

```java
Expression turnOn = new TurnOn();
turnOn.interpret("Turn on the light");
```

---

## ❌ Without Interpreter Pattern

- All parsing and execution logic is in a single class  
- Hard to extend or modify the language

---

## Example Output

```
Turning on the light
```

---

## Pattern Used

This example uses the **Interpreter Pattern** to interpret smart home commands.