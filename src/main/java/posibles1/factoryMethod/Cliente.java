package posibles1.factoryMethod;

public class Cliente {
    public  static void main (String[]args){
        CreatorControles control1= new CreatorCheckBox();
        control1.create().crear();

        CreatorControles control2= new CreatorComboBox();
        control2.create().crear();

        CreatorControles control3= new CreatorLink();
        control3.create().crear();

        CreatorControles control4= new CreatorTable();
        control4.create().crear();

        CreatorControles control5= new CreatorTextBox();
        control5.create().crear();
    }
}
