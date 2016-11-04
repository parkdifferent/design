package Other.ServiceLocatorPattern;

/**
 * Created by tianf on 2016/8/19.
 */
public class Service2 implements Service {

    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");

    }
}
