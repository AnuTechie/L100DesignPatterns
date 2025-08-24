
# **L100 Design Pattern Series**  

This repository contains Java implementations of **Creational**, **Structural**, and **Behavioral** design patterns.  
Each example demonstrates a **real-world scenario** to make understanding the patterns easier and more practical.

---

## **📌 Creational Design Patterns**  
Creational patterns focus on **object creation mechanisms**, improving **flexibility** and **reuse**.

### **1. Singleton Pattern — Unique ID Generator**  
Generates **unique IDs** using a **single instance** of the `UniqueIdService` across the application, ensuring **centralized ID management**.

### **2. Factory Pattern — Notification System**  
Uses a **NotificationFactory** to create objects like **Email**, **SMS**, and **Push** notifications without exposing creation logic, making the system **extensible**.

### **3. Abstract Factory Pattern — Theme-Based GUI**  
Creates families of related objects like **Buttons** and **Checkboxes** for **Light** and **Dark** themes using an abstract factory, keeping the design **scalable**.

### **4. Builder Pattern — Robot Construction**  
Constructs **complex robot objects** step by step with different builders (e.g., `HumanoidRobotBuilder`, `IndustrialRobotBuilder`), allowing **customization**.

### **5. Prototype Pattern — Game Character Cloning**  
Clones **game characters** like **Warrior** and **Mage** instead of recreating them, making object creation **faster** and **memory-efficient**.

---

## **📌 Structural Design Patterns**  
Structural patterns focus on **how classes and objects are combined** to form larger, efficient structures.

### **1. Adapter Pattern — Legacy Printer Integration**  
Bridges incompatible interfaces by using an **adapter**. The `OldPrinterAdapter` lets a legacy `OldPrinter` with `oldPrint()` work with `ModernPrinter.print()` seamlessly.

### **2. Bridge Pattern — Video Streaming Platform**  
Decouples **abstraction** (`StreamingPlatform`: Netflix, YouTube) from **implementation** (`StreamingQuality`: HD, SD), making the system **flexible** and avoiding class explosion.

### **3. Composite Pattern — File System Structure**  
Treats **files** and **folders** uniformly using a `FileSystemItem` interface, enabling recursive operations like **displaying contents** and **searching**.

### **4. Decorator Pattern — Coffee Shop Billing System**  
Dynamically adds features like **Milk**, **Sugar**, and **Cream** to a `SimpleCoffee` object without modifying the base class, ensuring **flexibility**.

### **5. Facade Pattern — Bank Account Creation**  
The `BankAccountFacade` acts as a **single entry point** to handle multiple services like `KYCVerifier`, `CreditCheck`, and `CardService`, simplifying the client interaction.

### **6. Flyweight Pattern — Car Rental System**  
Reuses shared `CarModel` objects for cars with the same specifications while maintaining unique details like **registration** and **rental duration**, optimizing **memory usage**.

### **7. Proxy Pattern — Office Internet Access Control**  
Controls internet access based on employee roles using a `ProxyInternetAccess` that decides whether to allow or deny requests, ensuring **secure resource usage**.

---

## **📌 Behavioral Design Patterns**  
Behavioral patterns focus on **how objects communicate** and **delegate responsibilities**.

### **1. Template Method Pattern — Food Delivery System**  
Defines a **fixed algorithm** for ordering food (select restaurant → place order → payment → delivery), while platforms like **Swiggy** and **Zomato** customize payment and delivery.

### **2. Mediator Pattern — Chat Room Communication**  
The `ChatRoomMediator` manages communication between users, ensuring they **don’t interact directly**, reducing **tight coupling**.

### **3. Chain of Responsibility Pattern — IT Support Ticket System**  
Passes requests like **password resets** or **server issues** through multiple support levels until one resolves it, improving **flexibility in request handling**.

### **4. Observer Pattern — Smart Traffic Management System**  
The `TrafficController` (subject) notifies **ambulances**, **buses**, and **apps** (observers) whenever traffic conditions change, enabling **real-time updates**.

### **5. Strategy Pattern — Food Delivery Options**  
Chooses a **delivery strategy** (bike, car, drone) at runtime without modifying existing code, making the system **extensible and dynamic**.

### **6. Command Pattern — Remote Control System**  
Encapsulates **requests as objects**, allowing commands like **turning devices ON/OFF** to be queued, executed, or undone independently of the invoker.

### **7. State Pattern — Traffic Light System**  
Encapsulates states like **STOP**, **GO**, and **GET READY** into separate classes. The `TrafficLight` switches states dynamically, avoiding complex **if-else chains**.

### **8. Visitor Pattern — Hospital Billing System**  
Separates billing logic from services. The `BillingVisitor` calculates costs for objects like **Consultation**, **Surgery**, and **LabTest** without modifying their classes.

### **9. Interpreter Pattern — Smart Home Command System**  
Parses and executes commands like **"TURN ON LIGHT"**, **"TURN OFF FAN"**, and **"SET TEMPERATURE 24"**, translating human-readable instructions into actions.

### **10. Iterator Pattern — Music Playlist System**  
Provides an **iterator** to traverse songs in a playlist using `hasNext()` and `next()` without exposing the playlist’s internal structure.

### **11. Memento Pattern — Text Editor Undo Feature**  
Stores previous states of the `TextEditor` in a stack (`History`) and restores them when the user performs an **undo**, enabling **version control**.

---

## **📌 Summary Table**

| **Category**      | **Pattern**         | **Scenario**                      | **Key Benefit**                |
|--------------------|---------------------|----------------------------------|--------------------------------|
| Creational        | Singleton          | Unique ID Generator             | Centralized object management |
|                  | Factory           | Notification System            | Flexible & extensible         |
|                  | Abstract Factory | Theme-Based GUI               | Scalable & reusable          |
|                  | Builder          | Robot Construction          | Customizable object creation |
|                  | Prototype       | Game Character Cloning     | Faster, memory-efficient    |
| Structural       | Adapter        | Legacy Printer Integration | Bridges incompatible APIs   |
|                  | Bridge       | Streaming Platform      | Avoids class explosion     |
|                  | Composite   | File System Structure | Uniform object handling   |
|                  | Decorator  | Coffee Shop Billing  | Dynamically adds features |
|                  | Facade   | Bank Account Creation | Simplifies client usage  |
|                  | Flyweight | Car Rental System   | Optimizes memory        |
|                  | Proxy   | Internet Access Control | Secures resources     |
| Behavioral      | Template | Food Delivery System | Consistent workflows   |
|                | Mediator | Chat Room System   | Reduces dependencies |
|                | Chain of Resp. | IT Support System | Flexible escalation  |
|                | Observer | Traffic Management | Real-time updates  |
|                | Strategy | Delivery Options | Dynamic behavior  |
|                | Command | Remote Control  | Undo & queuing  |
|                | State   | Traffic Lights | Cleaner transitions |
|                | Visitor | Hospital Billing | Separates logic |
|                | Interpreter | Smart Home | Translates commands |
|                | Iterator | Playlist | Simplifies traversal |
|                | Memento | Text Editor | Enables undo |
