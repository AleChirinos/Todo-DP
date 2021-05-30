package posibles.singleton2;

public class SucursalBanco {

    public SucursalBanco(){

    }

    public void retirarDinero(String hora,int cantidad){
        System.out.println("Hora del deposito: "+hora);
        Banco.getInstance().getMoney(cantidad);
    }
}
