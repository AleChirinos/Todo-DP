package important2.filaB.ejercicio4Strategy;

import java.util.LinkedList;
import java.util.List;

public class OrderCI implements IOrderDB {

    @Override
    public void orderUsers(List<User> usuarios) {
        System.out.println("*** Ordenando por CI ***");
        List<User> ordered = new LinkedList<User>();
        int last = Integer.MAX_VALUE;
        while (ordered.size() != usuarios.size()) {
            last = Integer.MAX_VALUE;
            User lastUser = null;
            for (User usuario : usuarios) {
                if (usuario.getCi() < last && !ordered.contains(usuario)) {
                    last = usuario.getCi();
                    lastUser = usuario;
                }
            }
            ordered.add(lastUser);
        }
        for (User usuario : ordered) {
            usuario.mostrarInfo();
            System.out.println();
        }
    }

}
