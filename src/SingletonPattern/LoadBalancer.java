package SingletonPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by tianf on 2016/8/12.
 */
public class LoadBalancer {

    //私有静态成员变量，存储唯一实例
    	private	static	LoadBalancer	instance	=	null;
    //服务器集合
    	private List serverList	=	null;

    private LoadBalancer() {
        serverList=new ArrayList();
    }

    //公有静态成员方法，返回唯一实例
    public	static	LoadBalancer	getLoadBalancer()	{
        if	(instance	==	null)	{
            instance	=	new	LoadBalancer();
        }
        return	instance;
    }


    public void addServer(String server) {
        serverList.add(server);
    }

    public void removeServer(String server) {
        serverList.remove(server);
    }

    ////使用Random类随机获取服务器
    public String getServer() {
        Random random=new Random();
        int i = random.nextInt(serverList.size());
        return (String)serverList.get(i);
    }










}
