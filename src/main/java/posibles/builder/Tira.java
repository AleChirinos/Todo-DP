package posibles.builder;

public class Tira extends BuilderParrillada {
    @Override
    public void buildTipoDeCarne() {
        parrillada.setTipoDeCarne("Tira de carne");
    }

    @Override
    public void buildSaborSoda() {
        parrillada.setSaborDeRefresco("Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        parrillada.setGuarniciones("Fideo");
    }
}
