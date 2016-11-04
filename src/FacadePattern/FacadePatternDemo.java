package FacadePattern;

/**
 * Created by tianf on 2016/8/19.
 */
public class FacadePatternDemo  {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
