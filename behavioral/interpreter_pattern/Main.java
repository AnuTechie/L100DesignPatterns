public class Main {
    public static void main(String[] args) {
        Expression e1 = Interpreter.parse("TURN ON LIGHT");
        Expression e2 = Interpreter.parse("TURN OFF FAN");
        Expression e3 = Interpreter.parse("SET TEMPERATURE 24");

        e1.interpret();
        e2.interpret();
        e3.interpret();
    }
}
