package observer.ejercicio;


public interface ICompaniaTelefonica {
    void attach(IUsuario observer);
    void deattach(IUsuario observer);
    void notifyObserver(Promociones promociones);
}
