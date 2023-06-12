package com.company;
// primitive data types are of 8 types
//every data type takes different amount of space

// int , max=2147483647, min=-2147483648
//to get max and min possible value use integer.MIN_VALUE and integer.MAX_VALUE
// overflow and underflow in int
//32bits

// byte
//8bits , -128 to 127

// short
//32767 to -32768, 16 bits

// long
//9223372036854775807 to -9223372036854775808, 64 bits
//if we don't end Long with L java will take number as int and give error

//assignment

//casting
//default whole no used by java is int so no in () is seen as int while its not so it gives error
//but we know the result fits in data type we entered
//we put the type we want the no to be in () before the (no)

// float
//store decimal numbers
//single precision number i.e 32 bits. precision is format and amount of space
//not putting f or (float) before will give error as its seen as double as default in java

// double
//you can also put d in  end to reassure its double value but no compulsion

// char
//char can be used to save one letter value in '' like 'a'
//occupies 16 bits (2 bytes) of memory
//allows storing unicode characters

// boolean
public class Main {

    public static void main(String[] args) {
//INT
        int a = 10000;
        System.out.println("my value for x is " + a);             //will print my value of x is 10000

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("min int value is " + myMinIntValue);       //will give possible min value for int
        System.out.println("max int value is " + myMaxIntValue);       //will give possible max value for int

        int b = 2147483647;
        System.out.println(b);                                 //c=2147483648 will give error

        System.out.println("if we add 1 to max value " + (myMaxIntValue + 1)); //we get min value
        //jumps to min value if max added more called overflow
        System.out.println("if we deduct 1 from min value " + (myMinIntValue - 1)); //we get max value ,
        // jumps to max value if min reduced with more called underflow
        // this is overflow and underflow in java

        int c = 21_567_576; //underscore for easy reading wont show in output
        System.out.println(c);
        //int occupies 32 bits


//BYTE
        Byte myMinByteValue = Byte.MIN_VALUE;
        Byte myMaxByteValue = Byte.MAX_VALUE;
        //byte has b caps
        System.out.println("max byte value is " + (myMaxByteValue) + " and " + "min min value is " + (myMinByteValue));

        //we use byte cause it has smaller range compared to int
        //smaller data type takes up less space so you save memory by using byte if your input is in that range
        //can be quicker to access
        //byte occupies 8 bits


//SHORT
        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("max Short value is " + (myMaxShortValue) + " and " + "min min value is " + (myMinShortValue));
        //short occupies 16 bits


//LONG
        // 63 bits
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("max Long value is " + (myMaxLongValue) + " and " + "min min value is " + (myMinLongValue));


        Long d = 9223372036854775807L;
        System.out.println(d);
        //if we don't end Long with L java will take number as int and give error


//PRIMITIVE DATA TYPES ASSIGNMENT
        Byte B = 100;
        Short S = 20000;
        int I = 500000000;
        long Total = (50000L + 100L * (B + S + I)); //not putting L will give overflow and underflow
        //remember the places you put
        System.out.println(Total);


//CASTING
        int e = (myMaxIntValue / 2); //no error
        // Byte f = (myMinByteValue/2); will give error as () in parentheses value is detected as int value
        //to remove error type the data type in() before
        byte f = (byte) (myMaxByteValue / 2); //small b in()
        Short g = (short) (myMinShortValue / 2); //small s in()
        long i = (long) (myMinLongValue / 2);
        System.out.println("int " + e + " byte " + f + " short " + g + " long " + i);
        //default data type used by java is int so data type in () is seen as int while its not so it gives error
        //but we know the result fits in data type we entered
        //we put the type we want the no to be in () before the (no)
        //byte j = (byte) (myMinIntValue/2);
        //System.out.println(j);
        //will give 0 for min 1 for max


//FLOAT
        //store decimal numbers
        //single precision number i.e 32 bits. precision is format and amount of space
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("min value for float is " + myMinFloatValue + " max value for float is " + myMaxFloatValue);

        float myFloatValue = 63245.32967f; //not putting f or (float) before will give error as its seen as double as default in java
        System.out.println(myFloatValue);

        // can hold int values as well


//DOUBLE
        //double precision i.e 64 bits
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("min value for double " + myMinDoubleValue + " max value for double " + myMaxDoubleValue);

        double myDoubleValue = 4657.468376;
        System.out.println(myDoubleValue);
        //you can also put d in  end to reassure its double value but no compulsion
        // can hold int values as well


//INT FLOAT DOUBLE
        int myIntValue1 = 5 / 3;
        float myFloatValue1 = 5f / 3;
        double myDoubleValue1 = 5.00 / 3.00;
        System.out.println("int value " + myIntValue1 + " float value " + myFloatValue1 + " double value " + myDoubleValue1);
        //when = 5 will give 5, 5.0, 5.0 as the other 2 give decimal point
        //=5/2 will give 2, 2.5, 2.5
        //=5/3 will give int value 1 float value 1.6666666 double value 1.6666666666666667
        //removing .00 from double will make java treat it as int or add d in end or add (double)


//float and double arent recommended for precise calculation like currency calculations but we can use em for general calculations
//for them we have BigDecimal class in java


//converting pounds to kg
        double pounds = 3;
        double kgs = 0.45359237 * pounds;
        System.out.println(pounds + " pounds is equal to " + kgs + " kilograms");


//CHAR
        char x = 'k';
        System.out.println(x);
        //char can be used to save one letter value in '' like 'a'
        //occupies 16 bits (2 bytes) of memory
        //allows storing unicode characters
        char l = '\u00EF'; // slash u must be written before every unicode
        System.out.println(l);
        //refer to unicode table in another folder


//BOOLEAN
        int j = 4;
        int k = 5;
        System.out.println(j < k); //will give true
        //gives either true or false
        //idk why in boolean

        boolean m = true;
        boolean n = false;
        System.out.println(n);
        //boolean gives either true or false , 0 or 1, yes or no


    }
}

