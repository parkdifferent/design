package SingletonPattern1;

/**
 * Created by tianf on 2016/8/12.
 */
public class EagerSingleton {

    //，由于在定义静态变量的时候实例化单例类，因此在类加载的时候就已经 创建了单例对象
    private static final EagerSingleton instance=new EagerSingleton();

    //当类被加载时，静态变量instance会被初始化，此时类的私有构造函数会被调用，单例类的唯 一实例将被创建

    private EagerSingleton() {
        System.out.println("会被调用么");

    }
    public static EagerSingleton getInstance() {
        return instance;
    }


    public static void main(String[] args) {
        EagerSingleton eagerSingleton=EagerSingleton.getInstance();
    }


}
