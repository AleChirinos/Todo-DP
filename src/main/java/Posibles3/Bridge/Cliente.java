package Posibles3.Bridge;

public class Cliente {
    public static void main(String[] args){

        ICuentas ahorro = new CuentaAhorros(new MonedaBolivianos(), 10);
        ahorro.tipoInteres();

        ICuentas fijo = new CuentaPlazoFijo(new MonedaDolares(), 10);
        fijo.tipoInteres();

        ICuentas credito = new CuentaCredito(new MonedaDolares(), 10);
        credito.tipoInteres();
    }
}
