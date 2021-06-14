package important1.filaA.prototype;

public class TelevisorSmart implements ITelevisor {
    String sistemaOperativo;
    double versionSistemaOperativo;
    int pulgadas;
    int resolucion;
    boolean puertoHDMI;
    int puertosUSB;
    boolean controlRemoto;
    boolean bluetooth;
    long serial;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getVersionSistemaOperativo() {
        return versionSistemaOperativo;
    }

    public void setVersionSistemaOperativo(double versionSistemaOperativo) {
        this.versionSistemaOperativo = versionSistemaOperativo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public void setPuertosUSB(int puertosUSB) {
        this.puertosUSB = puertosUSB;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    // : sistema operativo
//	(android), versión del sistema operativo (11.0), pulgadas (80), resolución (50), puerto hdmi
//	(true), puertos usb (4), control remoto (true), bluetooth (true), serial del televisor (10 digitos),

    @Override
    public Object clone() {
        TelevisorSmart tv = new TelevisorSmart();

        tv.setSistemaOperativo(this.sistemaOperativo);
        tv.setVersionSistemaOperativo(this.versionSistemaOperativo);
        tv.setPulgadas(this.pulgadas);
        tv.setResolucion(this.resolucion);
        tv.setPuertoHDMI(this.puertoHDMI);
        tv.setPuertosUSB(this.puertosUSB);
        tv.setControlRemoto(this.controlRemoto);
        tv.setBluetooth(this.bluetooth);
        tv.setSerial(this.serial);
        return tv;
    }

    public void mostrarInfo() {
        System.out.println("Sistema operativo: " + this.sistemaOperativo);
        System.out.println("Version sistema operativo: " + this.versionSistemaOperativo);
        System.out.println("Pulgadas: " + this.pulgadas);
        System.out.println("Resolucion: " + this.resolucion);
        System.out.println("Puerto HDMI: " + this.puertoHDMI);
        System.out.println("Puertos USB: " + this.puertosUSB);
        System.out.println("Control remoto: " + this.controlRemoto);
        System.out.println("Bluetooth: " + this.bluetooth);
        System.out.println("Serial: " + this.serial);
        System.out.println();

    }
}
