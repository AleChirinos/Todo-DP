package posibles.singleton2;

public class Client {

    public static void main (String []argumento){

        Thread jose = new Thread(new Runnable() {
            @Override
            public void run() {
                posibles.singleton2.Cajero cajeroLaPaz = new Cajero();
                cajeroLaPaz.retirarDinero("16:00",100);
            }
        });

        Thread maria = new Thread(new Runnable() {
            @Override
            public void run() {
                posibles.singleton2.BancaMovil bancaMovil= new BancaMovil();
                bancaMovil.retirarDinero("18:00",200);

            }
        });

        Thread marcelo = new Thread(new Runnable() {
            @Override
            public void run() {
                posibles.singleton2.SucursalBanco sucursalBancoCbba= new SucursalBanco();
                sucursalBancoCbba.retirarDinero("07:00",300);
            }
        });

        jose.start();
        marcelo.start();
        maria.start();


    }

}
