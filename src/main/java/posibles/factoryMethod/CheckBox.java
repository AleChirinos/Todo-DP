package posibles.factoryMethod;

import posibles.abstractFactory.IControles;

public class CheckBox implements IControles, posibles.factoryMethod.IControles {
    private String casillaDeConfirmacion;

    public CheckBox(){}

    @Override
    public void crear() {
        System.out.println("Casilla llenada con "+casillaDeConfirmacion);
    }

    public String getCasillaDeConfirmacion() {
        return casillaDeConfirmacion;
    }

    public void setCasillaDeConfirmacion(String casillaDeConfirmacion) {
        this.casillaDeConfirmacion = casillaDeConfirmacion;
    }
}
