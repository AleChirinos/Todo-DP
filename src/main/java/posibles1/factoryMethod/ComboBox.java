package posibles1.factoryMethod;

import posibles1.abstractFactory.Elementos;
import posibles1.abstractFactory.IControles;

public class ComboBox implements IControles, posibles1.factoryMethod.IControles {
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

    public void setElementos(posibles1.factoryMethod.Elementos elementos) {
    }
}
