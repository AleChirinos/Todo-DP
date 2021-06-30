package important2.filaB.ejercicio3Observer;

public interface IWebPage {
    void attach(IUser observer);
    void deattach(IUser observer);
    void notifyObserver(Post post);
}
