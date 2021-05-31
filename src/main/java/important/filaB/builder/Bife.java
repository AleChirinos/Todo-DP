package important.filaB.builder;

public class Bife extends BuilderParrillada {
    @Override
    public void buildTipoDeCarne() {
        parrillada.setTipoDeCarne("Bife");
    }

    @Override
    public void buildSaborSoda() {
        parrillada.setSaborDeRefresco("Coca Cola");
    }

    @Override
    public void buildGuarniciones() {
        parrillada.setGuarniciones("Papas fritas");
    }
}
