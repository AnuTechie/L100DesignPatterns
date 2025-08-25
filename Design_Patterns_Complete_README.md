
# **L100 Design Pattern Series**  

This repository contains Java implementations of **Creational**, **Structural**, and **Behavioral** design patterns.  
Each example demonstrates a **real-world scenario** to make understanding the patterns easier and more practical.

---

## **🚀 Steps to Execute the Code**

### **1. Clone the Repository**
```bash
git clone https://github.com/AnuTechie/L100-Design-Patterns.git
cd L100-Design-Patterns
```

### **2. Open the Project**
- Open the folder in **IntelliJ IDEA**, **Eclipse**, **VS Code**, or any Java IDE.
- Ensure **Java JDK 8+** is installed:
```bash
java -version
```

### **3. Run Any Pattern**
- Each design pattern has its **own package**.
- Open the respective folder → Find the **`Main.java`** file → **Right-click → Run**.

**Alternatively, run via terminal:**
```bash
cd src/creationalPatterns/singleton
javac *.java
java Main
```

### **4. Project Structure**
```
L100-Design-Patterns/
│── creationalPatterns/
│   ├── singleton/
│   ├── factory/
│   ├── builder/
│── structuralPatterns/
│   ├── adapter/
│   ├── bridge/
│   ├── facade/
│── behavioralPatterns/
│   ├── observer/
│   ├── strategy/
│   ├── command/
│── README.md
```
---

# **📌 Creational Design Patterns**  

## **1. Singleton Pattern — Unique ID Generator**
Generates **unique IDs** using a **single instance** of the `UniqueIdService`.

### Without Using Singleton
- Multiple instances create **duplicate IDs**.
- High **memory usage**.
- No **central control**.

### With Singleton
- Single instance reused everywhere.
- Ensures **unique IDs**.
- Saves memory.

### Advantages
- Global access.
- Reduced memory.
- Centralized management.

---

## **2. Factory Pattern — Notification System**
Creates notification objects like **Email**, **SMS**, **Push**.

### Without Using Factory
- Need to manually create objects everywhere.
- Hard to manage when adding new notification types.

### With Factory
- Uses a central **factory method** to create objects.
- Easy to add/remove notification types.

### Advantages
- Clean, modular, extensible.
- Decouples creation from implementation.

---

## **3. Abstract Factory Pattern — Theme-Based GUI**
Creates families of UI components like **Buttons** and **Checkboxes**.

### Without Abstract Factory
- Each UI element must be manually instantiated.
- Difficult to maintain consistency.

### With Abstract Factory
- Centralized factory manages all related objects.
- Ensures consistent look & feel.

### Advantages
- Scalable and reusable.
- Makes adding new themes easy.

---

## **4. Builder Pattern — Robot Construction**
Builds **complex objects** like robots step by step.

### Without Builder
- Constructors become too complex with many parameters.
- Code readability decreases.

### With Builder
- Builds object step-by-step.
- Allows flexible customization.

### Advantages
- Cleaner code.
- Easier to modify.

---

## **5. Prototype Pattern — Game Character Cloning**
Clones **game characters** efficiently.

### Without Prototype
- Creating objects repeatedly is time-consuming.
- Higher memory usage.

### With Prototype
- Clone existing object instead of recreating.
- Faster and efficient.

### Advantages
- Saves time.
- Improves performance.

---

# **📌 Structural Design Patterns**  

## **6. Adapter Pattern — Legacy Printer Integration**
Bridges old printers (`OldPrinter`) with modern systems.

### Without Adapter
- Cannot connect incompatible interfaces.
- Code duplication required.

### With Adapter
- Adapts legacy printer to modern interface.
- Promotes reusability.

### Advantages
- Flexible integration.
- No need to modify old code.

---

## **7. Bridge Pattern — Video Streaming Platform**
Separates **abstraction** from **implementation**.

### Without Bridge
- Class explosion when combining multiple platforms and qualities.

### With Bridge
- Separate hierarchies for platform & quality.
- Combine dynamically.

### Advantages
- Reduces class count.
- Increases flexibility.

---

## **8. Composite Pattern — File System Structure**
Handles **files** and **folders** uniformly.

### Without Composite
- Different code for files vs folders.
- Difficult recursive handling.

### With Composite
- Treats files & folders the same.
- Recursive operations become simple.

### Advantages
- Cleaner code.
- Simplifies hierarchy handling.

---

## **9. Decorator Pattern — Coffee Shop Billing**
Adds features dynamically, e.g., Milk, Sugar, Cream.

### Without Decorator
- Multiple subclasses needed for each combination.
- Hard to scale.

### With Decorator
- Wrap base object with decorators.
- Add/remove features easily.

### Advantages
- Extensible.
- Avoids subclass explosion.

---

## **10. Facade Pattern — Bank Account Creation**
Provides a **simplified interface**.

### Without Facade
- Client must call many services manually.
- Complex integration.

### With Facade
- Single entry point handles all services internally.

### Advantages
- Simplifies usage.
- Reduces dependencies.

---

## **11. Flyweight Pattern — Car Rental System**
Reuses **shared CarModel objects**.

### Without Flyweight
- Each car creates a new model object.
- Wastes memory.

### With Flyweight
- Reuses same CarModel where possible.
- Stores unique details separately.

### Advantages
- Saves memory.
- Improves efficiency.

---

## **12. Proxy Pattern — Internet Access Control**
Controls access based on roles.

### Without Proxy
- Directly grants access to everyone.
- Security risks.

### With Proxy
- Proxy validates roles before granting access.

### Advantages
- Better security.
- Access control centralized.

---

# **📌 Behavioral Design Patterns**  

## **13. Template Method Pattern — Food Delivery**
Defines a **fixed workflow**.

### Without Template
- Duplicate logic for each platform.
- Difficult maintenance.

### With Template
- Common workflow in base class.
- Subclasses override specific steps.

### Advantages
- Reduces code duplication.
- Easier updates.

---

## **14. Mediator Pattern — Chat Room**
Manages communication through a **mediator**.

### Without Mediator
- All objects talk directly → complex dependencies.

### With Mediator
- Objects interact only with mediator.

### Advantages
- Simplifies communication.
- Reduces coupling.

---

## **15. Chain of Responsibility — IT Support**
Passes requests across multiple support levels.

### Without Chain
- All requests handled in one class → messy code.

### With Chain
- Each level handles what it can, forwards rest.

### Advantages
- Clean code.
- Flexible handling.

---

## **16. Observer Pattern — Traffic Management**
Updates subscribers automatically.

### Without Observer
- Must manually notify each subscriber.
- High coupling.

### With Observer
- Publisher automatically notifies observers.

### Advantages
- Real-time updates.
- Scalable notifications.

---

## **17. Strategy Pattern — Delivery Options**
Chooses algorithm dynamically.

### Without Strategy
- Multiple `if-else` blocks to select delivery method.

### With Strategy
- Switches algorithms easily at runtime.

### Advantages
- More flexible.
- Cleaner logic.

---

## **18. Command Pattern — Remote Control**
Encapsulates actions into objects.

### Without Command
- Directly executes actions → tightly coupled.

### With Command
- Commands stored, queued, undone easily.

### Advantages
- Undo/redo support.
- Decoupled design.

---

## **19. State Pattern — Traffic Lights**
Encapsulates behavior per state.

### Without State
- Large switch/if blocks handle state transitions.

### With State
- Each state has its own class.

### Advantages
- Cleaner code.
- Easier to extend.

---

## **20. Visitor Pattern — Hospital Billing**
Separates billing logic.

### Without Visitor
- Billing code spread across classes.

### With Visitor
- Visitor calculates billing separately.

### Advantages
- Easy to add operations.
- Keeps objects clean.

---

## **21. Interpreter Pattern — Smart Home**
Parses and executes commands.

### Without Interpreter
- Hardcoded logic for every command.

### With Interpreter
- Translates input into actions dynamically.

### Advantages
- Flexible command handling.
- Extensible for new instructions.

---

## **22. Iterator Pattern — Playlist System**
Traverses songs in order.

### Without Iterator
- Must manage indexes manually.

### With Iterator
- Uses `hasNext()` & `next()` for easy traversal.

### Advantages
- Cleaner code.
- Hides data structure complexity.

---

## **23. Memento Pattern — Text Editor Undo**
Restores previous states.

### Without Memento
- Cannot undo changes easily.
- No state history.

### With Memento
- Saves and restores object states.

### Advantages
- Enables undo.
- Easy state management.
