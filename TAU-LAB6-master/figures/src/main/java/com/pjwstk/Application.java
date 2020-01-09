package com.pjwstk;

public class Application {
    public static void main(String[] args) {
        boolean result = new FigureValidator().verify(args);
        if (!result)
        {
            System.out.println("nierozpoznano");
        }

    }
}