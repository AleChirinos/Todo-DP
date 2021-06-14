package posibles1.abstractFactory;

public class Cliente {
    public static void main (String []args){
        System.out.println("CheckBox");
        CheckBox cb= (CheckBox) FactoryControles.make(FactoryControles.typeControles.CONTROL_CHECKBOX);
        cb.setCasillaDeConfirmacion("Check");
        cb.crear();
        System.out.println("");

        System.out.println("ComboBox");
        ComboBox cb2= (ComboBox) FactoryControles.make(FactoryControles.typeControles.CONTROL_COMBOBOX);
        cb2.setElementos(new Elementos("1", "2", "3"));
        cb2.crear();
        System.out.println("");

        System.out.println("Link");
        Link l= (Link) FactoryControles.make(FactoryControles.typeControles.CONTROL_LINK);
        l.setUrl("www.google.com");
        l.crear();
        System.out.println("");

        System.out.println("Table");
        Table ta= (Table) FactoryControles.make(FactoryControles.typeControles.CONTROL_TABLE);
        ta.setNumeroDeColumnas("5");
        ta.crear();
        System.out.println("");

        System.out.println("TextBox");
        TextBox tb= (TextBox) FactoryControles.make(FactoryControles.typeControles.CONTROL_TEXTBOX);
        tb.setCasillaDeTexto("Texto");
        tb.crear();
        System.out.println("");
    }
}
