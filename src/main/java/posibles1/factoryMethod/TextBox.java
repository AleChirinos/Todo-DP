package posibles1.factoryMethod;

import posibles1.abstractFactory.IControles;

public class TextBox implements IControles, posibles1.factoryMethod.IControles {
    private String casillaDeTexto;

    public TextBox(){}

    @Override
    public void crear() {
        System.out.println("Texto "+casillaDeTexto);
    }

    public String getCasillaDeTexto() {
        return casillaDeTexto;
    }

    public void setCasillaDeTexto(String casillaDeTexto) {
        this.casillaDeTexto = casillaDeTexto;
    }
}
