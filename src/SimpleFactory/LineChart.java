package SimpleFactory;

/**
 * Created by tianf on 2016/8/12.
 */
public class LineChart implements Chart {

    @Override
    public void display() {
        System.out.println("LineChart的display");

    }

    public LineChart() {

        System.out.println("LineChart的构造函数");
    }
}
