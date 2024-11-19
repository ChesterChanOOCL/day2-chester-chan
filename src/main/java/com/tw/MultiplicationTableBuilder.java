package com.tw;

public class MultiplicationTableBuilder {
    public boolean isInRange(int number) {
        return number > 0 && number <= 1000;
    }
    public boolean isStarterNotBiggerThanEnd(int start, int end){
        return false;
    }
    public boolean isStarterAndEndInRangeOf1To1000 ( int start, int end){
        return false;
    }

    public String generateExpression (int start, int end){
        return "2*4=9";
    }
}
