package important1.filaA.builder;

public abstract class BuilderCombo {
    protected ComboPeliculas comboPeliculas;

    public ComboPeliculas getComboPeliculas() {
        return comboPeliculas;
    }

    public void crearComboPeliculas() {
        comboPeliculas = new ComboPeliculas();
    }

    public abstract void buildPipocas();
    public abstract void buildRefresco();
    public abstract void buildChocolates();
}
