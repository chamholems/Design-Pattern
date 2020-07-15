package main.java.factory.abstraction.company;


import main.java.factory.abstraction.abs.AbstractCompany;

public class TechnologyAbstractCompany extends AbstractCompany {

    @Override
    public void printName() {
        System.out.println("我是科技公司");
    }
}
