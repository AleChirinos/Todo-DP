package posibles.factoryMethod;

import posibles.abstractFactory.Elementos;
import posibles.abstractFactory.IControles;

public class ComboBox implements IControles, posibles.factoryMethod.IControles {
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

    public void setElementos(posibles.factoryMethod.Elementos elementos) {
    }
}
