package com.company;

public class Main {

    public static void main(String[] args) {
        //== is equals to operator
        {
            //data type other than boolean requires equal to(==)
            //used to check if values match or not
            //used for conditional statements
            //as inside parenthesis its returns values that not accepted by if statement
            //so equals to operator returns true or false on basis of if the value is same or not

        }
        // = is assignment operator



        int a=5;
        if(a==5)
            System.out.println("yay");
        //here equals to is requires

        boolean b = false;
        if(b==false)
            System.out.println("its false");
        if (b==true)
            System.out.println("it's true");
        //using boolean value we can use assignment operator



        int ageOfClient=20;
        boolean isEighteenOrOver =ageOfClient ==20 ? true:false;
        if (isEighteenOrOver)
            System.out.println("eligible");


    }
}
