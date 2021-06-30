package memento.ejercicio.Tarea11;

public class Originator {
    private BackUplist state;

    public Originator(){}

    public void setState(BackUplist state) {
        System.out.println("**** Set State *****");
        state.showInfo();
        System.out.println();
        this.state = state;
    }

    public Memento createBackUp(){
        System.out.println("**** Create State *****");
        state.showInfo();
        System.out.println();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        this.state.showInfo();
        System.out.println();
    }
}
