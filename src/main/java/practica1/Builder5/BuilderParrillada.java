package practica1.Builder5;

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
