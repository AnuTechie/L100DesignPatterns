package prototypePattern.characters;

public class Mage implements GameCharacter {
    private String name;
    private String spell;

    public Mage(String name, String spell) {
        this.name = name;
        this.spell = spell;
    }

    @Override
    public Mage clone() {
        return new Mage(this.name, this.spell);
    }

    @Override
    public void display() {
        System.out.println("Mage - Name: " + name + ", Spell: " + spell);
    }
}