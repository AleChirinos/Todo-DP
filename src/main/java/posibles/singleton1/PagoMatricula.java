package posibles.singleton1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PagoMatricula {
    private static PagoMatricula instance = null;
    private Map<String, String> matriculacion = new HashMap<String, String>();
    private Map<String, Integer> monto = new HashMap<String, Integer>();
    private List<Estudiante> estudiantes = new LinkedList<>();

    public PagoMatricula() {

    }

    public static synchronized void makeInstance() {
        if (instance == null)
            instance = new PagoMatricula();
    }

    public static synchronized PagoMatricula getInstance() {
        if (instance == null)
            makeInstance();
        return instance;
    }

    public synchronized void pagar(Estudiante e, String hora, int monto) {
        if (!matriculacion.containsKey(e.nombre)) {
            this.monto.put(e.nombre, monto);
            estudiantes.add(e);
        } else {
            this.monto.put(e.nombre, monto+this.monto.get(e.nombre));
        }
        matriculacion.put(e.nombre, "Hora: " + hora);

    }

    public synchronized void mostrarInfo() {
        for (Estudiante e : estudiantes) {
            System.out.println("Nombre " + e.nombre);
            System.out.println("Ci: " + e.ci);
            System.out.println(matriculacion.get(e.nombre));
            System.out.println("Monto: "+monto.get(e.nombre));
        }
    }

}
