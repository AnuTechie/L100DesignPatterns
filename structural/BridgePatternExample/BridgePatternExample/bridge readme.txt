# 🧩 Bridge Pattern in Java

This repository demonstrates the **Bridge Design Pattern** in Java using a streaming platform and quality abstraction example.

---

## What is the Bridge Pattern?

The **Bridge Pattern** decouples an abstraction from its implementation so that the two can vary independently. It is useful when both the abstractions and their implementations may change frequently.

---

## How is It Useful in Coding?

- ✅ Separates abstraction from implementation  
- ✅ Increases flexibility and scalability  
- ✅ Allows independent development of abstraction and implementation  
- ✅ Reduces code duplication

---

## Project File Structure (Java)

```plaintext
BridgePatternExample/
├── src/
│   ├── Main.java
│   └── bridge/
│       ├── HDQuality.java
│       ├── Netflix.java
│       ├── SDQuality.java
│       ├── StreamingPlatform.java
│       ├── StreamingQuality.java
│       └── YouTube.java
```

---

## How to Run

```sh
javac src/bridge/*.java src/Main.java
java -cp src Main
```

---

## ✅ Using Bridge Pattern

- Streaming platforms and quality are separate hierarchies  
- You can mix and match platforms and qualities

```java
StreamingQuality hd = new HDQuality();
StreamingPlatform netflix = new Netflix(hd);
netflix.play("Movie");
```

---

## ❌ Without Bridge Pattern

- You would need a class for every combination (e.g., NetflixHD, NetflixSD, YouTubeHD, etc.)  
- Code becomes hard to maintain and extend

---

## Example Output

```
Playing Movie on Netflix in HD quality.
```

---

## Pattern Used

This example uses the **Bridge Pattern** to decouple streaming platforms from streaming qualities.