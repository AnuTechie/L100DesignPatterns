public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("Version 1");
        history.save(editor.save());

        editor.setText("Version 2");
        history.save(editor.save());

        editor.setText("Version 3");
        System.out.println("Current: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("Undo: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("Undo: " + editor.getText());
    }
}