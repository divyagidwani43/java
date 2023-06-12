package com.company;

public class Main {

    public static void main(String[] args) {
                                               //IF STATEMENT
        //if (condition){
        //   if statement (block)
        //}

        //is basic of all control flow statement
        //tells your program to execute only a certain section of your program only if a particular test evaluates true
        //called conditional logic
        //allows us to check a condition and execute based on whether its true or false

        //identifies which code block to run based on value of an expression


        boolean isAlien = false;
        if (isAlien == false) // not putting semicolon means no statement ends here i.e statement is 2 line
            System.out.println("its not an alien"); // will be printed as the boolean value is false and expression is true
        if (isAlien ==true)//use == not =
            System.out.println("its an alien");//will be ignored as boolean value isn't true



        //boolean isAlienn = false;
        //if (isAlienn == false); // not putting semicolon means no statement ends here i.e statement is 2 line
            //System.out.println("its not an alien"); // will be printed as the boolean value is false and expression is true
        //if (isAlienn == true); // put == not =
            //System.out.println("its an alien");
        //putting semicolon will end the statement there and statements after will be seen as seperate statements
        //whats printed wont depend on what if statement says



        boolean isAlieen = false;
        if (isAlieen == true)
            System.out.println("its not an alien");
            System.out.println("and i am scared of aliens");
            //only one line will depend on if statement for both to depend we use code block



        boolean isAlienn = false;
        if (isAlienn == false) {
            System.out.println("hey");
            System.out.println("i am programmer");
        }



        boolean b=false;
        if(!b) //! can be used for b or any variable = false , ! is not operator
            System.out.println("yay");
        //!b is to avoid making mistake by putting equal to operator in boolean data type
        if (b) //can be used for b==true
            System.out.println("nah");

        //to check values or match them under conditional statement the requires equal to(==)
        //as inside parenthesis its souts data value that not accepted by if statement
        // so equals to operator souts true or false on basis of if the value is same or not
        //here equals to (==) operator is required.



        int top_score =100;
        if(top_score == 100)
            System.out.println("you have top score");
        if(top_score != 100)//!= means not equal to
            System.out.println("you don't have top score");
        if(top_score>=55 & top_score<100) //& is bitwise operator will be discussed here it just makes sure both conditions are true
            System.out.println("but you passed");
        if( (top_score<55) &  (top_score<100) ) //adding parenthesis wont change anything but might make code easier to read
            System.out.println("you failed");
        //we can use < , > , <= , >= as well



        //int x=4;
        //if(x=4)
            //System.out.println(x); will give error cause of = sign not ==

        //BUT

        boolean x =false;
        if (x = true)
            System.out.println("false");
        //wont give error but wrong value i.e above must not print anything as value don't match but it will cause of = sign not ==



                                                            //IF ELSE
        //else can be used when if statement is false then else block will be executed
        //else if to test multiple condition
        //        if(condition){
        //            if statement
        //        }
        //        else {
        //            else statement
        //        }


        int f =5;
        if (f==5)
            System.out.println("you have 5");
        else
            System.out.println("you don't have 5");


        int highScore = 4000;
        int lastScore=3050;
        int score =4300;
        if (score>=3050 && score<4000)
            System.out.println("you passed your last score");
        else if (score>=4000) //else with new if line
            System.out.println("we have a new high score");
        else
            System.out.println("well done");


        boolean gameOver=true;
        int YourScore =7000;
        int levelCompleted = 8;
        int bonus=100;
        if (gameOver==true){
            int finalScore= YourScore+(levelCompleted*bonus);
            System.out.println("your score is "+finalScore);
        }


        YourScore=10000;
        levelCompleted=8;
        bonus=200;
        if (gameOver==true){
            int finalScore=YourScore+(levelCompleted*bonus)+100;
            System.out.println("your new score is "+finalScore);
        }
        //duplicating code is not preferred as it may cause errors in the long run
        
        int playerScore=477;
        if (playerScore>=1000)
            System.out.println(4);
        else if (playerScore>=500) //instead of (playerScore>=500 && playerScore<1000)
//the code will only check this line if the above condition is false i.e playerScore<1000 always so this can be removed from if statement as it won't make a difference
            System.out.println(4);
        else if (playerScore>=100 ) //instead of (playerScore>=100 && playerScore<500)
            System.out.println(5);
        else
        System.out.println(5);
    }
}
