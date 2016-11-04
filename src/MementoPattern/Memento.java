package MementoPattern;

/**
 * Created by tianf on 2016/8/18.
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
