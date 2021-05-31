package important.filaA.builder;

public class Cliente {
    public static void main(String[]args){
        Director cliente= new Director();
        ComboMegaPaquete comboMegaPaquete = new ComboMegaPaquete();
        ComboPaqueteMediano comboPaqueteMediano = new ComboPaqueteMediano();
        ComboPaqueteNormal comboPaqueteNormal = new ComboPaqueteNormal();

        cliente.setBuilderCombo(comboMegaPaquete);
        cliente.armarCombo();

        System.out.println("Combo Mega Paquete");
        ComboPeliculas combo1 = cliente.getBuilderCombo().getComboPeliculas();
        combo1.showData();
        System.out.println("");

        cliente.setBuilderCombo(comboPaqueteMediano);
        cliente.armarCombo();

        System.out.println("Combo Paquete mediano");
        ComboPeliculas combo2 = cliente.getBuilderCombo().getComboPeliculas();
        combo2.showData();
        System.out.println("");

        cliente.setBuilderCombo(comboPaqueteNormal);
        cliente.armarCombo();

        System.out.println("Combo Paquete normal");
        ComboPeliculas combo3 = cliente.getBuilderCombo().getComboPeliculas();
        combo3.showData();
        System.out.println("");
    }
}
