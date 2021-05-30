package posibles.factoryMethod;

import posibles.abstractFactory.IControles;

public class Table implements IControles, posibles.factoryMethod.IControles {
    private String numeroDeColumnas;

    public Table(){}

    @Override
    public void crear() {
        System.out.println("Numero de columnas de la tabla: "+numeroDeColumnas);
    }

    public String getNumeroDeColumnas() {
        return numeroDeColumnas;
    }

    public void setNumeroDeColumnas(String numeroDeColumnas) {
        this.numeroDeColumnas = numeroDeColumnas;
    }
}
