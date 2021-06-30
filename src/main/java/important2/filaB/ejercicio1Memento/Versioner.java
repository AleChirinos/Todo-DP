package important2.filaB.ejercicio1Memento;

public class Versioner {
    private File state;
    private int version=0;

    public void setState(File state) {
        System.out.println("*** Set State ***");
        if(state.getContent().split(" ").length>=5) {
            version++;
            state.setAlias("version"+version);
        }
        state.showInfo();
        System.out.println();
        this.state = state;
    }

    public StateFile createVersion() {
        System.out.println("*** Create State ***");
        state.showInfo();
        System.out.println();
        return new StateFile(this.state);
    }

    public void restoreVersion(StateFile stateFile) {
        this.state = stateFile.getFile();
        System.out.println("*** State Restored ***");
        state.showInfo();
        System.out.println();
    }
}
