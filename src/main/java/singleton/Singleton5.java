package main.java.singleton;

/**
 * 懒汉式3改进
 * 缩小synchronized范围以达到效率提升,并且双层判断
 * 这个可以说是最完美的懒汉式单例写法了，但是较复杂，感觉没必要
 */
public class Singleton5 {

    private static Singleton5 INSTANCE;

    private Singleton5(){}

    /**
     * 只有在调用getInstance 方法时，才去判断有没有实例，没有才实例化
     * @return
     */
    public static Singleton5 getInstance(){
        if (INSTANCE == null){
            // 线程不安全测试
            // 尝试通过减小同步代码块的方式提高效率
            synchronized (Singleton5.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 双层检查
                if(INSTANCE == null){
                    INSTANCE = new Singleton5();
                }
            }

        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->
                System.out.println(Singleton5.getInstance().hashCode())
            ).start();
            // 打印出来的HashCode是相同的
        }
    }


}
