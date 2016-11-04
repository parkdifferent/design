package FlyweightPattern;

import java.util.Hashtable;

/**
 * Created by tianf on 2016/8/15.
 */

//围棋棋子工厂类：享元工厂类，使用单例模式进行设计
public class IgoChessmanFactory {

    private static IgoChessmanFactory instance= new IgoChessmanFactory();
    private static Hashtable ht;          	//使用Hashtable来存储享元对象，充当享元池

    private IgoChessmanFactory() {
        ht	=	new	Hashtable();
        IgoChessman	black,white;
        black	=	new	BlackIgoChessman();
        ht.put("b",black);
        white	=	new	WhiteIgoChessman();
        ht.put("w",white);
    }

    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    public static IgoChessman getIgoChessman( String color) {
        return (IgoChessman)ht.get(color);

    }








}
