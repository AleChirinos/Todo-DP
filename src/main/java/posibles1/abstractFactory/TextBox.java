package posibles1.abstractFactory;

public class TextBox implements IControles{
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
