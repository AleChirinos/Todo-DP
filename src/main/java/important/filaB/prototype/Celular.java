package important.filaB.prototype;

public class Celular implements CaracteristicasDeCelular {

    private String modelo;
    private String tamano;
    private String peso;
    private String imei;
    private String origen;
    private Camara camara;

    public Celular(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    @Override
    public Object clone() {
        Celular objClone = new Celular();
        objClone.setModelo(this.modelo);
        objClone.setTamano(this.tamano);
        objClone.setPeso(this.peso);
        objClone.setImei(this.imei);
        objClone.setOrigen(this.origen);
        objClone.camara= this.camara; //superficial
        return objClone;
    }

    public void showInformation(){
        System.out.println("Modelo: "+ modelo);
        System.out.println("Tamaño: "+ tamano);
        System.out.println("Peso: "+ peso);
        System.out.println("IMEI: "+ imei);
        System.out.println("Origen: "+origen);
        System.out.println("Foco: "+ camara.getFoco());
        System.out.println("Lente: "+ camara.getLente());
        System.out.println("");
    }
}
