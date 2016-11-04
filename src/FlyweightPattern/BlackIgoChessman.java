package FlyweightPattern;

/**
 * Created by tianf on 2016/8/15.
 */

//黑色棋子类：具体享元类
public class BlackIgoChessman extends IgoChessman {

    @Override
    public String getColor() {
        return "黑色";
    }
}
