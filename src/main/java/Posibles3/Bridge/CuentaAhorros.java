package Posibles3.Bridge;

public class CuentaAhorros implements ICuentas{
    private ITipoDeMoneda tipoDeMoneda;
    private double monto;

    public  CuentaAhorros(ITipoDeMoneda tipoDeMoneda, double monto){
        this.tipoDeMoneda=tipoDeMoneda;
        this.monto=monto;
    }
    @Override
    public void tipoInteres() {
        System.out.println("Info -> Obteniend datos de la cuenta");
        System.out.println("CUENTA DE AHORROS");
        System.out.println("Monto: "+monto);
        double interesGanado = monto+ monto*0.02;
        System.out.println("Info -> Se gano un 2% de interes");
        System.out.println("Monto actual : "+interesGanado);
        System.out.println("Info -> Obteniendo tipo de moneda");
        System.out.println("Monto actual : "+interesGanado*tipoDeMoneda.tipoMoneda());
    }
}
