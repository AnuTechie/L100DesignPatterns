package prototypePattern.characters;

public interface GameCharacter extends Cloneable {
    GameCharacter clone();
    void display();
}