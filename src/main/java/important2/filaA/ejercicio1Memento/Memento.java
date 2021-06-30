package important2.filaA.ejercicio1Memento;

public class Memento {

    private Document state;

    public Memento(Document stateToSave) {
        state = stateToSave;
    }

    public Document getSavedState() {
        return state;
    }
}
