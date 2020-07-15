package main.java.factory.method.product;

import main.java.factory.method.Traffic;

public class Car implements Traffic {
    @Override
    public void run() {
        System.out.println("car run...");
    }
}
