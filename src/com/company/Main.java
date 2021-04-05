package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Exercise: 1
        /*arithmethicOperations();*/

        //Exercise: 2
        /*arithmethicOperations();
        assignmentOperations();
        comparisonOperations();
        logicalOperators();
        bitwiseOperators();*/

        //Exercise: 3
        /*ifCondition();*/

        //Exercise: 4
        /*switchCase();*/

        //Exercise: 5
        //whileLoop();
        //whileLoopExercise();
        //whileLoopExcercise2();

        //day1 review
        /*variables();
        ifCondition();
        switchCase();
        forLoop();
        whileLoop();
        whileLoopExercise();
        whileLoopExcercise2();
        doWhileLoop();
        diamond();*/

        //day2 review
        /*Operations();
        typeCasting();*/

        //Exercise
        /*calculation();
        conversion();
        sumOfIntegers();*/

        //day3
        //doWhileLoopExercise();
        //forLoopExercise();
        //randomMaleName();
        //randomFemaleName();
        //randomRelationship();
        //displaySentence();

        //day4
        //arrayCalculate();
        //("James", "vincent", "gastador");
        phraseString();

    }

    public static void variablesAndTypeCasting(){
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

    public static void arithmethicOperations(){
        byte byteVariable = 127;
        short mediumRangeDecimalVariable = 23767;
        int wholeNumber = 122;
        long largeDecimalNumbers = -12;
        float numberWithDecimalPlaces = 8.3f;
        double veryLargeNumberWithDecimalPlaces = 12312312.1232;
        boolean isTrueOrFalse = true;
        char singleCharacter = '\u0041';

            System.out.println(+byteVariable);
            System.out.println(+mediumRangeDecimalVariable);
            System.out.println(+wholeNumber);
            System.out.println(+largeDecimalNumbers);
            System.out.println(+numberWithDecimalPlaces);
            System.out.println(+veryLargeNumberWithDecimalPlaces);
            System.out.println(isTrueOrFalse);
            System.out.println(+singleCharacter);

        int num1 = 10;
        int num2 = 20;

        System.out.println("First Digit: " + num1 +" Second Digit: " + num2);
        System.out.println();

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

    public static void assignmentOperations(){
        int num1 = 10;
        int num2 = 20;

        System.out.println("First Digit: " + num1 +" Second Digit: " + num2);
        System.out.println();
    }

    public static void comparisonOperations(){
        int num1 = 10;
        int num2 = 20;

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

    }

    public static void logicalOperators(){
        Scanner sc = new Scanner(System. in );
        String name = "James";
        String input;
        System.out.println("Enter a name: ");
        input = sc.next();

        if (name.equals(name) && input.equals(input)) {
            System.out.println("Your name is James");
        }
        else {
            System.out.println("You're not James");
        }

        if (name.equals(name) || input.equals(input)) {
            System.out.println("You maybe James");
        }
    }

    public static void bitwiseOperators(){

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

    public static void ifCondition(){
        Scanner input = new Scanner(System.in);
        System.out.print("Day: ");
        int day = input.nextInt();

        if (day == 1){
            System.out.println("Monday");
        }
        else if (day == 2){
            System.out.println("Tuesday");
        }
        else if (day == 3){
            System.out.println("Wednesday");
        }
        else if (day == 4){
            System.out.println("Thursday");
        }
        else if (day == 5){
            System.out.println("Friday");
        }
        else if (day == 6){
            System.out.println("Saturday");
        }
        else {
            System.out.println("Sunday");
        }
    }

    public static void switchCase(){

        Scanner input = new Scanner(System.in);
        System.out.print("Day: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.print("Sunday");
                break;
        }
    }

    public static void whileLoop(){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int num = input.nextInt();

        int a = 1;
        while (a <= num) {
            System.out.print(a +" ");
            a++;
        }
    }

    public static void whileLoopExercise(){
        int a = 1;
        while (a < 7) {
            System.out.print("["+a +"] ");
            a++;
        }
    }

    public static void whileLoopExcercise2(){
        int sum = 0;
        int num = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int numInput = input.nextInt();

        while (num <= numInput){

            System.out.print(num);
            if (num < numInput){
                System.out.print(" + ");
            }
            sum = sum + num;
            num++;
        }
        System.out.println(" Total Sum = " +sum);
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
        } else if (false) {
            System.out.println("Else if");
        }
        else {
            System.out.println("else");
        }
    }

    public static void forLoop(){
        for (int i = 5; i < 10; i++) {
            System.out.print("*");
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

    public static void Operations(){
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

    public static void doWhileLoopExercise(){
        int b = 2;

            do {
                System.out.print(b);
                if (b < 10){
                    System.out.print(", ");
                }
                    b++;
            }
            while (b <= 10);
    }

    public static void forLoopExercise(){
        int num1 = 1, num2 = 1;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Display how many fibonacci number: ");
        int input = input1.nextInt();

        for (int i = 1; i <= input; ++i) {
            System.out.print(num1);

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            if (i < input){
                System.out.print(", ");
            }
        }
    }

    public static void randomMaleName(){
        String[] names = { "Liam", "Noah", "Oliver", "William", "Elijah", "Benjamin" };
        Random Dice = new Random();
        int n = Dice.nextInt(6);
        System.out.print(names[n] +" ");
    }

    public static void randomFemaleName(){
        String[] names = { "Olivia", "Emma", "Ava", "Sophia", "Isabelle", "Charlotte" };
        Random Dice = new Random();
        int n = Dice.nextInt(6);
        System.out.print(names[n] +" ");
    }

    public static void randomRelationship(){
        String[] names = { "Loves", "Hates", "Likes", "is mad with", "is angry with", "sympathizes with" };
        Random Dice = new Random();
        int n = Dice.nextInt(6);
        System.out.print(names[n] +" ");
    }

    public static void displaySentence(){
        randomMaleName();
        randomRelationship();
        randomFemaleName();
    }

    public static void arrayCalculate(){
        int[] numbers = {10, 3, 5, -20, 0, 23};
        int sum = 0;

        for (int number: numbers){
            sum += number;
        }
        System.out.print("Sum = " +sum);
    }

    public static void myMethod(String fname, String mname, String lname){
        System.out.println(fname + mname + lname + "My method");
    }

    public static void phraseString(){
        System.out.print("Enter a phrase: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println("Number of words: " +stringWordCount(str));
        System.out.println("Number of vowels: " +stringVowelCount(str));

    }

    public static int stringWordCount(String str){
        int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1;
        return count;
    }

    public static int stringVowelCount(String str){
        int vowel = 0;

        for (int i=0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                vowel++;
            }
        }
        return vowel;
    }

}
