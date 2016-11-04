package PrototypePattern2;

/**
 * Created by tianf on 2016/8/12.
 */

////软件需求规格说明书(Software	Requirements	Specification)类
public class SRS implements OfficialDocument {

    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument)super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();

        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");

    }
}
