package strategy;

public class AObject {

    AInterface aInterface;

    public AObject() {
        aInterface = new AInterfaceImpl();
    }

    public int plus(int a, int b) {
        return aInterface.add(a, b);
    }

    public int minus(int a, int b) {
        return aInterface.minus(a, b);
    }

    public long multiply(int a, int b) {
        return aInterface.multiply(a, b);
    }

    public double divide(int a, int b) {
        return aInterface.divide(a, b);
    }
}
