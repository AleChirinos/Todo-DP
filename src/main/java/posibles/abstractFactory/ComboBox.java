package posibles.abstractFactory;

public class ComboBox implements IControles{
    private Elementos elementos;

    public ComboBox(){
        elementos = new Elementos();
    }
    @Override
    public void crear() {
        elementos.showInfo();
    }

    public Elementos getElementos() {
        return elementos;
    }

    public void setElementos(Elementos elementos) {
        this.elementos = elementos;
    }
}
