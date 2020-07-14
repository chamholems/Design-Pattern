package main.java.singleton;

/**
 * 懒汉式
 * 缺点：虽然达到了按需初始化的目的，但带来了线程不安全的问题
 */
public class Singleton2 {

    private static Singleton2 INSTANCE;

    private Singleton2(){}

    /**
     * 只有在调用getInstance 方法时，才去判断有没有实例，没有才实例化
     * @return
     */
    public static Singleton2 getInstance(){
        if (INSTANCE == null){
            // 线程不安全测试
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->
                System.out.println(Singleton2.getInstance().hashCode())
            ).start();
            // 打印出来的HashCode是不同的，不同对象，线程不安全
        }
    }


}
