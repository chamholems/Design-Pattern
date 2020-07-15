package main.java.factory.method.product;

import main.java.factory.method.Traffic;

public class Train implements Traffic {
    @Override
    public void run() {
        System.out.println("Train run ...");
    }
}
