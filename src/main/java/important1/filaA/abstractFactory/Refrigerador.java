package important1.filaA.abstractFactory;

public class Refrigerador implements IArtefactoElectronico{
    private String precio;
    private String potencia;

    public Refrigerador(){}

    @Override
    public void crear() {
        System.out.println("Refrigerador");
        System.out.println("Precio: "+precio);
        System.out.println("potencia: "+potencia);
        System.out.println("");
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
}
