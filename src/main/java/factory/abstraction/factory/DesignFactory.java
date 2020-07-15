package main.java.factory.abstraction.factory;

import main.java.factory.abstraction.AbstractFactory;
import main.java.factory.abstraction.abs.AbstractCompany;
import main.java.factory.abstraction.abs.AbstractProduct;
import main.java.factory.abstraction.abs.AbstractStaff;
import main.java.factory.abstraction.company.DesignAbstractCompany;
import main.java.factory.abstraction.product.Picture;
import main.java.factory.abstraction.staff.Designer;

public class DesignFactory extends AbstractFactory {
    @Override
    public AbstractCompany createCompany() {
        return new DesignAbstractCompany();
    }

    @Override
    public AbstractProduct createProduct() {
        return new Picture();
    }

    @Override
    public AbstractStaff createStaff() {
        return new Designer();
    }
}
