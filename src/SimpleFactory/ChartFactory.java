package SimpleFactory;

/**
 * Created by tianf on 2016/8/12.
 */
public class ChartFactory {

    public static Chart getChart(String type) {
        Chart chart=null;
        if(type.equalsIgnoreCase("histogram")) {
            chart	=	new	HistogramChart();
            System.out.println("创建HistogramChart");
        }
        else if(type.equalsIgnoreCase("line")) {
            chart=new LineChart();
            System.out.println("创建LineChart");
        }
        else if(type.equalsIgnoreCase("pie")) {
            chart=new LineChart();
            System.out.println("创建LineChart");
        }
        return chart;

    }
}
