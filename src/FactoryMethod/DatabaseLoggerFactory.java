package FactoryMethod;

/**
 * Created by tianf on 2016/8/12.
 */
public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        // 创建数据库日志记录器对象
         Logger	logger	=	new	DatabaseLogger();
        // 初始化数据库日志记录器，代码省略
        return	logger;
    }
}
