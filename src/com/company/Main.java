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

    if(isTrueOrFalse == true)
    {
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
}
