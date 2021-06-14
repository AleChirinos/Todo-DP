package posibles1.factoryMethod;

import posibles1.abstractFactory.IControles;

public class Link implements IControles, posibles1.factoryMethod.IControles {
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
