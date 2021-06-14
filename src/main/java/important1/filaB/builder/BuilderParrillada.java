package important1.filaB.builder;

public abstract class BuilderParrillada {
    protected Parrillada parrillada;

    public Parrillada getParrillada(){
        return parrillada;
    }

    public void createParrillada(){
        parrillada = new Parrillada();
    }

    public abstract void buildTipoDeCarne();
    public abstract void buildSaborSoda();
    public abstract void buildGuarniciones();

}
