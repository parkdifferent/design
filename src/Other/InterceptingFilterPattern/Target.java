package Other.InterceptingFilterPattern;

/**
 * Created by tianf on 2016/8/19.
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
