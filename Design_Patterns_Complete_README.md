
# **L100 Design Pattern Series**  

This repository contains Java implementations of **Creational**, **Structural**, and **Behavioral** design patterns.  
Each example demonstrates **real-world scenarios** and includes **problem vs solution code snippets** to clearly show the benefits of using each pattern.

---

# **🚀 Steps to Execute the Code**

### **1. Clone the Repository**
```bash
git clone https://github.com/AnuTechie/L100-Design-Patterns.git
cd L100-Design-Patterns
```

### **2. Open the Project**
- Open the folder in **IntelliJ IDEA**, **Eclipse**, or **VS Code**.
- Ensure **Java JDK 8+** is installed:
```bash
java -version
```

### **3. Run Any Pattern**
Each design pattern has its own package.  
Go to the respective folder → Open `Main.java` → **Right-click → Run**.

**Or run via terminal:**
```bash
cd src/creationalPatterns/singleton
javac *.java
java Main
```

---

# **📌 Creational Design Patterns**  

## **1. Singleton Pattern — Unique ID Generator**  
Generates **unique IDs** using a single shared instance.

### **Without Singleton**
```java
UniqueIdService obj1 = new UniqueIdService();
UniqueIdService obj2 = new UniqueIdService();

System.out.println(obj1.generateId());  // ID-1
System.out.println(obj2.generateId());  // ID-1  ❌ Duplicate IDs!
```

### **With Singleton**
```java
UniqueIdService service1 = UniqueIdService.getInstance();
UniqueIdService service2 = UniqueIdService.getInstance();

System.out.println(service1.generateId());  // ID-1 ✅
System.out.println(service2.generateId());  // ID-2 ✅
```

**Advantages:** Unique IDs, centralized control, reduced memory usage.

---

## **2. Factory Pattern — Notification System**  
Creates notifications like **Email**, **SMS**, and **Push** dynamically.

### **Without Factory**
```java
EmailNotification email = new EmailNotification();
email.send();

SMSNotification sms = new SMSNotification();
sms.send();
```
❌ You must manually manage object creation everywhere.

### **With Factory**
```java
Notification n = NotificationFactory.createNotification("EMAIL");
n.send();
```
✅ Factory decides which object to create, keeping the client clean.

**Advantages:** Decouples object creation, easily extensible.

---

## **3. Abstract Factory Pattern — Theme-Based GUI**  
Creates **families of related UI components**.

### **Without Abstract Factory**
```java
Button darkBtn = new DarkButton();
Checkbox lightCb = new LightCheckbox();
```
❌ Inconsistent themes, hard to manage UI.

### **With Abstract Factory**
```java
ThemeFactory themeFactory = new DarkThemeFactory();
Button btn = themeFactory.createButton();
Checkbox cb = themeFactory.createCheckbox();
btn.paint();
cb.paint();
```
✅ Consistent look & feel with centralized control.

**Advantages:** Ensures theme consistency, easier scaling.

---

## **4. Builder Pattern — Robot Construction**  
Constructs complex objects step by step.

### **Without Builder**
```java
Robot robot = new Robot("Metal", 4, true, false, "AI-Enabled");
```
❌ Hard to read, error-prone with too many parameters.

### **With Builder**
```java
Robot robot = new RobotBuilder()
    .setMaterial("Metal")
    .setWheels(4)
    .setAIEnabled(true)
    .build();
```
✅ Flexible, readable, and avoids constructor overloading.

**Advantages:** Clean object construction, highly customizable.

---

## **5. Prototype Pattern — Game Character Cloning**  
Efficiently clones **game characters**.

### **Without Prototype**
```java
Character c1 = new Character("Warrior", 100, 50);
Character c2 = new Character("Warrior", 100, 50); // Redundant
```
❌ Wastes memory by recreating objects.

### **With Prototype**
```java
Character c1 = new Character("Warrior", 100, 50);
Character c2 = c1.clone();
```
✅ Clones objects instantly.

**Advantages:** Saves memory, improves performance.

---

# **📌 Structural Design Patterns**  

## **6. Adapter Pattern — Legacy Printer Integration**  
Connects modern systems with **old printers**.

### **Without Adapter**
```java
OldPrinter oldPrinter = new OldPrinter();
oldPrinter.oldPrint("Hello");  // ❌ Doesn't match modern interface
```

### **With Adapter**
```java
ModernPrinter printer = new OldPrinterAdapter(new OldPrinter());
printer.print("Hello World!");  // ✅ Works seamlessly
```

**Advantages:** Integrates incompatible systems easily.

---

## **7. Bridge Pattern — Video Streaming**  
Separates **platforms** and **qualities** into two hierarchies.

### **Without Bridge**
```java
NetflixHD n1 = new NetflixHD();
NetflixSD n2 = new NetflixSD();
YouTubeHD y1 = new YouTubeHD();
```
❌ Class explosion when combining features.

### **With Bridge**
```java
StreamingPlatform netflix = new Netflix(new HDQuality());
netflix.play();
```
✅ Flexible combinations without extra classes.

**Advantages:** Reduces class count, easy scalability.

---

## **8. Composite Pattern — File System**  
Manages **files** and **folders** uniformly.

### **Without Composite**
```java
File file = new File("abc.txt", 5);
Folder folder = new Folder("Docs");
folder.addFile(file);
```
❌ Extra handling for each type separately.

### **With Composite**
```java
FileSystemItem folder = new Folder("Docs");
folder.add(new File("abc.txt", 5));
folder.showDetails();
```
✅ Treats files and folders the same.

**Advantages:** Simplifies hierarchical data management.

---

## **9. Decorator Pattern — Coffee Shop Billing**  
Adds coffee customizations dynamically.

### **Without Decorator**
```java
Coffee coffee = new MilkSugarCreamCoffee();
System.out.println(coffee.cost());  // Hardcoded combos
```
❌ Must create new subclasses for every combo.

### **With Decorator**
```java
Coffee coffee = new SimpleCoffee();
coffee = new MilkDecorator(coffee);
coffee = new SugarDecorator(coffee);
System.out.println(coffee.cost());  // ✅ Flexible pricing
```
**Advantages:** Extensible, avoids subclass explosion.

---

## **10. Facade Pattern — Bank Account Creation**  
Provides a **simplified interface** for complex services.

### **Without Facade**
```java
new KYCVerifier().verify();
new CreditCheck().check();
new AccountCreator().create();
new CardService().issue();
```
❌ Client must manage multiple services manually.

### **With Facade**
```java
BankAccountFacade account = new BankAccountFacade();
account.createNewAccount();
```
✅ Single entry point handles all.

**Advantages:** Cleaner client code, hides system complexity.

---

## **11. Flyweight Pattern — Car Rental System**  
Reuses **car model objects**.

### **Without Flyweight**
```java
Car car1 = new Car("Honda City", "Petrol", "Red");
Car car2 = new Car("Honda City", "Petrol", "Blue"); // Redundant model data
```

### **With Flyweight**
```java
CarModel model = CarModelFactory.getModel("Honda City", "Petrol");
Car car1 = new Car("Red", model);
Car car2 = new Car("Blue", model);
```
✅ Reuses the same car model object.

**Advantages:** Saves memory, faster performance.

---

## **12. Proxy Pattern — Internet Access Control**  
Restricts **internet access** based on role.

### **Without Proxy**
```java
RealInternetAccess access = new RealInternetAccess("Bob");
access.grantInternetAccess();  // ❌ Everyone gets access
```

### **With Proxy**
```java
OfficeInternetAccess emp = new ProxyInternetAccess("Bob");
emp.grantInternetAccess();  // ✅ Denied if unauthorized
```
**Advantages:** Better security, centralized control.

---

# **📌 Behavioral Design Patterns**  

## **13. Template Method Pattern — Food Delivery**  
Defines **fixed steps** for placing an order.

### **Without Template**
```java
Zomato zomato = new Zomato();
zomato.selectRestaurant();
zomato.placeOrder();
zomato.pay();
zomato.deliver();
```
❌ Duplicate steps in every platform.

### **With Template**
```java
FoodDeliveryApp app = new Zomato();
app.processOrder();  // ✅ Template manages the flow
```
**Advantages:** Less duplication, reusable algorithm.

---

## **14. Mediator Pattern — Chat Room**  
Centralizes communication between users.

### **Without Mediator**
```java
User a = new User("Alice");
User b = new User("Bob");
a.sendMessage("Hi Bob");  // ❌ Direct dependency
b.sendMessage("Hi Alice");
```

### **With Mediator**
```java
ChatMediator mediator = new ChatRoom();
User alice = new ChatUser(mediator, "Alice");
User bob = new ChatUser(mediator, "Bob");
alice.send("Hi Bob");
```
✅ Mediator manages all communication.

**Advantages:** Reduces dependencies, clean code.

---

## **15. Chain of Responsibility — IT Support**  
Passes issues across support levels.

### **Without Chain**
```java
if (issue.equals("password")) resetPassword();
else if (issue.equals("install")) installSoftware();
else if (issue.equals("server")) fixServer();
```
❌ Lots of conditionals, hard to manage.

### **With Chain**
```java
SupportHandler l1 = new Level1Handler();
SupportHandler l2 = new Level2Handler();
l1.setNext(l2);
l1.handleRequest("server down");
```
✅ Each handler only processes relevant requests.

**Advantages:** Cleaner, flexible request routing.

---

## **16. Observer Pattern — Smart Traffic System**  
Updates multiple subscribers automatically.

### **Without Observer**
```java
ambulance.update();
bus.update();
rider.update();
```
❌ Manual notifications for each subscriber.

### **With Observer**
```java
TrafficController controller = new TrafficController();
controller.attach(new AmbulanceApp());
controller.attach(new BusApp());
controller.notifyObservers();
```
✅ Automatically updates all observers.

**Advantages:** Real-time notifications, low coupling.

---

## **17. Strategy Pattern — Delivery Options**  
Chooses the best delivery mode dynamically.

### **Without Strategy**
```java
if (distance < 5) deliverByBike();
else deliverByCar();
```
❌ Adding new methods requires code changes everywhere.

### **With Strategy**
```java
DeliveryStrategy strategy = new BikeDelivery();
FoodDelivery delivery = new FoodDelivery(strategy);
delivery.deliver();
```
✅ Algorithms can be swapped easily.

**Advantages:** Flexible, eliminates big conditional blocks.

---

## **18. Command Pattern — Remote Control**  
Encapsulates actions into command objects.

### **Without Command**
```java
Light light = new Light();
light.turnOn();
light.turnOff();
```
❌ Tightly coupled, cannot undo.

### **With Command**
```java
Command onCommand = new LightOnCommand(new Light());
RemoteControl remote = new RemoteControl(onCommand);
remote.pressButton();
```
✅ Supports queuing, undo, and redo.

**Advantages:** Decoupled, reusable, flexible.

---

## **19. State Pattern — Traffic Light System**  
Changes behavior based on state.

### **Without State**
```java
if (signal.equals("RED")) stop();
else if (signal.equals("GREEN")) go();
else wait();
```
❌ Becomes unmanageable with more states.

### **With State**
```java
TrafficLight light = new TrafficLight();
light.setState(new GreenState());
light.change();
```
✅ Encapsulates each state cleanly.

**Advantages:** Cleaner transitions, easier to extend.

---

## **20. Visitor Pattern — Hospital Billing**  
Separates billing operations.

### **Without Visitor**
```java
Doctor d = new Doctor();
System.out.println(d.getBill() + lab.getBill());
```
❌ Adding new billing rules requires modifying all classes.

### **With Visitor**
```java
BillVisitor visitor = new BillCalculator();
doctor.accept(visitor);
lab.accept(visitor);
```
✅ New billing operations added without touching existing classes.

**Advantages:** Open for extension, closed for modification.

---

## **21. Interpreter Pattern — Smart Home Commands**  
Parses natural commands into actions.

### **Without Interpreter**
```java
if (cmd.equals("TURN ON LIGHT")) turnOnLight();
else if (cmd.equals("SET TEMPERATURE")) setTemp(24);
```
❌ Adding new commands gets messy.

### **With Interpreter**
```java
Expression expression = new CommandInterpreter("TURN ON LIGHT");
expression.interpret();
```
✅ Easily extendable for new commands.

**Advantages:** Clean, scalable command processing.

---

## **22. Iterator Pattern — Playlist System**  
Traverses a playlist without exposing structure.

### **Without Iterator**
```java
for (int i = 0; i < playlist.size(); i++) {
    System.out.println(playlist.get(i));
}
```
❌ Client depends on internal playlist structure.

### **With Iterator**
```java
Iterator<String> it = playlist.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```
✅ Hides complexity, works on any collection.

**Advantages:** Cleaner traversal, better abstraction.

---

## **23. Memento Pattern — Text Editor Undo**  
Saves and restores text versions.

### **Without Memento**
```java
text = "Version 1";
text = "Version 2";
text = "Version 3";  // ❌ Cannot undo
```

### **With Memento**
```java
TextEditor editor = new TextEditor();
History history = new History();

editor.setText("Version 1");
history.save(editor.save());

editor.setText("Version 2");
history.save(editor.save());

editor.restore(history.undo());
System.out.println(editor.getText());  // ✅ Version 1
```
**Advantages:** Enables undo/redo, manages history cleanly.

---
