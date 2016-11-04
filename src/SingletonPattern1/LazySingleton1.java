package SingletonPattern1;

/**
 * Created by tianf on 2016/8/12.
 */

/*
饿汉式单例类在类被加载时就将自己实例化，它的优点在于无须考虑多线程访问问题，
可以 确保实例的唯一性；从调用速度和反应时间角度来讲，由于单例对象一开始就得以创建，
因 此要优于懒汉式单例。但是无论系统在运行时是否需要使用该单例对象，由于在类加载时该 对象就需要创建，
因此从资源利用效率角度来讲，饿汉式单例不及懒汉式单例，而且在系统 加载时由于需要创建饿汉式单例对象，加载时间可能会比较长。
懒汉式单例类在第一次使用时创建，无须一直占用系统资源，实现了延迟加载，
但是必须处 理好多个线程同时访问的问题，特别是当单例类作为资源控制器，
在实例化时必然涉及资源 初始化，而资源初始化很有可能耗费大量时间，这意味着出现多线程同时首次引用此类的机 率变得较大，
需要通过双重检查锁定等机制进行控制，这将导致系统性能受到一定影响
 */

public class LazySingleton1 {

    //在 synchronized中再进行一次(instance	==	null)判断，这种方式称为双重检查锁定(Double-Check Locking)


    private volatile static LazySingleton1 instance = null;

    //如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之 前增加修饰符volatile，
    // 被volatile修饰的成员变量可以确保多个线程都能够正确处理，且该代 码只能在JDK	1.5及以上版本中才能正确执行。
    // 由于volatile关键字会屏蔽Java虚拟机所做的一 些代码优化，可能会导致系统运行效率降低，
    // 因此即使使用双重检查锁定来实现单例模式也 不是一种完美的实现方式

    public LazySingleton1() {
    }

    public static LazySingleton1 getInstance() {
        	//第一重判断
        if(instance == null) {
            	//锁定代码块
            synchronized(LazySingleton1.class) {
                		//第二重判断
                if(instance == null) {
                    instance	=	new	LazySingleton1();	//创建单例实例
                }
            }
        }
        return instance;
    }
}