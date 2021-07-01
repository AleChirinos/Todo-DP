package Posibles3.Bridge;

public class MonedaBolivianos implements ITipoDeMoneda{
    @Override
    public double tipoMoneda() {
        System.out.println("Haciendo cambio a Bolivianos");
        return 1;
    }
}
