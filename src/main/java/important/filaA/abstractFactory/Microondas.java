package important.filaA.abstractFactory;

public class Microondas implements IArtefactoElectronico{
    private String precio;
    private String potencia;

    public Microondas(){}

    @Override
    public void crear() {
        System.out.println("Microondas");
        System.out.println("Precio: "+precio);
        System.out.println("Potencia: "+potencia);
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
