package posibles1.factoryMethod;

public class CreatorCheckBox extends CreatorControles{
    @Override
    public CheckBox create() {
        CheckBox checkBox = new CheckBox();
        checkBox.setCasillaDeConfirmacion("check");
        return checkBox;
    }
}
