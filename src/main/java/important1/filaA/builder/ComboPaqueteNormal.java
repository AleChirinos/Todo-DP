package important1.filaA.builder;

public class ComboPaqueteNormal extends BuilderCombo{
    @Override
    public void buildPipocas() {
        comboPeliculas.setPipocas("1 envase normal");
    }

    @Override
    public void buildRefresco() {
        comboPeliculas.setRefresco("1 vaso");
    }

    @Override
    public void buildChocolates() {
        comboPeliculas.setChocolates("No cuenta con chocolates");
    }
}
