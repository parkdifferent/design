package SimpleFactory;

/**
 * Created by tianf on 2016/8/12.
 */
public class PieChart implements Chart {
    @Override
    public void display() {
        System.out.println("PieChart的display");

    }

    public PieChart() {
        System.out.println("PieChart的构造函数");
    }
}
