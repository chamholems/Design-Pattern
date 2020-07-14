package main.java.singleton;

/**
 * 枚举单例 《Effective Java》 里的写法
 * 不仅可以解决线程同步，还可以防止反序列化
 */
public enum Singleton7 {

    INSTANCE;

    public void m(){
        System.out.println("ssss");
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() ->
                    System.out.println(Singleton7.INSTANCE.hashCode())
            ).start();
            // 打印出来的HashCode是相同的
        }
        Singleton7.INSTANCE.m();
    }


}
