package important1.filaA.abstractFactory;

public class Television implements IArtefactoElectronico{
    private String precio;
    private String tamano;
    private String marca;

    public Television(){}

    @Override
    public void crear() {
        System.out.println("Television");
        System.out.println("Precio: "+precio);
        System.out.println("Tamaño: "+tamano);
        System.out.println("Marca: "+marca);
        System.out.println("");
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
