package StrategyPattern;

/**
 * Created by tianf on 2016/8/18.
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
