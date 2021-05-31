package important.filaA.abstractFactory;

public class Batidora implements IArtefactoElectronico{
    private String precio;
    private String cantidad;

    public Batidora(){}

    @Override
    public void crear() {
        System.out.println("Batidora");
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("");
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
