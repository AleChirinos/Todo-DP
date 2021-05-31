package important.filaA.interpreter;

public class TerminalExpressionRestar extends AbstractExpression {

    public TerminalExpressionRestar(int largo) {
        this.largo = largo;
    }

    @Override
    public void interpreter(Context context) {

        if (context.input.startsWith("restar")) {
            context.signo = -1;
            context.input = context.input.substring(this.largo);
        }

    }
}
