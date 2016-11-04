package ObserverPattern;

/**
 * Created by tianf on 2016/8/18.
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
