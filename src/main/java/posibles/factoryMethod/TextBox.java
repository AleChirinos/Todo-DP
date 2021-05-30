package posibles.factoryMethod;

import posibles.abstractFactory.IControles;

public class TextBox implements IControles, posibles.factoryMethod.IControles {
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
