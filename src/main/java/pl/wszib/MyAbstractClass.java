package pl.wszib;

public abstract class MyAbstractClass implements MyInterface {
    public abstract void doCalculation();

    public final void doPrint() {
        System.out.println("DoPrint");
    }
}
