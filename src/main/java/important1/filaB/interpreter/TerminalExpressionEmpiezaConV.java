package important1.filaB.interpreter;

public class TerminalExpressionEmpiezaConV extends AbstractExpression {

    public TerminalExpressionEmpiezaConV(int largo) {
        this.largo=largo;
    }

    @Override
    public void interpreter(Context context) {
        String numeroR = context.input.substring(0, largo);
        if (numeroR.equals("V")) {
            context.output = context.output + "5 ";
        } else if (numeroR.equals("VI")) {
            context.output = context.output + "6 ";

        } else if (numeroR.equals("VII")) {
            context.output = context.output + "7 ";

        } else if (numeroR.equals("VIII")) {
            context.output = context.output + "8 ";

        }
        context.input = context.input.substring(this.largo);

    }
}
