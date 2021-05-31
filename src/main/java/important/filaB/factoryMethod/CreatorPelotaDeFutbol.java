package important.filaB.factoryMethod;

public class CreatorPelotaDeFutbol extends CreatorElementosDeportivos{
    @Override
    public PelotaDeFutbol create() {
        PelotaDeFutbol pelotaDeFutbol = new PelotaDeFutbol();
        pelotaDeFutbol.setTamano("Mediana");
        pelotaDeFutbol.setColor("Blanco con negro");
        pelotaDeFutbol.setGarantia("1 año");
        return pelotaDeFutbol;
    }
}
