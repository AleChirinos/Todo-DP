package memento.ejercicio.Tarea11;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Memento> stateSaved= new ArrayList<>();

    public void addBackup(Memento memento){
        stateSaved.add(memento);
    }

    public Memento getMemento(int position){
        return stateSaved.get(position);
    }
}
