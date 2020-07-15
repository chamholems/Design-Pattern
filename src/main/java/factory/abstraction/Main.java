package main.java.factory.abstraction;

import main.java.factory.abstraction.factory.DesignFactory;
import main.java.factory.abstraction.factory.TechnologyFactory;

/**
 * 抽象工厂模式
 * 抽象工厂模式为创建一组对象提供了一种解决方案。与工厂方法模式相比，抽象工厂模式中的具体工厂不只是创建一种产品，它负责创建一族产品。
 */
public class Main {


    public static void main(String[] args) {
    /*
        有两种公司company：技术公司、设计公司
        技术公司的员工staff为： developer、designer
        产品product为：software、picture
     */
//        AbstractFactory factory = new DesignFactory();
        AbstractFactory factory = new TechnologyFactory();
        factory.createCompany().printName();
        factory.createStaff().name();
        factory.createProduct().show();
    }


}
