
package com.designpatterns.chainofresponsibility;

// Abstract Handler
abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String issueType);
}

// Concrete Handler: Level 1 Support
class Level1Support extends SupportHandler {
    @Override
    public void handleRequest(String issueType) {
        if(issueType.equalsIgnoreCase("Password Reset")) {
            System.out.println("Level 1 Support: Handling password reset issue.");
        } else if(nextHandler != null) {
            nextHandler.handleRequest(issueType);
        } else {
            System.out.println("Issue cannot be handled.");
        }
    }
}

// Concrete Handler: Level 2 Support
class Level2Support extends SupportHandler {
    @Override
    public void handleRequest(String issueType) {
        if(issueType.equalsIgnoreCase("Software Installation")) {
            System.out.println("Level 2 Support: Handling software installation issue.");
        } else if(nextHandler != null) {
            nextHandler.handleRequest(issueType);
        } else {
            System.out.println("Issue cannot be handled.");
        }
    }
}

// Concrete Handler: Level 3 Support
class Level3Support extends SupportHandler {
    @Override
    public void handleRequest(String issueType) {
        if(issueType.equalsIgnoreCase("Server Down")) {
            System.out.println("Level 3 Support: Handling server down issue.");
        } else if(nextHandler != null) {
            nextHandler.handleRequest(issueType);
        } else {
            System.out.println("Issue cannot be handled.");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Creating handlers
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();

        // Setting the chain
        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        // Test the chain with different issues
        System.out.println("\n--- IT Support Ticket System ---");
        level1.handleRequest("Password Reset");
        level1.handleRequest("Software Installation");
        level1.handleRequest("Server Down");
        level1.handleRequest("Unknown Issue");
    }
}
