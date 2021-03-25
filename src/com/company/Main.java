package com.company;

import org.w3c.dom.Text;

public class Main {


    public static void main(String[] args) {
        byte byteVariable = 127;
        short mediumRangeDecimalVariable = 23767;
        int wholeNumber = 122;
        long largeDecimalNumbers = -12;
        float numberWithDecimalPlaces = 8.3f;
        double veryLargeNumberWithDecimalPlaces = 12312312.1232;
        boolean isTrueOrFalse = true;
        char singleCharacter = '\u0041';

        veryLargeNumberWithDecimalPlaces = wholeNumber;
        if (isTrueOrFalse == true) {
            System.out.println(+byteVariable);
            System.out.println(+mediumRangeDecimalVariable);
            System.out.println(+wholeNumber);
            System.out.println(+largeDecimalNumbers);
            System.out.println(+numberWithDecimalPlaces);
            System.out.println(+veryLargeNumberWithDecimalPlaces);
            System.out.println(isTrueOrFalse);
            System.out.println(+singleCharacter);
        }
        switchCase();
        forLoop();
        whileLoop();
        doWhileLoop();
    }

    public static void switchCase(){
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.print("Sunday");
                break;

        }
    }

    public static void forLoop(){
        for (int i = 5; i < 10; i++) {
            System.out.println("*");
        }
    }

    public static void whileLoop(){
        int a = 1;
        while (a < 5) {
            System.out.println("^");
            a++;
        }
    }

    public static void doWhileLoop(){
        int b = 0;
        do {
            System.out.println(b);
            b++;
        }
        while (b < 5);
    }

}
