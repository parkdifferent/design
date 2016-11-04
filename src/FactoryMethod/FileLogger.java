package FactoryMethod;

import sun.rmi.runtime.Log;

/**
 * Created by tianf on 2016/8/12.
 */
public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
