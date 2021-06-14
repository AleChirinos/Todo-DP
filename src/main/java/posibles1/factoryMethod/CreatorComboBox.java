package posibles1.factoryMethod;

public class CreatorComboBox extends CreatorControles{
    @Override
    public ComboBox create() {
        Elementos elementos = new Elementos();
        elementos.setElemento1("1");
        elementos.setElemento2("2");
        elementos.setElemento3("3");

        ComboBox comboBox= new ComboBox();
        comboBox.setElementos(elementos);
        return comboBox;
    }
}
