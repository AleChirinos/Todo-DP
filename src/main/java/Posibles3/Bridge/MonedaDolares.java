package Posibles3.Bridge;

public class MonedaDolares implements ITipoDeMoneda{
    @Override
    public double tipoMoneda() {
        System.out.println("Haciendo cambio a Dolares");
        return 6.96;
    }
}
