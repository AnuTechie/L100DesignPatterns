
# **L100 Design Pattern Series**  

This repository contains Java implementations of **Creational**, **Structural**, and **Behavioral** design patterns.  
Each example demonstrates a **real-world scenario** to make understanding the patterns easier and more practical.

---

## ** Steps to Execute the Code**

### **1. Clone the Repository**
```bash
git clone https://github.com/AnuTechie/L100-Design-Patterns.git
cd L100-Design-Patterns
```

---

### **2. Open the Project**
- Open the folder in **IntelliJ IDEA**, **Eclipse**, **VS Code**, or any Java IDE.
- Ensure **Java JDK 8+** is installed:
```bash
java -version
```

---

### **3. Run Any Pattern**
- Each design pattern has its **own package**.
- Open the respective folder → Find the **`Main.java`** file → **Right-click → Run**.

**Alternatively, run via terminal:**
```bash
cd src/creationalPatterns/singleton
javac *.java
java Main
```
*(Change the folder name depending on the pattern, e.g., `observer`, `factory`, `strategy`, etc.)*

---

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
- Every pattern has its **own `Main.java` file** for execution.
