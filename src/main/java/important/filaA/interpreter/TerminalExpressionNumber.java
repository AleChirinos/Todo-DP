package important.filaA.interpreter;

public class TerminalExpressionNumber extends AbstractExpression {

    public TerminalExpressionNumber(int largo) {
        this.largo = largo;
    }

    @Override
    public void interpreter(Context context) {

        context.output = context.output + Integer.parseInt(context.input.substring(0, this.largo))*(context.signo);
        context.input = context.input.substring(this.largo);

    }
}