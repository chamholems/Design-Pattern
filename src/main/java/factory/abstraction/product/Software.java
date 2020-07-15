package main.java.factory.abstraction.product;

import main.java.factory.abstraction.abs.AbstractProduct;

public class Software extends AbstractProduct {
    @Override
    public void show() {
        System.out.println("开发出一个软件");
    }
}
