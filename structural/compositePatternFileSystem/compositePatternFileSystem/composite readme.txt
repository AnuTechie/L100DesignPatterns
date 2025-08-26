# 🧩 Composite Pattern in Java

This repository demonstrates the **Composite Design Pattern** in Java by modeling a simple file system with files and folders.

---

## What is the Composite Pattern?

The **Composite Pattern** lets you compose objects into tree structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly.

---

## How is It Useful in Coding?

- ✅ Treats individual objects and groups of objects the same way  
- ✅ Simplifies client code by allowing uniform access  
- ✅ Makes it easy to add new kinds of components  
- ✅ Supports recursive structures

---

## Project File Structure (Java)

```plaintext
compositePatternFileSystem/
├── structure/
│   ├── File.java
│   ├── FileSystemItem.java
│   └── Folder.java
└── Main.java
```

---

## How to Run

```sh
javac structure/*.java Main.java
java Main
```

---

## ✅ Using Composite Pattern

- Both files and folders implement the same interface  
- You can treat a single file or a folder (with many files/folders) the same way  
- Simplifies recursive operations

```java
FileSystemItem file1 = new File("Resume.pdf", 120);
FileSystemItem folder = new Folder("Documents");
folder.add(file1);
folder.print("");
```

---

## ❌ Without Composite Pattern

- You need to handle files and folders separately  
- Code becomes more complex and less flexible

---

## Example Output

```
Folder: Root
  Folder: Documents
    File: Resume.pdf (120 KB)
    File: Photo.jpg (200 KB)
  Folder: Music
    File: Song.mp3 (5000 KB)
Total Size: 5320 KB
```

---

## Pattern Used

This example uses the **Composite Pattern** to treat individual files and folders uniformly.