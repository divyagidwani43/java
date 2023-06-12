package com.company;

public class Main {

    public static void main(String[] args) {

        //operators are used to perform operations on operands
        //2+3
        //+ is operator
        //2 and 3 are operands
        //EXPRESSION is formed by combining variables , literals, operators, method return value
        //+ , - , / , % are all operators

        int hoursWorked =4;
        int hourlyWage = 100;
        double mySalary = hoursWorked * hourlyWage;
        //* and = are operator , hoursWorked and hourlyWage are operands , hoursWorked * hourlyWage is expression

        int a = 1+3;
        System.out.println("a is "+a);
        int b= a;
        System.out.println("a equals b is "+b);

        a = b-1;
        System.out.println("a equals b-1 is "+a);

        a= a*10;
        System.out.println("a equals a*10 is "+a);

        a= a/5;
        System.out.println("a equals a/5 is "+a);

        //modulus or remainder operator , it retains the remainder of 2 operands
        a = 4 % 3; // 4/3 will give 1 as remainder
        System.out.println("a equals 4%3 is "+a);

        a=12%5;
        System.out.println("a equals 12%5 is "+a); // another example


        //++ operator
        int c = 2; //will give error if c not initialised i.e value not mentioned
        c++; //will add one
        System.out.println("c++ when c is 2 = "+c);
        System.out.println("c++ when c is 2 = "+c); //will give 2 only until c++ added in code to add another 1
        c++;
        System.out.println("c++ when c is 2 and c++ is added again = "+c); //will give 3

        //-- operator
        int d =4;
        d--;
        System.out.println("d-- when d is 4 = "+d);
        d--;
        System.out.println("d-- when d is 4 and d-- added again = "+d );


        // int e += x
        // x being a number will add x to whatever number the variable e holds
        //+ can be *, /, % , -
        int e= 5;
        e += 2;
        System.out.println(e); // will give 7
        e*= 2; //e has last value of 7
        System.out.println(e);
        e -= 2; // e is 14
        System.out.println(e);
        e /= 2; //e is 12
        System.out.println(e);
        e %=5; //e is 6
        System.out.println(e);


    }
}
