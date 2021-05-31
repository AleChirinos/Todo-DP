package important.filaA.abstractFactory;

public class Cliente {
    public static void main (String []args){
        Batidora h1= (Batidora) FactoryArtefactoElectronico.make(FactoryArtefactoElectronico.typeArtefacto.BATIDORA);
        h1.crear();

        Microondas h2= (Microondas) FactoryArtefactoElectronico.make(FactoryArtefactoElectronico.typeArtefacto.MICROONDAS);
        h2.crear();

        Radio h3= (Radio) FactoryArtefactoElectronico.make(FactoryArtefactoElectronico.typeArtefacto.RADIO);
        h3.crear();

        Refrigerador h4= (Refrigerador) FactoryArtefactoElectronico.make(FactoryArtefactoElectronico.typeArtefacto.REFRIGERADOR);
        h4.crear();

        Television h5= (Television) FactoryArtefactoElectronico.make(FactoryArtefactoElectronico.typeArtefacto.TELEVISION);
        h5.crear();
    }
}
