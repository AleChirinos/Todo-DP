package important1.filaA.abstractFactory;

public class FactoryArtefactoElectronico {
    public enum typeArtefacto {
        BATIDORA, MICROONDAS, RADIO, REFRIGERADOR, TELEVISION
    }

    public static IArtefactoElectronico make(FactoryArtefactoElectronico.typeArtefacto type) {
        IArtefactoElectronico artefactoElectronico;
        switch (type) {
            case BATIDORA:
                artefactoElectronico = new Batidora();
                ((Batidora) artefactoElectronico).setPrecio("200 bs");
                ((Batidora) artefactoElectronico).setCantidad("1 litro");
                break;
            case MICROONDAS:
                artefactoElectronico = new Microondas();
                ((Microondas) artefactoElectronico).setPrecio("900 bs");
                ((Microondas) artefactoElectronico).setPotencia("900 W");
                break;
            case RADIO:
                artefactoElectronico = new Radio();
                ((Radio) artefactoElectronico).setPrecio("50 bs");
                ((Radio) artefactoElectronico).setCaracteristicas("Inalambrica con 8 horas de duracion");
                break;
            case TELEVISION:
                artefactoElectronico = new Television();
                ((Television) artefactoElectronico).setPrecio("3000 bs");
                ((Television) artefactoElectronico).setMarca("Sony");
                ((Television) artefactoElectronico).setTamano("50 pulgadas");
                break;
            case REFRIGERADOR:
                artefactoElectronico = new Refrigerador();
                ((Refrigerador) artefactoElectronico).setPrecio("4500 bs");
                ((Refrigerador) artefactoElectronico).setPotencia("-15 grados");
                break;
            default:
                artefactoElectronico = new Television();
                break;
        }
        return artefactoElectronico;
    }
}
