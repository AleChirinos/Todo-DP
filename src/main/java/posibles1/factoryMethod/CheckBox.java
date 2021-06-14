package posibles1.factoryMethod;

import posibles1.abstractFactory.IControles;

public class CheckBox implements IControles, posibles1.factoryMethod.IControles {
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
