package edu.escuelaing.arep.secureapp;

public class Calculator {
    public static double calculate(String operation,double number){
        double valueToReturn = 0;
        switch (operation){
            case "sin":{
                valueToReturn = Math.sin(number);
                break;
            } case "cos":{
                valueToReturn = Math.cos(number);
                break;
            } case "tan":{
                valueToReturn = Math.tan(number);
                break;
            }
        }
        return valueToReturn;
    }
}
