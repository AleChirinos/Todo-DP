package posibles1.abstractFactory;

public class FactoryControles {
    public enum typeControles {
        CONTROL_CHECKBOX, CONTROL_COMBOBOX, CONTROL_LINK, CONTROL_TABLE, CONTROL_TEXTBOX;
    }

    public static IControles make(FactoryControles.typeControles type) {
        IControles controles;
        switch (type) {
            case CONTROL_CHECKBOX:
                controles = new CheckBox();
                ((CheckBox) controles).setCasillaDeConfirmacion("con check");
                break;
            case CONTROL_COMBOBOX:
                controles = new ComboBox();
                ((ComboBox) controles).setElementos(new Elementos("primer elemnto","segundo elemento","tercer elemento"));
                break;
            case CONTROL_LINK:
                controles = new Link();
                ((Link) controles).setUrl("www.google.com");
                break;
            case CONTROL_TABLE:
                controles = new Table();
                ((Table) controles).setNumeroDeColumnas("7");
                break;
            case CONTROL_TEXTBOX:
                controles = new TextBox();
                ((TextBox) controles).setCasillaDeTexto("Hola mundo");
                break;
            default:
                controles = new CheckBox();
                break;
        }
        return controles;
    }
}
