package practica1.Builder5;

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
