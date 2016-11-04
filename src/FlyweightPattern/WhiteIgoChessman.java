package FlyweightPattern;

/**
 * Created by tianf on 2016/8/15.
 */

//白色棋子类：具体享元类
public class WhiteIgoChessman extends IgoChessman{

    @Override
    public String getColor() {
        return "白色";
    }
}
