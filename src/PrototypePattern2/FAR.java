package PrototypePattern2;

/**
 * Created by tianf on 2016/8/12.
 */

//可行性分析报告(Feasibility	Analysis	Report)类
public class FAR implements OfficialDocument  {

    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
           far = (OfficialDocument)super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("《可行性分析报告》");

    }
}
