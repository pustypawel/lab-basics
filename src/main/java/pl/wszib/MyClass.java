package pl.wszib;

public class MyClass extends MyAbstractClass implements MyInterface, MyInterface2 {
    int myInt = 0;
    Integer myInteger = null;

    @Override
    public void doCalculation() {
        doPrint();
        //autoboxing
        Integer myLocalInt = myInt;
        //autounboxing
        int myLocalInteger = myInteger;
        Integer myIntegerToChange = 10;
        doChange(myIntegerToChange);
        System.out.println("myIntegerToChange = " + myIntegerToChange);
    }

    public void doChange(Integer myArgInteger) {
        myArgInteger = 20;
    }

    @Override
    public void doRun() {

    }

    @Override
    public void doRun2() {

    }

//    @Override
//    public void doPrint() {
//        System.out.println("MyDoPrint");
//    }
}

