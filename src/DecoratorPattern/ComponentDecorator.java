package DecoratorPattern;

/**
 * Created by tianf on 2016/8/15.
 */

//构件装饰类：抽象装饰类
public class ComponentDecorator extends Component {

    private	Component	component;		//维持对抽象构件类型对象的引用

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
