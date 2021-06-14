package posibles1.singleton2;

public class Banco {

      private static Banco instance = null;
      private int saldo;

      private Banco(){
          saldo= 0;
          System.out.println("INFO> Iniciando Saldo: "+ 0);
      }

      public static synchronized void makeInstance(){
          if (instance == null)
              instance= new Banco();
      }

      public static Banco getInstance(){
          if (instance == null)
              makeInstance();
          return instance;
      }

      public synchronized void getMoney(int amount){
          saldo=saldo+amount;
          System.out.println("INFO > --- saldo: ["+saldo+ "] cantidad depositada: ["+amount+"]");
      }

}
