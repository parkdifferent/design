package Other.BusinessDelegatePattern;

/**
 * Created by tianf on 2016/8/19.
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
