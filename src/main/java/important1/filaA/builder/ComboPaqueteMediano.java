package important1.filaA.builder;

public class ComboPaqueteMediano extends BuilderCombo{
    @Override
    public void buildPipocas() {
        comboPeliculas.setPipocas("2 extra grandes");
    }

    @Override
    public void buildRefresco() {
        comboPeliculas.setRefresco("2 vasos");
    }

    @Override
    public void buildChocolates() {
        comboPeliculas.setChocolates("1 normal");
    }
}
