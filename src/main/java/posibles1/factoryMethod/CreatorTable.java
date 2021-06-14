package posibles1.factoryMethod;

public class CreatorTable extends CreatorControles{
    @Override
    public Table create() {
        Table table = new Table();
        table.setNumeroDeColumnas("3");
        return table;
    }
}
