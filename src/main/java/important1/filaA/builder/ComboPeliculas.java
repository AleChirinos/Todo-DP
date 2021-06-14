package important1.filaA.builder;

public class ComboPeliculas {
    private String pipocas;
    private String refresco;
    private String chocolates;

    public ComboPeliculas(){}

    public String getPipocas() {
        return pipocas;
    }

    public void setPipocas(String pipocas) {
        this.pipocas = pipocas;
    }

    public String getRefresco() {
        return refresco;
    }

    public void setRefresco(String refresco) {
        this.refresco = refresco;
    }

    public String getChocolates() {
        return chocolates;
    }

    public void setChocolates(String chocolates) {
        this.chocolates = chocolates;
    }

    public void showData() {
        System.out.println("Pipocas : "+pipocas);
        System.out.println("Refresco : "+refresco);
        System.out.println("Chocolates : "+chocolates);
    }
}
