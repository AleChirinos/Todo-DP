package important2.filaB.ejercicio1Memento;

public class File {
    private String alias="Sin version";
    private String content;

    public File(String content) {
        this.content = content;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void showInfo() {
        System.out.println("Alias: " + alias);
        System.out.println("Contenido: " + content);
    }
}
