package com.company;

public class Main {

    public static void main(String[] args) {
        //statements are (int myVar = 4;) the whole line
        //statement end with ;
        //may be of one line or multiple line
        // or have multiple statements in one line as long as each ends with ; before another begins
        //we can even out spacing by code --> reformat code


        System.out.println("this is statement");

        System.out.println("hi " +
                "this " +
                "is " +
                "another " +
                "statement ");

        int myVar = 5;char myChar = 'i';System.out.println(myVar + " and " + myChar);//multiple statement in one line

        //WHITESPACE
        //spacing between the keyword and variable name or equal to sign is called whitespace
        //its ignored in java but requires min 1 space between keyword and variable name
        //it can be as much as you want
        //intvar is error but
        int var=10; // is not as 1 space min after keyword or data type
        int                     var1             =      10  ;      //is also accepted

        //INDENTATION
        //its basically good aligning of the code
        //when ever we use curly brace the code automatically shifts 4 spaces making it more clear
        {
            //like here
            {
                //again it did
                {
                    System.out.println("this is indenting");
                }
            }
        }



    }
}
