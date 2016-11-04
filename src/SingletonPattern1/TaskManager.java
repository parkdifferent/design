package SingletonPattern1;

/**
 * Created by tianf on 2016/8/12.
 */
public class TaskManager {

    private static TaskManager tm =null;

    public TaskManager() {
    }

    //显示进程
    public void displayProcesses() {

    }

    //显示服务
    public void displayServices() {

    }

    public static TaskManager getInstance() {
        if(tm == null) {
            return new TaskManager();
        }
        else
            return tm;
    }


}
