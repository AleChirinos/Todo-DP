package basic;

public class ConcreteObject2 {

    private String attribute1;

    public ConcreteObject2(){}

    public void metodoB(){
        System.out.println("\n----------------");
        System.out.println("running....");
        System.out.println("ConcreteObject2>metodoB");
        System.out.println("algoritmo....");
        System.out.println("----------------");
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }
}
