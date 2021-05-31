package important.filaA.prototype;

public class Cliente {
    public static void main(String[] args) {
        TelevisorSmart tv = new TelevisorSmart();
        tv.setSistemaOperativo("Android");
        tv.setVersionSistemaOperativo(11.0);
        tv.setPulgadas(80);
        tv.setResolucion(50);
        tv.setPuertoHDMI(true);
        tv.setPuertosUSB(4);
        tv.setControlRemoto(true);
        tv.setBluetooth(true);
        tv.setSerial(1234567890);

        TelevisorSmart tv2 = (TelevisorSmart) tv.clone();
        tv2.setSerial(2222222222L);

        TelevisorSmart tv3 = (TelevisorSmart) tv.clone();
        tv3.setSerial(3333333333L);

        TelevisorSmart tv4 = (TelevisorSmart) tv.clone();
        tv4.setSerial(4444444444L);

        TelevisorSmart tv5 = (TelevisorSmart) tv.clone();
        tv5.setSerial(5555555555L);

        TelevisorSmart tv6 = (TelevisorSmart) tv.clone();
        tv6.setSerial(6666666666L);

        tv.mostrarInfo();
        tv2.mostrarInfo();
        tv3.mostrarInfo();
        tv4.mostrarInfo();
        tv5.mostrarInfo();
        tv6.mostrarInfo();

    }
}
