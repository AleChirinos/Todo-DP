package important2.filaB.ejercicio2ChainOfResponsability;

public abstract class Persona {
     public String name;

     protected ICanalDeComunicacion canalDeComunicacion;

     public Persona(ICanalDeComunicacion mediator){
         this.canalDeComunicacion =mediator;
     }

     public abstract void send(String message);
     public abstract void messageReceived(String message);
}
