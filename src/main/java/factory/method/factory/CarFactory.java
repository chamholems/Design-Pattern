package main.java.factory.method.factory;

import main.java.factory.method.Traffic;
import main.java.factory.method.TrafficFactory;
import main.java.factory.method.product.Car;

public class CarFactory implements TrafficFactory {

    @Override
    public Traffic createTraffic() {
        System.out.println("创建car");
        return new Car();
    }
}
