package important1.filaB.factoryMethod;

public class Short implements IElementosDeportivos{
    private String talla;
    private String color;

    @Override
    public void crear() {
        System.out.println("Short");
        System.out.println("Talla: "+talla);
        System.out.println("Color: "+color);
        System.out.println("");
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
