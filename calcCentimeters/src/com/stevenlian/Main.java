package com.stevenlian;

public class Main {

    public static void main(String[] args) {
        calcFeetandInchesToCentimeters(10, 10);
        calcFeetandInchesToCentimeters(130);


    }

    public static double calcFeetandInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches <= 12 && inches >= 0) {
            double calcCentimeters = 2.54 * (12 * feet + 1 * inches);
            System.out.println("Total centimeters = " + calcCentimeters + " cm");
        }
        return -1;
    }


    public static double calcFeetandInchesToCentimeters(double inches) {
        if (inches > 0) {
            double calcCentimeters = calcFeetandInchesToCentimeters(10,10);
            System.out.println("Total centimeters = " + calcCentimeters + " cm");

        }
        return -1;
    }
}



