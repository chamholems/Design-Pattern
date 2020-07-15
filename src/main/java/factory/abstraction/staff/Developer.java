package main.java.factory.abstraction.staff;

import main.java.factory.abstraction.abs.AbstractStaff;

public class Developer extends AbstractStaff {
    @Override
    public void name() {
        System.out.println("我是开发者");
    }
}
