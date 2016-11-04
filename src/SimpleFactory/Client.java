package SimpleFactory;

/**
 * Created by tianf on 2016/8/12.
 */
public class Client {
    public static void main(String[] args) {
        Chart	chart;
        chart	=	ChartFactory.getChart("histogram");
        chart.display();
    }
}
