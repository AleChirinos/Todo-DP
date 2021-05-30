package posibles.singleton1;

public class Cliente {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoMatricula singleton = PagoMatricula.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(6724567);
                e.setNombre("Jose");
                singleton.pagar(e, "16:00", "10000");
                singleton.mostrarInfo();
                System.out.println("");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoMatricula singleton = PagoMatricula.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(1825376);
                e.setNombre("Antonio");
                singleton.pagar(e, "17:00", "8750");
                singleton.mostrarInfo();
                System.out.println("");
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoMatricula singleton = PagoMatricula.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(8725096);
                e.setNombre("Felipe");
                singleton.pagar(e, "18:00", "6533");
                singleton.mostrarInfo();
                System.out.println("");
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoMatricula singleton = PagoMatricula.getInstance();
                Estudiante e = new Estudiante();
                e.setCi(6724567);
                e.setNombre("Jose");
                singleton.pagar(e, "16:00", "10000");
                singleton.mostrarInfo();
                System.out.println("");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
