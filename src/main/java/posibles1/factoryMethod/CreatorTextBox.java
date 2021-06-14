package posibles1.factoryMethod;

public class CreatorTextBox extends CreatorControles{
    @Override
    public TextBox create() {
        TextBox textBox = new TextBox();
        textBox.setCasillaDeTexto("Text");
        return textBox;
    }
}
