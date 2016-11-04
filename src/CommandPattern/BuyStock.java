package CommandPattern;

/**
 * Created by tianf on 2016/8/19.
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }



    @Override
    public void execute() {
        abcStock.buy();
    }
}
