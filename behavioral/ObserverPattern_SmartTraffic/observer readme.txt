# 🧩 Observer Pattern in Java

This repository demonstrates the **Observer Design Pattern** in Java using a smart traffic notification system.

---

## What is the Observer Pattern?

The **Observer Pattern** defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

---

## How is It Useful in Coding?

- ✅ Enables event-driven programming  
- ✅ Promotes loose coupling  
- ✅ Supports dynamic subscription

---

## Project File Structure (Java)

```plaintext
ObserverPattern_SmartTraffic/
└── src/
    └── smarttraffic/
        ├── AmbulanceService.java
        ├── CitizenMobileApp.java
        ├── DeliveryPartner.java
        ├── Main.java
        ├── PublicTransport.java
        ├── TrafficController.java
        ├── TrafficObserver.java
        └── TrafficSubject.java
```

---

## How to Run

```sh
javac src/smarttraffic/*.java
java -cp src smarttraffic.Main
```

---

## ✅ Using Observer Pattern

- Observers subscribe to traffic updates  
- All observers are notified of changes

```java
TrafficController controller = new TrafficController();
controller.addObserver(new AmbulanceService());
controller.notifyObservers("Accident on Main Street");
```

---

## ❌ Without Observer Pattern

- Must notify each observer manually  
- Increases code complexity

---

## Example Output

```
Ambulance notified: Accident on Main Street
Citizen notified: Accident on Main Street
```

---

## Pattern Used

This example uses the **Observer Pattern** for smart traffic notifications.