package Posibles3.Bridge;

public class MonedaEuros implements ITipoDeMoneda{
    @Override
    public double tipoMoneda() {
        System.out.println("Haciendo cambio a Euros");
        return 8.26;
    }
}
