package SingletonPattern1;

/**
 * Created by tianf on 2016/8/12.
 */
public class LazySingleton {

    private static LazySingleton instance= null;

    private LazySingleton() {
    }


    //synchronized 线程锁，以处理多个线 程同时访问的问题。
    //但是每次调用getInstance()时 都需要进行线程锁定判断，在多线程高并发访问环境中，将会导致系统性能大大降低
    public synchronized static LazySingleton getInstance() {
        if(instance == null) {
            return new LazySingleton();
        }
        return instance;
    }


    //我们 无须对整个getInstance()方法进行锁定，只需对其中的代码“instance	=	new	LazySingleton();

    public  static LazySingleton getInstance1() {
        if(instance == null) {

            //还是会存在单例对象不 唯一

            synchronized(LazySingleton.class) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }


    //在 synchronized中再进行一次(instance	==	null)判断，这种方式称为双重检查锁定(Double-Check Locking)





}
