package PrototypePattern;

/**
 * Created by tianf on 2016/8/12.
 */
public class WeeklyLog implements Cloneable {

    private String name;
    private String data;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    //克隆方法clone()，此处使用Java语言提供的克隆机制
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/


    public WeeklyLog clone1() throws CloneNotSupportedException {
            Object obj = null;
            obj = super.clone();
            return (WeeklyLog)obj;
    }

}
