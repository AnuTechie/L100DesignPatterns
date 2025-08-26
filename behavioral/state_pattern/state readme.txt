# 🧩 State Pattern in Java

This repository demonstrates the **State Design Pattern** in Java using a traffic light example.

---

## What is the State Pattern?

The **State Pattern** allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

---

## How is It Useful in Coding?

- ✅ Simplifies state-dependent behavior  
- ✅ Promotes cleaner code by separating state logic  
- ✅ Makes it easy to add new states

---

## Project File Structure (Java)

```plaintext
state_pattern/
├── GreenLight.java
├── Main.java
├── RedLight.java
├── TrafficLight.java
├── TrafficLightState.java
└── YellowLight.java
```

---

## How to Run

```sh
javac *.java
java Main
```

---

## ✅ Using State Pattern

- Each state is encapsulated in its own class  
- Traffic light changes behavior based on current state

```java
TrafficLight light = new TrafficLight();
light.change(); // Red to Green
light.change(); // Green to Yellow
light.change(); // Yellow to Red
```

---

## ❌ Without State Pattern

- All state logic