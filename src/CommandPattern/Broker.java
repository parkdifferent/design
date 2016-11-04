package CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tianf on 2016/8/19.
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
