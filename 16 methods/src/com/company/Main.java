package com.company;

public class Main {

    // methods are defined by public static void as first keywords they are defied under public class main
    //void doesn't send anything back i.e has no return value
    // methods need to be called inside public static void main (String[] args) code block ONlY to be printed in output
    //if variables are defined in these() then the value van be inserted in main method in () when we call the method
    //if variable are defined outside the values need to be initialised and values can't change afterwards
    //this method can be used instead of duplication to avoid errors

    //expressions inside parenthesis are called parameters

    //RETURN INFO
    //void doesn't return any info
    //to return info we need to put the data type of info that has to be returned instead of void
    //when you return a method you need ti make sure it sends some value back
    //that's why return value can't be under if control statement
    //when equated to a int variable it will give the return value
    //int h = cal() and say cal() returns 5 so h will be 5
    //even if we equate the method to variable it will still run and print statement it has


    public static void main(String[] args) {   //main function
        //is code block for main(String[] args) method
        //we can call the method defined below in this code by typing its name

        cal(4, 4, 4);
        cal(5, 6, 7); //now we don t have to write the whole code again


        int a = 8;
        int b = 10;
        int c = 7;
        cal(a, b, c); //you can use defined variables as values but they must be defined in main function


        oppa();


        practice();


        withIntReturnValue(5, 5, 5);
        sup(9, 8);
        cup(0, 8);


        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("rick", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("noah", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("beatrice", highScorePosition);

        System.out.println(getDurationString(87, 44));

//        highScorePosition=anotherWayCalculateHighScorePosition(800);
//        displayHighScorePosition("kash",highScorePosition);

    }


    public static void cal(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    //can be called by cal()
    //values od a b c have to put in() when they called under public static void main


    public static void oppa() {
        int d = 3;
        int e = 3;
        System.out.println(d + e);
    }//here values are already initialised so we just have to call the method


    public static void practice() {
        System.out.println("hi");
        cal(3, 4, 3);
        oppa();
        //we use this instead of writing
        //int d=5;
        //int e=4;
        //System.out.println(d + e);
        //but it won't give output here
        //for output we need to call it under public static void main
    }


    public static int withIntReturnValue(int x, int y, int z) {
        System.out.println(x * y * z);
        return x * y * z;
    }


    //public static int sup(int h, int j) {
    //    if (h==6){
    //        int k=j+h;
    //        System.out.println(k);
    //        return k;
    //    }
    //will give error as k will only be returned when h==6 i.r if value true but int need to return value even if
    // if statement is false
    //to resolve we can add else statement or add return value in end before public static int close bracket
    public static int sup(int h, int j) {
        if (h == 6) {
            int k = j + h;
            System.out.println(k);
            return 6;
        } else {
            System.out.println("bye");
            return -1;
        }
    }


    public static int cup(int l, int u) {
        if (l == 0) {
            System.out.println("hi");
            return l;
        }
        return -1;//will print nothing if l not equal to 0
        //will resolve error or return value when if not true
        //-1 indicates no value returned
    }


    public static void displayHighScorePosition(String playerName, int positionOnHighScoreTable) {
        System.out.println(playerName + " managed to get into the position " + positionOnHighScoreTable + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000)
            return 1;
        else if (playerScore >= 500 && playerScore < 1000)
            return 2;
        else if (playerScore >= 100 && playerScore < 500)
            return 3;
        else
            return 4;
    }//will print return values
    //return value and public static data_type must be of same data type


//    public static int anotherWayCalculateHighScorePosition(int playerScore) {
//        int position = 4;
//        if (playerScore >= 1000)
//            position=1;
//        else if (playerScore >= 500 && playerScore < 1000)
//            position =2;
//        else if (playerScore >= 100 && playerScore < 500)
//            position =3;
//        return position;
//    }


    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "invalid value";
        }
        int hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + " hr " + remainingMinutes + " min " + seconds + "sec";
    }
    //string can also be used as return value
}