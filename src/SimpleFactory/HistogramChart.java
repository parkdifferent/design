package SimpleFactory;

/**
 * Created by tianf on 2016/8/12.
 */
public class HistogramChart implements Chart {
    @Override
    public void display() {
        System.out.println("HistogramChart的display()");
    }

    public HistogramChart() {
        System.out.println("HistogramChart的构造函数");
    }
}
