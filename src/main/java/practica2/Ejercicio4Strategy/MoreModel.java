package practica2.Ejercicio4Strategy;

import java.util.List;

public class MoreModel implements IStrategyModel{
    @Override
    public void searchModel(List<Cellphone> list, String model) {
        System.out.println("Buscando entre muchos según el modelo: "+model);
        for (Cellphone cellphone : list) {
            if (cellphone.getModel().equals(model)) {
                cellphone.showInfo();
            }
        }
    }
}
