package com.company;

public class Main {
    //when we overload a method we need to crete a unique method signature
    //signature is the actual method name that we can see here is same but the parameters are not
    //same method name with diff data type will still give error
    //same method name with diff parameters will work fine

    //Method overloading is a feature that allows us to have more than one method with the same name as long as they have different parameters


    public static void main(String[] args) {
        calculateScore("tim",30);
        calculateScore(98);

        System.out.println(calculateScore());

        int a= calculateScore("jim",60);
        System.out.println(a); //even if we equate the method to variable it will still run and print statement it has

        System.out.println(calculateScore(80));



        calcFeetAndInchesToCentimeters(1,1);
        calcFeetAndInchesToCentimeters(6);

    }

    public static int calculateScore(String playerName, int playerScore) {
        System.out.println(playerName+" scored "+playerScore+" points");
        return playerScore*10;
    }

    public static int calculateScore(int playerScore){
        //by adding only one parameter we can remove the error that came cause of same method name
        //it'll give this method another identity
        System.out.println("he scored "+playerScore);
        return playerScore*100;
    }

    public static int calculateScore() {
        return 0;
    }




    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet>=0 && inches>=0 && inches<=12){
            double centimeters =0.0328084*feet;
            centimeters +=0.393701*inches;//+= means now centimeters = (0.0328084*feet) + (0.393701*inches)
            System.out.println(feet+" feet "+" + "+inches+" inches "+" = "+ centimeters+" centimeters ");
            return centimeters;
        }
        else
            return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches<0){
            return -1;
        }
        double feet=  inches/12;
        double remainingInches =  inches % 12;
        System.out.println("feet = "+feet+"and the remainder is "+remainingInches);
        return calcFeetAndInchesToCentimeters(feet,inches);
    }

}
