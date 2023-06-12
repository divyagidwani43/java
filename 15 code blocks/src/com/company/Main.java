package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         boolean gameOver=true;
         int score=400;
         int highScore=499;
         if(score==400 && score<499)
             System.out.println("you score is 400");//will be printed only if score =400
        System.out.println("no high score set");//will be printed at any score as it wont fall under if statement
        //if it were in code block it both statement would depend on if statement

        if (score>=500) {
            System.out.println("you have new high score");//will be printed for = or > 500
            System.out.println("last high score was 500");//will be printed for = or > 500
        }

        //also be used for spacing , whenever a code block is added line moves 4spaces to right. example=
        {
            {
                {
                    {
                        System.out.println("also called indenting");
                    }
                }
            }
        }


        boolean GameOver=true;
        int YourScore =400;
        int levelCompleted = 4;
        int bonus=100;

        if (GameOver==true){
            int finalScore= YourScore+(levelCompleted*bonus);
            System.out.println("your score is "+finalScore);
        }
        // finalScore can't be used outside code block it only exists in code block
        //int LastScore=finalScore will give error

        //variable created in code block can only be used in code block



        }
}
