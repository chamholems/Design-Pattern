package main.java.singleton;

/**
 * 单例：饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 * 缺点：不管用到与否，类装载时就完成实例化
 */
public class Singleton1 {

    private static final Singleton1 INSTANCE = new Singleton1();

    /**
     * 构造方法私有，无法new
     */
    private Singleton1() {}

    /**
     * 静态方法返回该类实例
     * @return
     */
    public static Singleton1 getInstance(){ return INSTANCE; }


    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        //true 这两个引用指向同一个地址值（同一个对象）
        System.out.println(s1 == s2);
    }

}
