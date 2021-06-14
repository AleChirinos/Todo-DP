package posibles1.singleton2;

public class Cajero {

    public Cajero(){

    }

    public void retirarDinero(String hora,int cantidad){
        System.out.println("Hora del deposito: "+hora);
        Banco.getInstance().getMoney(cantidad);
    }
}
