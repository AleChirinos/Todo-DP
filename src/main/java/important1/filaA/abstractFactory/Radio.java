package important1.filaA.abstractFactory;

public class Radio implements IArtefactoElectronico{
    private String precio;
    private String caracteristicas;

    public Radio(){}

    @Override
    public void crear() {
        System.out.println("Radio");
        System.out.println("Precio: "+precio);
        System.out.println("Caracteristicas: "+caracteristicas);
        System.out.println("");
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
