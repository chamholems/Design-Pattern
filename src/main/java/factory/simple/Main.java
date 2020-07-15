package main.java.factory.simple;

/**
 * 简单/静态工厂模式
 */
public class Main {

    public static void main(String[] args) {
        // 使用交通工具
        Car car = new Car();
        car.go();
        Plane plane = new Plane();
        plane.go();

        // 使用简单工厂
        Traffic traffic = SimpleTrafficFactory.createTraffic(SimpleTrafficFactory.CAR);
        traffic.go();
        /*
            简单工厂是一个具体的类SimpleTrafficFactory，有一个重要的create()方法，利用if或者 switch创建产品并返回。
            create()方法通常是静态的，所以也称之为静态工厂。

            缺点
            1 扩展性差（我想增加一种交通工具，除了新增一个交通工具，还需要修改工厂类方法）

            2 不同的产品需要不同额外参数的时候 不支持。
         */
    }

}
