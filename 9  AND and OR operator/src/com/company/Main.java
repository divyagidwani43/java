package com.company;

public class Main {

    public static void main(String[] args) {
        //&& is and logical operator that requires both conditions to be true to work
        // || is or logical operator that requires at least one condition to be true
        // logical ones operates on boolean operands i.e check if true or false

        // | and & are bitwise (and) and (or) operators

        int top_value=99;
        if (top_value<99 && top_value>35)
            System.out.println("pass");

        if (top_value==99 || top_value==100)
            System.out.println("you achieved top score");



    }
}
