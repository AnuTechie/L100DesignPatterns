package prototypePattern;

import prototypePattern.characters.*;

public class Game {
    public static void main(String[] args) {
        GameCharacter baseWarrior = new Warrior("Thorin", "Axe");
        GameCharacter baseMage = new Mage("Elena", "Fireball");

        // Clone characters for different players
        GameCharacter warriorClone = baseWarrior.clone();
        GameCharacter mageClone = baseMage.clone();

        System.out.println("Cloned Characters:");
        warriorClone.display();
        mageClone.display();
    }
}