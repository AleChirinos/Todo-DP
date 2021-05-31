package important.filaB.interpreter;


public class TerminalExpressionEmpiezaConX extends AbstractExpression {

    public TerminalExpressionEmpiezaConX(int largo) {
        this.largo=largo;
    }

    @Override
    public void interpreter(Context context) {
        String numeroR = context.input.substring(0, largo);
        if (numeroR.equals("X")) {
            context.output = context.output + "10 ";
        }
        context.input = context.input.substring(this.largo);

    }
}
