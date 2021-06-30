package important2.filaB.ejercicio1Memento;

import java.util.ArrayList;
import java.util.List;

public class Versions {
    private List<StateFile> versiones = new ArrayList<>();

    public void addArchivo(StateFile estadoArchivo) {
        if (estadoArchivo.getFile().getContent().split(" ").length >= 5) {
            versiones.add(estadoArchivo);
        } else {
            System.out.println("ERROR-> No se versiona, faltan palabras");
        }
    }

    public StateFile getArchivo(int statePosition) {
        return versiones.get(statePosition);
    }
}
