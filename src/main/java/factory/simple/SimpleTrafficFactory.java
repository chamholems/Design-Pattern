package main.java.factory.simple;

public class SimpleTrafficFactory {

    public static final int CAR = 1;
    public static final int PLANE = 2;

    public static Traffic createTraffic(int type){
        switch (type){
            case 1:
                return new Car();
            case 2:
                return new Plane();
            default:
                return null;
        }
    }

}
