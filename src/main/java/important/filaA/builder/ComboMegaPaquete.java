package important.filaA.builder;

public class ComboMegaPaquete extends BuilderCombo{
    @Override
    public void buildPipocas() {
        comboPeliculas.setPipocas("3 extra grandes");
    }

    @Override
    public void buildRefresco() {
        comboPeliculas.setRefresco("3 vasos extra grandes con recarga ilimitada");
    }

    @Override
    public void buildChocolates() {
        comboPeliculas.setChocolates("2 grandes");
    }
}
