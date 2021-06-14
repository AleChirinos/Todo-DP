package posibles1.abstractFactory;

public class Link implements IControles{
    private String url;

    public Link(){}

    @Override
    public void crear() {
        System.out.println("Link: "+url);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
