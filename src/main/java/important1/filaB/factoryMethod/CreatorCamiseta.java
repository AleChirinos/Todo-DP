package important1.filaB.factoryMethod;

public class CreatorCamiseta extends CreatorElementosDeportivos{
    @Override
    public Camiseta create() {
        Camiseta camiseta = new Camiseta();
        camiseta.setEquipo("Bolivar");
        camiseta.setTalla("M");
        return camiseta;
    }
}
