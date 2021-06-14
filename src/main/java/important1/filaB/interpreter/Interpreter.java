package important1.filaB.interpreter;

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
            if (word.startsWith("I")) {
                parseTree.add(new TerminalExpressionEmpiezaConI(word.length()));
            } else if (word.startsWith("V")) {
                parseTree.add(new TerminalExpressionEmpiezaConV(word.length()));
            } else if (word.startsWith("X")) {
                parseTree.add(new TerminalExpressionEmpiezaConX(word.length()));
            }

        }
    }

    public String interpretar() {
        for (AbstractExpression terminalExpresion : parseTree) {
            terminalExpresion.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}
