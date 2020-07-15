package main.java.factory.abstraction.staff;

import main.java.factory.abstraction.abs.AbstractStaff;

public class Designer extends AbstractStaff {
    @Override
    public void name() {
        System.out.println("我是设计师");
    }
}
