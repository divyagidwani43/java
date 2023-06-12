package com.company;
public class Main {

    public static void main(String[] args) {
        //string is a sequence of characters
        //its limited by memory space or the max value of int
        //cap S and must inside ""
        //unicode are allowed
        //a number inside "" will be treated as string
        //not a primitive type but a class
        // is IMMUTABLE i.e cant be changed once created
        //we cant change string once created but add into it creating a new string when we add something into the string
        // java creates  brand new string for it



        String a="hello there its java program";
        System.out.println(a); //one way

        System.out.println("hello there its java here another way to do"); //another way

        a = a + "and its being continued here";
        System.out.println(a);

        //unicode characters are allowed
        String d = "\u00FA";
        System.out.println("unicode char are allowed like "+d);

        //a number inside "" will be treated as string
        String e ="5.67";
        e = e+"45.66"; //wont add
        System.out.println(e); // will give 5.6745.66

        //on adding int value ,a string will be joined with that number , the string may itself be a number
        int f= 9;
        String g = "6";
        System.out.println(a+f); //string and number
        System.out.println(g+f); // number string and number
        double h =4.56d;
        System.out.println(g+h); // wont add still as g is string
        System.out.println(f+h); //will add as f and h are numbers

        int c = 9;
        String b = String.valueOf(c);
        System.out.println(b);
    }
}

