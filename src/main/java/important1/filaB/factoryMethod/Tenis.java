package important1.filaB.factoryMethod;

public class Tenis implements IElementosDeportivos{
    private String talla;
    private String tipo;

    @Override
    public void crear() {
        System.out.println("Tenis");
        System.out.println("Talla: "+talla);
        System.out.println("Tipo: "+tipo);
        System.out.println("");
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
