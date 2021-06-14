package posibles1.factoryMethod;

public class CreatorLink extends CreatorControles{
    @Override
    public Link create() {
        Link link = new Link();
        link.setUrl("www.google.com");
        return link;
    }
}
