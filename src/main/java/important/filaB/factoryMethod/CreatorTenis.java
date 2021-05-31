package important.filaB.factoryMethod;

public class CreatorTenis extends CreatorElementosDeportivos{
    @Override
    public Tenis create() {
        Tenis tenis = new Tenis();
        tenis.setTipo("Para correr");
        tenis.setTalla("37");
        return tenis;
    }
}
