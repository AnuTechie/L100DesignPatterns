import java.util.Stack;

public class History {
    private Stack<Memento> history = new Stack<>();

    public void save(Memento m) { history.push(m); }
    public Memento undo() { return history.pop(); }
}