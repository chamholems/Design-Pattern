package main.java.factory.abstraction.product;

import main.java.factory.abstraction.abs.AbstractProduct;

public class Picture extends AbstractProduct {
    @Override
    public void show() {
        System.out.println("画出一幅图");
    }
}
