package important.filaB.interpreter;

public class TerminalExpressionEmpiezaConI extends AbstractExpression {

    public TerminalExpressionEmpiezaConI(int largo) {
        this.largo=largo;
    }


    @Override
    public void interpreter(Context context) {
        String numeroR = context.input.substring(0,largo);
        if(numeroR.equals("I")) {
            context.output = context.output + "1 ";
        }else if(numeroR.equals("II")) {
            context.output = context.output + "2 ";

        }else if(numeroR.equals("III")) {
            context.output = context.output + "3 ";

        }else if(numeroR.equals("IV")) {
            context.output = context.output + "4 ";

        }else if(numeroR.equals("IX")) {
            context.output = context.output + "9 ";

        }
        context.input = context.input.substring(this.largo);

    }
}
