package VisitorPattern;

/**
 * Created by tianf on 2016/8/19.
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
