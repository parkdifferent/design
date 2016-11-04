package DecoratorPattern;

/**
 * Created by tianf on 2016/8/15.
 */
public class Client {

    public static void main(String[] args) {

      /*  Component component,componentSB;        //使用抽象构件定义
        component = new Window();      	//定义具体构件
        componentSB = new ScrollBarDecorator(component);  //定义滚动条装饰类
        componentSB.display();*/

        Component component,componentSB,componentBB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}
