package posibles1.prototype;

public class Cliente {
    public static void main (String []args){
        Celular celular = new Celular();
        celular.setModelo("A1");
        celular.setTamano("10");
        celular.setPeso("60");
        celular.setOrigen("Bolivia");
        celular.setImei("10001");
        celular.setCamara(new Camara("10","5 mp"));

        Celular celular1= (Celular) celular.clone();
        celular1.setImei("10001");

        Celular celular2= (Celular) celular.clone();
        celular2.setImei("10002");

        Celular celular3= (Celular) celular.clone();
        celular3.setImei("10003");

        celular1.showInformation();
        celular2.showInformation();
        celular3.showInformation();
    }
}
