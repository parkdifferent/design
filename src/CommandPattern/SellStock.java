package CommandPattern;

/**
 * Created by tianf on 2016/8/19.
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }


    @Override
    public void execute() {
        abcStock.sell();
    }
}
