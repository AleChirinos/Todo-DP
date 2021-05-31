package important.filaA.interpreter;

public class Cliente {

    public static void main(String[] args) {
        String operacion="1 sumar 2 restar 2 sumar 1 sumar 1";

        Interpreter interpreterOperaciones = new Interpreter(operacion);
        System.out.println("Operacion: "+operacion);
        System.out.println("Resultado: "+interpreterOperaciones.interpretar());
    }

}
