package prototypePattern.characters;

public class Warrior implements GameCharacter {
    private String name;
    private String weapon;

    public Warrior(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    @Override
    public Warrior clone() {
        return new Warrior(this.name, this.weapon);
    }

    @Override
    public void display() {
        System.out.println("Warrior - Name: " + name + ", Weapon: " + weapon);
    }
}