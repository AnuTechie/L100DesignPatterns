# 🧩 Prototype Pattern in Java

This repository demonstrates the **Prototype Design Pattern** in Java using a game character cloning example.

---

## What is the Prototype Pattern?

The **Prototype Pattern** creates new objects by copying an existing object, known as the prototype. It is useful when object creation is costly or complex.

---

## How is It Useful in Coding?

- ✅ Reduces the cost of creating complex objects  
- ✅ Simplifies object creation logic  
- ✅ Supports dynamic object creation at runtime

---

## Project File Structure (Java)

```plaintext
prototypePattern/
├── Game.java
└── characters/
    ├── GameCharacter.java
    ├── Mage.java
    └── Warrior.java
```

---

## How to Run

```sh
javac characters/*.java Game.java
java prototypePattern.Game
```

---

## ✅ Using Prototype Pattern

- Clone existing character objects to create new ones  
- Avoids repetitive initialization

```java
GameCharacter mage = new Mage("Gandalf", 100);
GameCharacter mageClone = mage.clone();
```

---

## ❌ Without Prototype Pattern

- Must create each object from scratch  
- Increases code duplication and complexity

---

## Example Output

```
Mage Gandalf with power 100
Mage Gandalf with power 100
```

---

## Pattern Used

This example uses the **Prototype Pattern** to clone game character objects.