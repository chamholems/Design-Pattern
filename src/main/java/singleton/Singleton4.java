package main.java.singleton;

/**
 * 懒汉式2改进
 * 缩小synchronized范围以达到效率提升
 * 不可行！
 */
public class Singleton4 {

    private static Singleton4 INSTANCE;

    private Singleton4(){}

    /**
     * 只有在调用getInstance 方法时，才去判断有没有实例，没有才实例化
     * @return
     */
    public static Singleton4 getInstance(){
        if (INSTANCE == null){
            // 线程不安全测试
            // 尝试通过减小同步代码块的方式提高效率
            synchronized (Singleton4.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton4();
            }

        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->
                System.out.println(Singleton4.getInstance().hashCode())
            ).start();
            // 打印出来的HashCode是相同的
        }
    }


}
