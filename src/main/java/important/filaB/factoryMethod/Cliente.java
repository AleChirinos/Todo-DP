package important.filaB.factoryMethod;

public class Cliente {
    public  static void main (String[]args){
        CreatorElementosDeportivos camiseta= new CreatorCamiseta();
        camiseta.create().crear();

        CreatorElementosDeportivos medias= new CreatorMedias();
        medias.create().crear();

        CreatorElementosDeportivos pelotaDeFutbol= new CreatorPelotaDeFutbol();
        pelotaDeFutbol.create().crear();

        CreatorElementosDeportivos shorte= new CreatorShort();
        shorte.create().crear();

        CreatorElementosDeportivos tenis= new CreatorTenis();
        tenis.create().crear();
    }
}
