package Other.InterceptingFilterPattern;

/**
 * Created by tianf on 2016/8/19.
 */
public class DebugFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
