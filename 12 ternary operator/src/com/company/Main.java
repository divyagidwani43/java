package com.company;

public class Main {

    public static void main(String[] args) {
        //its basically a shortcut for if then else statement




        boolean a = false; //a's value needed
        boolean b = a ? true : false ;
        System.out.println(b);
        if (b)
            System.out.println("yay");
        if (b==false) //for false
            System.out.println("nay");
        //will print both yay if true , nay if false


        int ageOfClient=20;
        boolean isEighteenOrOver =(ageOfClient ==20) ? true:false; //parenthesis for better reading
        if (isEighteenOrOver)
            System.out.println("eligible");


        double e = 20;
        double f = 80;
        double c = (e+f)*100;
        double d = c%40;

        boolean remainder = (d==0) ? true:false;
        System.out.println(remainder);//will print true or false i.r remainder's boolean value
        if (!remainder)
            System.out.println("got some remainder");



    }
}
