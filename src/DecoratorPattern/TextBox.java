package DecoratorPattern;

/**
 * Created by tianf on 2016/8/15.
 */

//文本框类：具体构件类
public class TextBox extends Component{

    @Override
    public void display() {
        System.out.println("显示文本框！");
    }
}
