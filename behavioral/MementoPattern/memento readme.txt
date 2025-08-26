# 🧩 Memento Pattern in Java

This repository demonstrates the **Memento Design Pattern** in Java using a text editor history example.

---

## What is the Memento Pattern?

The **Memento Pattern** captures and externalizes an object's internal state so that it can be restored later, without violating encapsulation.

---

## How is It Useful in Coding?

- ✅ Enables undo/redo functionality  
- ✅ Preserves encapsulation  
- ✅ Simplifies state management

---

## Project File Structure (Java)

```plaintext
MementoPattern/
├── src/
│   ├── History.java
│   ├── Main.java
│   ├── Memento.java
│   └── TextEditor.java
└── README.md
```

---

## How to Run

```sh
javac src/*.java
java -cp src Main
```

---

## ✅ Using Memento Pattern

- Saves and restores text editor state  
- Supports undo/redo operations

```java
TextEditor editor = new TextEditor();
editor.setText("Hello");
history.save(editor.createMemento());
editor.setText("Hello, World!");
editor.restore(history.undo());
```

---

## ❌ Without Memento Pattern

- Must manage state manually  
- Can break encapsulation

---

## Example Output

```
Current Text: Hello
Current Text: Hello, World!
Undo: Hello
```

---

## Pattern Used

This example uses the **Memento Pattern** to implement undo/redo in a text editor.