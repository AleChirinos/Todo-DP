package important2.filaB.ejercicio1Memento;

public class Client {
    public static void main(String[] args) {
        Versioner versioner = new Versioner();
        Versions versions = new Versions();

        File file = new File("este documento es una prueba");

        versioner.setState(file);
        versions.addArchivo(versioner.createVersion());

        file = new File("el exito solo depende de tu esfuerzo");
        versioner.setState(file);
        versions.addArchivo(versioner.createVersion());

        file = new File("prologo");
        versioner.setState(file);
        versions.addArchivo(versioner.createVersion());

        file = new File("este documento fue actualizado satisfactoriamente");
        versioner.setState(file);
        versions.addArchivo(versioner.createVersion());

        versioner.restoreVersion(versions.getArchivo(0));
    }
}
