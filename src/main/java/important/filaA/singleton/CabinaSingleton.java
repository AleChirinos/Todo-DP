package important.filaA.singleton;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class CabinaSingleton {
    private static CabinaSingleton instance = null;
    private Map<String, Vehiculo> matriculacion = new HashMap<String, Vehiculo>();
    private Map<String, Integer> monto = new HashMap<String, Integer>();
    private List<String> vehiculos = new LinkedList<>();
    private CabinaSingleton() {

    }

    public static synchronized void makeInstance() {
        if (instance == null)
            instance = new CabinaSingleton();
    }

    public static synchronized CabinaSingleton getInstance() {
        if (instance == null)
            makeInstance();
        return instance;
    }
    public synchronized void pagar(Vehiculo v, int monto) {
        if (!vehiculos.contains(v.placa)) {
            this.monto.put(v.placa, monto);
            vehiculos.add(v.placa);
        } else {
            this.monto.put(v.placa, monto+this.monto.get(v.placa));
        }
        matriculacion.put(v.placa, v);

    }

    public synchronized void mostrarInfo() {
        for(String s: vehiculos) {
            matriculacion.get(s).mostrarInfo();
            System.out.println("Monto: "+monto.get(s));
        }
    }
}
