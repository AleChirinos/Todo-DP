package Posibles3.Bridge;

public class CuentaCredito implements ICuentas{
    private ITipoDeMoneda tipoDeMoneda;
    private double monto;

    public CuentaCredito(ITipoDeMoneda tipoDeMoneda, double monto){
        this.tipoDeMoneda=tipoDeMoneda;
        this.monto=monto;
    }
    @Override
    public void tipoInteres() {
        System.out.println("Info -> Obteniend datos de la cuenta");
        System.out.println("CREDITO");
        System.out.println("Monto: "+monto);
        double interesGanado = monto+ monto*0.07;
        System.out.println("Info -> Se gano un 7% de interes");
        System.out.println("Monto actual : "+interesGanado);
        System.out.println("Info -> Obteniendo tipo de moneda");
        System.out.println("Monto actual : "+ interesGanado*tipoDeMoneda.tipoMoneda());
    }
}
