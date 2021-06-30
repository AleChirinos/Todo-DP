package bridge.ejercicio2;

public class EmpresaSA implements  Empresas{
    private EnviodePaquete enviodePaquete;

    public EmpresaSA(EnviodePaquete enviodePaquete){
        this.enviodePaquete=enviodePaquete;
    }

    @Override
    public void tipoDeEnvio() {
        System.out.println("Se esta buscando el tipo de envío...");
        enviodePaquete.enviarpaqute();
    }
}
