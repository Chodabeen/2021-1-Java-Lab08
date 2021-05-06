package edu.handong.csee.java.hw2.converters;

/** This is a class of TONToGConverter. */
public class TONToGConverter implements Convertible{
    double a;
    /** This is a method that set fromValue. */
    public void setFromValue(double fromValue){
         a = fromValue;
    }
    /** This is a method that get converted value. */
    public double getConvertedValue(){
        return a;
    }
    /** This is a method that convert value. */
    public void convert(){
        a = a * 1000000;
    }
}