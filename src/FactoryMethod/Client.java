package FactoryMethod;

/**
 * Created by tianf on 2016/8/12.
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory1=new FileLoggerFactory();  //可引入配置文件实现
        Logger logger1 = factory1.createLogger();
        logger1.writeLog();

    }



}
