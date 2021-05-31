package important.filaA.builder;

public class Director {
    private BuilderCombo builderCombo;

    public BuilderCombo getBuilderCombo() {
        return builderCombo;
    }

    public void setBuilderCombo(BuilderCombo builderCombo) {
        this.builderCombo = builderCombo;
    }

    public void armarCombo(){
        this.builderCombo.crearComboPeliculas();
        this.builderCombo.buildPipocas();
        this.builderCombo.buildRefresco();
        this.builderCombo.buildChocolates();
    }
}
