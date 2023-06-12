package com.company;

public class Main {

    public static void main(String[] args) {
        //math.round is an well built method in java which returns the closest long argument
        //basically rounds up the number to nearest integer

        System.out.println(Math.round(4.4087058));

        System.out.println(toMilesPerHour(55));

    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0)
            return -1;
        else{
            long milesPerHOur= Math.round(kilometersPerHour/1.60900);
            return milesPerHOur;}
    }
}



