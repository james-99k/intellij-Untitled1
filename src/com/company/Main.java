package com.company;

import org.w3c.dom.Text;

import javax.swing.text.EditorKit;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //day1
        /*variables();
        switchCase();
        forLoop();
        whileLoop();
        doWhileLoop();
        diamond();*/

        //day2
        //Operations();
        typeCasting();

        //Exercise
        /*calculation();
        conversion();
        sumOfIntegers();*/
    }

    public static void variables(){
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
    }

    public static void Operations(){
        int num1 = 10;
        int num2 = 20;

        System.out.println("First Digit: " + num1 +" Second Digit: " + num2);
        System.out.println();

        //Operations
        System.out.print("Addition: ");
        System.out.println( num1 + num2);
        System.out.print("Subtraction: ");
        System.out.println( num1 - num2);
        System.out.print("Multiplication: ");
        System.out.println( num1 * num2);
        System.out.print("Division: ");
        System.out.println( num1 / num2);
        System.out.print("Modulo: ");
        System.out.println( num1 % num2);
        System.out.println();

        //Conditional
        System.out.print(+num1 +" Greater than " +num2 +" = ");
        System.out.println( num1 > num2);
        System.out.print(+num1 +" Less than " +num2 +" = ");
        System.out.println( num1 < num2);
        System.out.print("Greater than or Equal: ");
        System.out.println( num1 >= num2);
        System.out.print("Less than or Equal: ");
        System.out.println( num1 <= num2);
        System.out.print("Equals: ");
        System.out.println( num1 == num2);
        System.out.print("Not equals: ");
        System.out.println( num1 != num2);
        System.out.println();

        int number = 5;
        int anotherNumber = 10;

        number += anotherNumber;
        System.out.println(number);
        number -= anotherNumber;
        System.out.println(number);
        number *= anotherNumber;
        System.out.println(number);
        number /= anotherNumber;
        System.out.println(number);
        number %= anotherNumber;
        System.out.println(number);
        System.out.println();

        //Incremental
        int numberApples = 5;
        numberApples++;
        System.out.println(numberApples);

        int numberOranges = 5;
        numberOranges--;
        System.out.println(numberOranges);
        System.out.println();

        int incrementOperatorA = 5;
        int incrementOperatorB = 3;

        int incrementOperatorC = incrementOperatorA * incrementOperatorB++;
        System.out.println(incrementOperatorC);
        int incrementOperatorD = incrementOperatorA * --incrementOperatorB;
        System.out.println(incrementOperatorD);
        System.out.println();

        byte b2 = 127;
        b2 %= 7;
        System.out.println(b2);
        byte b3 = 120;
        b3 &= 40;
        System.out.println(b3);
        short s1 = 300;
        s1 ^= 100;
        System.out.println(s1);
        byte b4 = 127;
        b4 >>= 3;
        System.out.println(b4);
    }

    public static void typeCasting(){
        //type casting
        //Widening casting
        //byte -> short -> char -> int -> long -> float ->double
        short myShort =9;
        double myDoulbe = myShort;

        System.out.println(myShort);
        System.out.println(myDoulbe);
        System.out.println();

        //Narrowing casting
        double mySecondDouble = 9.78;
        short mySecondShort = (short) mySecondDouble;
        int mySecondInt = (int) mySecondDouble;

        System.out.println(mySecondDouble);
        System.out.println(mySecondShort);
        System.out.println(mySecondInt);

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
            System.out.print("*");
        }
    }

    public static void whileLoop(){
        int a = 1;
        while (a < 5) {
            System.out.print("^");
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

    public static void diamond(){
        int rows = 5, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
        for(int i = rows - 1; i >= 1; --i) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void calculation(){
        Scanner input1 = new Scanner(System.in);
        System.out.print("First Digit: ");
        int num1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Second Digit: ");
        int num2 = input2.nextInt();
        System.out.println();

        System.out.println("First Digit: " + num1 +" Second Digit: " + num2);
        System.out.println();

        //Operations
        System.out.print("Addition: ");
        System.out.println( num1 + num2);
        System.out.print("Subtraction: ");
        System.out.println( num1 - num2);
        System.out.print("Multiplication: ");
        System.out.println( num1 * num2);
        System.out.print("Division: ");
        System.out.println( num1 / num2);
        System.out.print("Modulo: ");
        System.out.println( num1 % num2);
        System.out.println();
    }

    public static void conversion(){
        //deci to hexa
        Scanner inputDeci = new Scanner( System.in );
        System.out.print("Enter a decimal number : ");
        int hexOutput =inputDeci.nextInt();

        // calling method toHexString()
        String str = Integer.toHexString(hexOutput);
        System.out.println(+hexOutput +" to hexadecimal: "+str);
        System.out.println();

        //Hexa to deci
        Scanner inputHex = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexnum = inputHex.nextLine();
        inputHex.close();

        //converting hex to decimal by passing base 16
        int deciOutput = Integer.parseInt(hexnum,16);

        System.out.println(hexnum +" to decimal: "+deciOutput);
    }

    public static void sumOfIntegers(){

        System.out.println("Input digit to add numbers || 0 = end");
        int sum = 0;
        Scanner scn = new Scanner(System.in);
        while (true) {
            int input = scn.nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
        }
        System.out.println("Sum: " + sum);
    }


}
