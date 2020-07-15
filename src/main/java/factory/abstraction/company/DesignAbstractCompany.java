package main.java.factory.abstraction.company;


import main.java.factory.abstraction.abs.AbstractCompany;

public class DesignAbstractCompany extends AbstractCompany {

    @Override
    public void printName(){
        System.out.println("我是设计公司");
    }
}
