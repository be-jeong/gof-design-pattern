package strategy;

public class AInterfaceImpl implements AInterface {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    public long multiply(int a, int b) {
        return a*b;
    }

    @Override
    public double divide(int a, int b) {
        return a/b;
    }

}
