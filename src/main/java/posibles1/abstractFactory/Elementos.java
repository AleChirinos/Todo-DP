package posibles1.abstractFactory;

public class Elementos {
    private String elemento1;
    private String elemento2;
    private String elemento3;

    public Elementos(){}

    public Elementos(String elemento1, String elemento2, String elemento3){
        this.elemento1=elemento1;
        this.elemento2=elemento2;
        this.elemento3=elemento3;
    }

    public String getElemento1() {
        return elemento1;
    }

    public void setElemento1(String elemento1) {
        this.elemento1 = elemento1;
    }

    public String getElemento2() {
        return elemento2;
    }

    public void setElemento2(String elemento2) {
        this.elemento2 = elemento2;
    }

    public String getElemento3() {
        return elemento3;
    }

    public void setElemento3(String elemento3) {
        this.elemento3 = elemento3;
    }

    public void showInfo(){
        System.out.println("Elemento 1: "+elemento1);
        System.out.println("Elemento 2: "+elemento2);
        System.out.println("Elemento 3: "+elemento3);
    }
}
