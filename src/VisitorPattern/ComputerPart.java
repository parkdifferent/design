package VisitorPattern;

/**
 * Created by tianf on 2016/8/19.
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
