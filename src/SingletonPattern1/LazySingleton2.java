package SingletonPattern1;

/**
 * Created by tianf on 2016/8/12.
 */

/*
编译并运行上述代码，运行结果为：true，即创建的单例对象s1和s2为同一对象。
由于静态单 例对象没有作为Singleton的成员变量直接实例化，因此类加载时不会实例化Singleton，
第一次 调用getInstance()时将加载内部类HolderClass，在该内部类中定义了一个static类型的变量 instance，
此时会首先初始化这个成员变量，由Java虚拟机来保证其线程安全性，确保该成员 变量只能初始化一次。
由于getInstance()方法没有任何线程锁定，因此其性能不会造成任何影 响。
通过使用IoDH，我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能，
不失为 一种最好的Java语言单例模式实现方式（其缺点是与编程语言本身的特性相关，很多面向对象 语言不支持IoDH）。

 */










public class LazySingleton2 {

    private LazySingleton2() {
    }
    private static class HolderClass {
        private static final LazySingleton2 instance = new LazySingleton2();
    }

    public static LazySingleton2 getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        LazySingleton2 s1,s2;
        s1 = LazySingleton2.getInstance();
        s2 = LazySingleton2.getInstance();
        System.out.println(s1==s2);
    }
}
