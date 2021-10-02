package pl.wszib;

import java.math.BigInteger;

public class MyClass extends MyAbstractClass implements MyInterface, MyInterface2 {
    int myInt = 0;
    Integer myInteger = null;
    BigInteger myBigInteger;
    Long myLong;
    long mySmallLong;

    @Override
    public void doCalculation() {
        //nie działa (traktowane jako int, a przekracza jego zakres):
//        mySmallLong = 100000000000000;
        myBigInteger = new BigInteger("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        mySmallLong = 11000000000000000L;
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

