package main.java.factory.method.factory;

import main.java.factory.method.Traffic;
import main.java.factory.method.TrafficFactory;
import main.java.factory.method.product.Bicycle;
import main.java.factory.method.product.Train;

public class TrainFactory implements TrafficFactory {

    @Override
    public Traffic createTraffic() {
        System.out.println("创建Train");
        return new Train();
    }
}
