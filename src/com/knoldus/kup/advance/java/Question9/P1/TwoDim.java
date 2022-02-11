package com.knoldus.kup.advance.java.Question9.P1;

public class TwoDim {
    private int xCoordinate, yCoordinate;
    public TwoDim() {
    }
    public TwoDim(int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    @Override
    public String toString() {
        return "X = " + xCoordinate +
                ", Y = " + yCoordinate;
    }
}
