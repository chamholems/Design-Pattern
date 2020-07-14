package main.java.singleton;

/**
 * 懒汉式1改进
 * 加synchronized关键字解决，但也带来了效率下降
 *
 */
public class Singleton3 {

    private static Singleton3 INSTANCE;

    private Singleton3(){}

    /**
     * 只有在调用getInstance 方法时，才去判断有没有实例，没有才实例化
     * @return
     */
    public static synchronized Singleton3 getInstance(){
        if (INSTANCE == null){
            // 线程不安全测试
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->
                System.out.println(Singleton3.getInstance().hashCode())
            ).start();
            // 打印出来的HashCode是相同的
        }
    }


}
