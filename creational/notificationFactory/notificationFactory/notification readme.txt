# 🧩 Factory Method Pattern in Java

This repository demonstrates the **Factory Method Design Pattern** in Java using a notification system example.

---

## What is the Factory Method Pattern?

The **Factory Method Pattern** defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.

---

## How is It Useful in Coding?

- ✅ Encapsulates object creation  
- ✅ Promotes code reuse and flexibility  
- ✅ Makes it easy to add new product types

---

## Project File Structure (Java)

```plaintext
notificationFactory/
├── NotificationApp.java
├── factory/
│   └── NotificationFactory.java
├── notifications/
│   ├── EmailNotification.java
│   ├── Notification.java
│   ├── PushNotification.java
│   └── SMSNotification.java
```

---

## How to Run

```sh
javac notifications/*.java factory/*.java NotificationApp.java
java notificationFactory.NotificationApp
```

---

## ✅ Using Factory Method Pattern

- Factory creates the appropriate notification type  
- Client code is decoupled from concrete classes

```java
Notification notification = NotificationFactory.createNotification("EMAIL");
notification.notifyUser();
```

---

## ❌ Without Factory Method Pattern

- Client must instantiate each notification type manually  
- Hard to add new notification types

---

## Example Output

```
Sending an Email Notification
```

---

## Pattern Used

This example uses the **Factory Method Pattern** to create different types of notifications.