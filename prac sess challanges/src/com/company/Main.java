package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(        getDurationString(90,20));    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes<0 || seconds<0 || seconds>59){
            return  "invalid value";
        }
        int hours= minutes/60;
        long remainingMinutes = minutes % 60;
        return hours+" hr "+ remainingMinutes+" min "+seconds+"sec";
    }
}
