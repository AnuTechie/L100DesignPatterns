# 🧩 Iterator Pattern in Java

This repository demonstrates the **Iterator Design Pattern** in Java using a playlist example.

---

## What is the Iterator Pattern?

The **Iterator Pattern** provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

---

## How is It Useful in Coding?

- ✅ Simplifies traversal of complex data structures  
- ✅ Promotes encapsulation  
- ✅ Supports multiple simultaneous traversals

---

## Project File Structure (Java)

```plaintext
iterator_pattern/
├── Iterator.java
├── Main.java
├── Playlist.java
├── PlaylistIterator.java
└── Song.java
```

---

## How to Run

```sh
javac *.java
java Main
```

---

## ✅ Using Iterator Pattern

- Provides a standard way to iterate over a playlist  
- Hides the internal structure of the playlist

```java
Playlist playlist = new Playlist();
playlist.addSong(new Song("Song 1"));
Iterator iterator = playlist.createIterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next().getTitle());
}
```

---

## ❌ Without Iterator Pattern

- Client must manage traversal logic  
- Exposes internal data structure

---

## Example Output

```
Song 1
Song 2
Song 3
```

---

## Pattern Used

This example uses the **Iterator Pattern** to traverse a playlist.