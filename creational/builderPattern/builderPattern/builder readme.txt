# 🧩 Builder Pattern in Java

This repository demonstrates the **Builder Design Pattern** in Java using a robot construction example.

---

## What is the Builder Pattern?

The **Builder Pattern** separates the construction of a complex object from its representation so that the same construction process can create different representations.

---

## How is It Useful in Coding?

- ✅ Simplifies construction of complex objects  
- ✅ Allows step-by-step construction  
- ✅ Supports different representations using the same process

---

## Project File Structure (Java)

```plaintext
builderPattern/
├── BuilderPattern.java
├── concretebuilders/
│   ├── humanoid/
│   │   └── HumanoidRobotBuilder.java
│   └── industrial/
│       └── IndustrialRobotBuilder.java
├── director/
│   └── RobotDirector.java
├── interfaces/
│   └── RobotBuilder.java
├── product/
│   └── Robot.java
```

---

## How to Run

```sh
javac interfaces/*.java concretebuilders/humanoid/*.java concretebuilders/industrial/*.java director/*.java product/*.java BuilderPattern.java
java builderPattern.BuilderPattern
```

---

## ✅ Using Builder Pattern

- Director controls the construction process  
- Builders create different types of robots

```java
RobotBuilder builder = new HumanoidRobotBuilder();
RobotDirector director = new RobotDirector(builder);
Robot robot = director.constructRobot();
```

---

## ❌ Without Builder Pattern

- Construction logic is mixed with object logic  
- Hard to create different representations

---

## Example Output

```
Humanoid Robot built with arms, legs, and AI
```

---

## Pattern Used

This example uses the **Builder Pattern** to construct different types of robots.