package important1.filaA.interpreter;

import java.util.ArrayList;
import java.util.List;


public class Interpreter extends AbstractExpression {

    private List<AbstractExpression> parseTree = new ArrayList<>();
    private Context context;

    public Interpreter(String word) {
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context = new Context(input.replace(" ", ""));
        for (String word : input.split(" ")) {
            switch (word) {
                case "sumar":
                    parseTree.add(new TerminalExpressionSumar(word.length()));
                    break;
                case "restar":
                    parseTree.add(new TerminalExpressionRestar(word.length()));
                    break;
                default:
                    parseTree.add(new TerminalExpressionNumber(word.length()));
                    break;
            }

        }
    }


    public int interpretar() {
        for (AbstractExpression terminalExpresion : parseTree) {
            terminalExpresion.interpreter(context);
        }
        return context.output;
    }


    @Override
    public void interpreter(Context context) {

    }
}