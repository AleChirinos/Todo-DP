package posibles.factoryMethod;

import posibles.abstractFactory.IControles;

public class Link implements IControles, posibles.factoryMethod.IControles {
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