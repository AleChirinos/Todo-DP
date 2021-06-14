package important1.filaA.interpreter;

public class TerminalExpressionSumar extends AbstractExpression {

    public TerminalExpressionSumar(int largo) {
        this.largo = largo;
    }

    @Override
    public void interpreter(Context context) {

        if (context.input.startsWith("sumar")) {
            context.signo = 1;
            context.input = context.input.substring(this.largo);
        }

    }
}
