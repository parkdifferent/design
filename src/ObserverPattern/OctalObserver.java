package ObserverPattern;

/**
 * Created by tianf on 2016/8/18.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {

        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );

    }
}
