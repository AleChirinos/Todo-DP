package important1.filaA.singleton;

public class Cliente {
    public static void main(String[] args) {
        CabinaSingleton cabina = CabinaSingleton.getInstance();

        Vehiculo v1 = new Vehiculo();
        v1.setModelo("modelo1");
        v1.setPlaca("abc123");

        Vehiculo v2 = new Vehiculo();
        v2.setModelo("modelo2");
        v2.setPlaca("dac222");

        Vehiculo v3 = new Vehiculo();
        v3.setModelo("modelo3");
        v3.setPlaca("qwe231");

        Vehiculo v4 = new Vehiculo();
        v4.setModelo("modelo4");
        v4.setPlaca("per321");

        Vehiculo v5 = new Vehiculo();
        v5.setModelo("modelo5");
        v5.setPlaca("tyu426");

        Vehiculo v6 = new Vehiculo();
        v6.setModelo("modelo6");
        v6.setPlaca("cua888");

        cabina.pagar(v1, 100);
        cabina.pagar(v2, 222);
        cabina.pagar(v3, 333);
        cabina.pagar(v4, 444);
        cabina.pagar(v5, 555);
        cabina.pagar(v6, 666);
        cabina.pagar(v1, 100);

        cabina.mostrarInfo();

    }
}
