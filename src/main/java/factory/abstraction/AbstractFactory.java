package main.java.factory.abstraction;

import main.java.factory.abstraction.abs.AbstractCompany;
import main.java.factory.abstraction.abs.AbstractProduct;
import main.java.factory.abstraction.abs.AbstractStaff;

public abstract class AbstractFactory {

    public abstract AbstractCompany createCompany();
    public abstract AbstractProduct createProduct();
    public abstract AbstractStaff createStaff();

}
