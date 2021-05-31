package important.filaB.builder;

public class Lomito extends BuilderParrillada {
    @Override
    public void buildTipoDeCarne() {
        parrillada.setTipoDeCarne("Lomito");
    }

    @Override
    public void buildSaborSoda() {
        parrillada.setSaborDeRefresco("Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        parrillada.setGuarniciones("Arroz");
    }
}
