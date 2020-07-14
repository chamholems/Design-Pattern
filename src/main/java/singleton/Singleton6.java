package main.java.singleton;

/**
 * 静态内部类写法
 * 由JVM保证单例
 */
public class Singleton6 {

    private Singleton6() {}

    /**
     * 静态内部类初始化的时候不会加载，只有在getInstance()的时候才加载内部类
     */
    private static class SingletonHolder {
        private final static Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return SingletonHolder.INSTANCE;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() ->
                    System.out.println(Singleton6.getInstance().hashCode())
            ).start();
            // 打印出来的HashCode是相同的
        }
    }


}
