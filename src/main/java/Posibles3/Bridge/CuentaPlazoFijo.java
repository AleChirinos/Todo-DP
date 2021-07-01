package Posibles3.Bridge;

public class CuentaPlazoFijo implements ICuentas{
    private ITipoDeMoneda tipoDeMoneda;
    private double monto;

    public CuentaPlazoFijo(ITipoDeMoneda tipoDeMoneda, double monto){
        this.tipoDeMoneda=tipoDeMoneda;
        this.monto=monto;
    }
    @Override
    public void tipoInteres() {
        System.out.println("Info -> Obteniend datos de la cuenta");
        System.out.println("PLAZO FIJO");
        System.out.println("Monto: "+monto);
        double interesGanado = monto+ monto*0.05;
        System.out.println("Info -> Se gano un 5% de interes");
        System.out.println("Monto actual : "+interesGanado);
        System.out.println("Info -> Obteniendo tipo de moneda");
        System.out.println("Monto actual : "+interesGanado*tipoDeMoneda.tipoMoneda());
    }
}
