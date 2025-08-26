# 🧩 Proxy Pattern in Java

This repository demonstrates the **Proxy Design Pattern** in Java using an office internet access example.

---

## What is the Proxy Pattern?

The **Proxy Pattern** provides a surrogate or placeholder for another object to control access to it. It is useful for implementing access control, lazy initialization, logging, and more.

---

## How is It Useful in Coding?

- ✅ Controls access to sensitive or resource-intensive objects  
- ✅ Adds additional functionality (logging, caching, etc.)  
- ✅ Supports lazy initialization

---

## Project File Structure (Java)

```plaintext
proxyPatternInternetAccess/
├── proxy/
│   ├── OfficeInternetAccess.java
│   ├── ProxyInternetAccess.java
│   └── RealInternetAccess.java
└── Main.java
```

---

## How to Run

```sh
javac proxy/*.java Main.java
java Main
```

---

## ✅ Using Proxy Pattern

- Proxy checks access rights before granting internet access  
- Real object is created only if access is allowed

```java
OfficeInternetAccess access = new ProxyInternetAccess("John");
access.grantInternetAccess();
```

---

## ❌ Without Proxy Pattern

- All users can access the real object directly  
- No control or logging is possible

---

## Example Output

```
Internet Access granted for employee: John
```

---

## Pattern Used

This example uses the **Proxy Pattern** to control office internet access.