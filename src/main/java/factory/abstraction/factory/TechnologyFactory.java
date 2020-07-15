package main.java.factory.abstraction.factory;

import main.java.factory.abstraction.AbstractFactory;
import main.java.factory.abstraction.abs.AbstractCompany;
import main.java.factory.abstraction.abs.AbstractProduct;
import main.java.factory.abstraction.abs.AbstractStaff;
import main.java.factory.abstraction.company.TechnologyAbstractCompany;
import main.java.factory.abstraction.product.Software;
import main.java.factory.abstraction.staff.Developer;

public class TechnologyFactory extends AbstractFactory {
    @Override
    public AbstractCompany createCompany() {
        return new TechnologyAbstractCompany();
    }

    @Override
    public AbstractProduct createProduct() {
        return new Software();
    }

    @Override
    public AbstractStaff createStaff() {
        return new Developer();
    }
}
