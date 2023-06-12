package com.company;

public class Main {

    public static void main(String[] args) {


        // 2 slashes indicate comment

        System.out.println("hi" + 2);
        // is the way to print anything ,
        // short form is sout

        //+ sign joins lines with different data types in sout

        //!= means not equal to

//PRIMITIVE DATA TYPES
        // primitive data types are of 8 types
//every data type takes different amount of space

// int , max=2147483647, min=-2147483648
//to get max and min possible value use integer.MIN_VALUE and integer.MAX_VALUE
// overflow and underflow in int
//32bits

// byte
//8bits , -128 to 127

// short
//32767 to -32768, 16 bits

// long
//9223372036854775807 to -9223372036854775808, 64 bits
//if we don't end Long with L java will take number as int and give error

//assignment

//casting
//default whole no used by java is int so no in () is seen as int while its not so it gives error
//but we know the result fits in data type we entered
//we put the type we want the no to be in () before the (no)

// float
//store decimal numbers
//single precision number i.e 32 bits. precision is format and amount of space
//not putting f or (float) before will give error as its seen as double as default in java

// double
//you can also put d in  end to reassure its double value but no compulsion

// char
//char can be used to save one letter value in '' like 'a'
//occupies 16 bits (2 bytes) of memory
//allows storing unicode characters

// boolean
        //public class Main {

        //public static void main(String[] args) {
//INT
        int a = 10000;
        System.out.println("my value for x is " + a);             //will print my value of x is 10000

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("min int value is " + myMinIntValue);       //will give possible min value for int
        System.out.println("max int value is " + myMaxIntValue);       //will give possible max value for int

        int b = 2147483647;
        System.out.println(b);                                 //c=2147483648 will give error

        System.out.println("if we add 1 to max value " + (myMaxIntValue + 1)); //we get min value
        //jumps to min value if max added more called overflow
        System.out.println("if we deduct 1 from min value " + (myMinIntValue - 1)); //we get max value ,
        // jumps to max value if min reduced with more called underflow
        // this is overflow and underflow in java

        int c = 21_567_576; //underscore for easy reading wont show in output
        System.out.println(c);
        //int occupies 32 bits


//BYTE
        Byte myMinByteValue = Byte.MIN_VALUE;
        Byte myMaxByteValue = Byte.MAX_VALUE;
        //byte has b caps
        System.out.println("max byte value is " + (myMaxByteValue) + " and " + "min min value is " + (myMinByteValue));

        //we use byte cause it has smaller range compared to int
        //smaller data type takes up less space so you save memory by using byte if your input is in that range
        //can be quicker to access
        //byte occupies 8 bits


//SHORT
        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("max Short value is " + (myMaxShortValue) + " and " + "min min value is " + (myMinShortValue));
        //short occupies 16 bits


//LONG
        // 63 bits
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("max Long value is " + (myMaxLongValue) + " and " + "min min value is " + (myMinLongValue));


        Long d = 9223372036854775807L;
        System.out.println(d);
        //if we don't end Long with L java will take number as int and give error


//PRIMITIVE DATA TYPES ASSIGNMENT
        Byte B = 100;
        Short S = 20000;
        int I = 500000000;
        long Total = (50000L + 100L * (B + S + I)); //not putting L will give overflow and underflow
        //remember the places you put
        System.out.println(Total);


//CASTING
        int e = (myMaxIntValue / 2); //no error
        // Byte f = (myMinByteValue/2); will give error as () in parentheses value is detected as int value
        //to remove error type the data type in() before
        byte f = (byte) (myMaxByteValue / 2); //small b in()
        Short g = (short) (myMinShortValue / 2); //small s in()
        long i = (long) (myMinLongValue / 2);
        System.out.println("int " + e + " byte " + f + " short " + g + " long " + i);
        //default data type used by java is int so data type in () is seen as int while its not so it gives error
        //but we know the result fits in data type we entered
        //we put the type we want the no to be in () before the (no)
        //byte j = (byte) (myMinIntValue/2);
        //System.out.println(j);
        //will give 0 for min 1 for max


//FLOAT
        //store decimal numbers
        //single precision number i.e 32 bits. precision is format and amount of space
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("min value for float is " + myMinFloatValue + " max value for float is " + myMaxFloatValue);

        float myFloatValue = 63245.32967f; //not putting f or (float) before will give error as its seen as double as default in java
        System.out.println(myFloatValue);

        // can hold int values as well


//DOUBLE
        //double precision i.e 64 bits
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("min value for double " + myMinDoubleValue + " max value for double " + myMaxDoubleValue);

        double myDoubleValue = 4657.468376;
        System.out.println(myDoubleValue);
        //you can also put d in  end to reassure its double value but no compulsion
        // can hold int values as well


//INT FLOAT DOUBLE
        int myIntValue1 = 5 / 3;
        float myFloatValue1 = 5f / 3;
        double myDoubleValue1 = 5.00 / 3.00;
        System.out.println("int value " + myIntValue1 + " float value " + myFloatValue1 + " double value " + myDoubleValue1);
        //when = 5 will give 5, 5.0, 5.0 as the other 2 give decimal point
        //=5/2 will give 2, 2.5, 2.5
        //=5/3 will give int value 1 float value 1.6666666 double value 1.6666666666666667
        //removing .00 from double will make java treat it as int or add d in end or add (double)


//float and double arent recommended for precise calculation like currency calculations but we can use em for general calculations
//for them we have BigDecimal class in java


//converting pounds to kg
        double pounds = 3;
        double kgs = 0.45359237 * pounds;
        System.out.println(pounds + " pounds is equal to " + kgs + " kilograms");


//CHAR
        char x = 'k';
        System.out.println(x);
        //char can be used to save one letter value in '' like 'a'
        //occupies 16 bits (2 bytes) of memory
        //allows storing unicode characters
        char l = '\u00EF'; // slash u must be written before every unicode
        System.out.println(l);
        //refer to unicode table in another folder


//BOOLEAN
        int j = 4;
        int k = 5;
        System.out.println(j < k); //will give true
        //gives either true or false
        //idk why in boolean

        boolean m = true;
        boolean n = false;
        System.out.println(n);
        //boolean gives either true or false , 0 or 1, yes or no


        //string is a sequence of characters
        //its limited by memory space or the max value of int
        //cap S and must inside ""
        //unicode are allowed
        //a number inside "" will be treated as string
        //not a primitive type but a class
        // is IMMUTABLE i.e cant be changed once created
        //we cant change string once created but add into it creating a new string when we add something into the string
        // java creates  brand new string for it


        String af = "hello there its java program";
        System.out.println(af); //one way

        System.out.println("hello there its java here another way to do"); //another way

        af = af + "and its being continued here";
        System.out.println(af);

        //unicode characters are allowed
        String df = "\u00FA";
        System.out.println("unicode char are allowed like " + df);

        //a number inside "" will be treated as string
        String ef = "5.67";
        ef = ef + "45.66"; //wont add
        System.out.println(ef); // will give 5.6745.66

        //on adding int value ,a string will be joined with that number , the string may itself be a number
        int ff = 9;
        String gf = "6";
        System.out.println(af + ff); //string and number
        System.out.println(gf + ff); // number string and number
        double hf = 4.56d;
        System.out.println(gf + hf); // wont add still as g is string
        System.out.println(ff + hf); //will add as f and h are numbers

        int cf = 9;
        String bf = String.valueOf(cf);
        System.out.println(bf);


        //operators are used to perform operations on operands
        //2+3
        //+ is operator
        //2 and 3 are operands
        //EXPRESSION is formed by combining variables , literals, operators, method return value
        //+ , - , / , % are all operators

        int hoursWorked = 4;
        int hourlyWage = 100;
        double mySalary = hoursWorked * hourlyWage;
        //* and = are operator , hoursWorked and hourlyWage are operands , hoursWorked * hourlyWage is expression

        int ad = 1 + 3;
        System.out.println("a is " + ad);
        int bd = ad;
        System.out.println("a equals b is " + bd);

        ad = bd - 1;
        System.out.println("a equals b-1 is " + ad);

        ad = ad * 10;
        System.out.println("a equals a*10 is " + ad);

        ad = ad / 5;
        System.out.println("a equals a/5 is " + ad);

        //modulus or remainder operator , it retains the remainder of 2 operands
        ad = 4 % 3; // 4/3 will give 1 as remainder
        System.out.println("a equals 4%3 is " + ad);

        ad = 12 % 5;
        System.out.println("a equals 12%5 is " + ad); // another example


        //++ operator
        int cd = 2; //will give error if c not initialised i.e value not mentioned
        cd++; //will add one
        System.out.println("c++ when c is 2 = " + cd);
        System.out.println("c++ when c is 2 = " + cd); //will give 2 only until c++ added in code to add another 1
        cd++;
        System.out.println("c++ when c is 2 and c++ is added again = " + cd); //will give 3

        //-- operator
        int dd = 4;
        dd--;
        System.out.println("d-- when d is 4 = " + dd);
        dd--;
        System.out.println("d-- when d is 4 and d-- added again = " + dd);


        // int e += x
        // x being a number will add x to whatever number the variable e holds
        //+ can be *, /, % , -
        int ed = 5;
        ed += 2;
        System.out.println(ed); // will give 7
        ed *= 2; //e has last value of 7
        System.out.println(ed);
        ed -= 2; // e is 14
        System.out.println(ed);
        ed /= 2; //e is 12
        System.out.println(ed);
        ed %= 5; //e is 6
        System.out.println(ed);


        //if statement is basic of all control flow statement
        //tells your program to execute only a certain section of your program only if a particular test evaluates true
        //called conditional logic
        //allows us to check a condition and execute based on whether its true or false


        boolean isAlien = false;
        if (isAlien == false) // not putting semicolon means no statement ends here i.e statement is 2 line
            System.out.println("its not an alien"); // will be printed as the boolean value is false and expression is true
        if (isAlien == true)//use == not =
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


        boolean be = false;
        if (!be) //! can be used for b or any variable = false , ! is not operator
            System.out.println("yay");
        //!b is to avoid making mistake by putting equal to operator in boolean data type

        //to check values or match them under conditional statement the requires equal to(==)
        //as inside parenthesis its returns data value that not accepted by if statement
        // so equals to operator returns true or false on basis of if the value is same or not
        //here equals to (==) operator is required.


        int top_score = 100;
        if (top_score == 100)
            System.out.println("you have top score");
        if (top_score != 100)//!= means not equal to
            System.out.println("you don't have top score");
        if (top_score >= 55 & top_score < 100) //& is bitwise operator will be discussed here it just makes sure both conditions are true
            System.out.println("but you passed");
        if ((top_score < 55) & (top_score < 100)) //adding parenthesis wont change anything but might make code easier to read
            System.out.println("you failed");
        //we can use < , > , <= , >= as well


        //int x=4;
        //if(x=4)
        //System.out.println(x); will give error cause of = sign not ==

        //BUT

        boolean xe = false;
        if (xe = true)
            System.out.println("false");
        //wont give error but wrong value i.e above must not print anything as value don't match but it will cause of = sign not ==


        //&& is and logical operator that requires both conditions to be true to work
        // || is or logical operator that requires at least one condition to be true
        // logical ones operates on boolean operands i.e check if true or false

        // | and & are bitwise (and) and (or) operators

        int top_value = 99;
        if (top_value < 99 && top_value > 35)
            System.out.println("pass");

        if (top_value == 99 || top_value == 100)
            System.out.println("you achieved top score");


        //== is equals to operator
        {
            //data type other than boolean requires equal to(==)
            //used to check if values match or not
            //used for conditional statements
            //as inside parenthesis its returns values that not accepted by if statement
            //so equals to operator returns true or false on basis of if the value is same or not

        }
        // = is assignment operator


        int ay = 5;
        if (ay == 5)
            System.out.println("yay");
        //here equals to is requires

        boolean by = false;
        if (by == false)
            System.out.println("its false");
        if (by == true)
            System.out.println("it's true");
        //using boolean value we can use assignment operator


        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
        if (isEighteenOrOver)
            System.out.println("eligible");


        // ! is not operator
        //!= is not equal to
        //(!c) is (c=false)


        //its basically a shortcut for if then else statement


        boolean au = false; //a's value needed
        boolean bu = au ? true : false;
        System.out.println(bu);
        if (bu)
            System.out.println("yay");
        if (bu == false) //for false
            System.out.println("nay");
        //will print both yay if true , nay if false


        int aageOfClient = 20;
        boolean isEighteennOrOver = (aageOfClient == 20) ? true : false; //parenthesis for better reading
        if (isEighteennOrOver)
            System.out.println("eligible");


        double ue = 20;
        double uf = 80;
        double uc = (ue + uf) * 100;
        double ud = uc % 40;

        boolean remainder = (ud == 0) ? true : false;
        System.out.println(remainder);//will print true or false i.r remainder's boolean value
        if (!remainder)
            System.out.println("got some remainder");


        //       Parentheses                                ()
        //       Array subscript                            []
        //       Member selection                            .
        //       Unary post-increment                       ++
        //       Unary post-decrement                       --
        //       Unary pre-increment                        ++
        //       Unary pre-decrement                        --
        //       Unary plus                                 +
        //       Unary minus                                -
        //       Unary logical negation                     !
        //       Unary bitwise complement                   ~
        //       Unary type cast                            (type)
        //       Multiplication                             *
        //       Division                                   /
        //       Modulus                                    %
        //       Addition                                   +
        //       Subtraction                                -
        //       Bitwise left shift                         <<
        //       Bitwise right shift with sign extension    >>
        //       Bitwise right shift with zero extension    >>>
        //       Relational less than                       <
        //       Relational less than or equal              <=
        //       Relational greater than                    >
        //       Relational greater than or equal           >=
        //       Type comparison (objects only)             Instanceof
        //       Relational is equal to                     ==
        //       Relational is not equal to                 !=
        //       Bitwise AND                                &
        //       Bitwise exclusive OR                       ^
        //       Bitwise inclusive OR                       |
        //       Logical AND                                &&
        //       Logical OR                                 ||
        //       Ternary conditional                        ?
        //       Assignment                                 =
        //       Addition assignment                        +=
        //       Subtraction assignment                     -=
        //       Multiplication assignment                  *=
        //       Division assignment                        /=
        //       Modulus assignment                         %=


        double qa = 20;
        double qb = 80;
        double qc = (qa + qb) * 100;
        System.out.println(qc);
        double qd = qa + qb * 100;
        System.out.println(qd);
        //both c and d value are different


        //KEYWORDS


        //LIST OF KEYWORDS
        //can't be used to name variables
        //are reserved word with defined meanings

        //  1.	abstract	 Specifies that a class or method will be implemented later, in a subclass
        //  2.	assert	     Assert describes a predicate placed in a java program to indicate that the developer thinks that the predicate is always true at that place.
        //  3. 	boolean	     A data type that can hold True and False values only
        //  4.	break	     A control statement for breaking out of loops.
        //  5.	byte	     A data type that can hold 8-bit data values
        //  6. 	case	     Used in switch statements to mark blocks of text
        //  7.	catch	     Catches exceptions generated by try statements
        //  8.	char 	     A data type that can hold unsigned 16-bit Unicode characters
        //  9.	class	     Declares a new class
        //  10.	continue	 Sends control back outside a loop
        //  11.	default	     Specifies the default block of code in a switch statement
        //  12.	do	         Starts a do-while loop
        //  13.	double	     A data type that can hold 64-bit floating-point numbers
        //  14.	else	     Indicates alternative branches in an if statement
        //  15.	enum	     A Java keyword is used to declare an enumerated type. Enumerations extend the base class.
        //  16.	extends	     Indicates that a class is derived from another class or interface
        //  17.	final	     Indicates that a variable holds a constant value or that a method will not be overridden
        //  18.	finally	     Indicates a block of code in a try-catch structure that will always be executed
        //  19.	float	     A data type that holds a 32-bit floating-point number
        //  20.	for	         Used to start a for loop
        //  21.	if	         Tests a true/false expression and branches accordingly
        //  22.	implements	 Specifies that a class implements an interface
        //  23.	import 	     References other classes
        //  24.	instanceof	 Indicates whether an object is an instance of a specific class or implements an interface
        //  25.	int	         A data type that can hold a 32-bit signed integer
        //  26.	interface	 Declares an interface
        //  27.	long	     A data type that holds a 64-bit integer
        //  28.	native	     Specifies that a method is implemented with native (platform-specific) code
        //  29.	new	         Creates new objects
        //  30.	null	     This indicates that a reference does not refer to anything
        //  31.	package	     Declares a Java package
        //  32.	private	     An access specifier indicating that a method or variable may be accessed only in the class it’s declared in
        //  33.	protected	 An access specifier indicating that a method or variable may only be accessed in the class it’s declared in (or a subclass of the class it’s declared in or other classes in the same package)
        //  34.	public	     An access specifier used for classes, interfaces, methods, and variables indicating that an item is accessible throughout the application (or where the class that defines it is accessible)
        //  35.	return	     Sends control and possibly a return value back from a called method
        //  36.	short	     A data type that can hold a 16-bit integer
        //  37	static	     Indicates that a variable or method is a class method (rather than being limited to one particular object)
        //  38.	strictfp	 A Java keyword is used to restrict the precision and rounding of floating-point calculations to ensure portability.
        //  39.	super	     Refers to a class’s base class (used in a method or class constructor)
        //  40.	switch	     A statement that executes code based on a test value
        //  41.	synchronized Specifies critical sections or methods in multithreaded code
        //  42.	this	     Refers to the current object in a method or constructor
        //  43.	throw 	     Creates an exception
        //  44.	throws	     Indicates what exceptions may be thrown by a method
        //  45.	transient	 Specifies that a variable is not part of an object’s persistent state
        //  46.	try	         Starts a block of code that will be tested for exceptions
        //  47.	void	     Specifies that a method does not have a return value
        //  48.	volatile	 This indicates that a variable may change asynchronously
        //  49.	while	     Starts a while loop

        //another words that can't be used as variable names are
        // true
        // false

        //int char =4; will give error as char is a keyword and can be variable name
        int char2 =4 ; // can be used as char is keyword char2 is not


        //EXPRESSIONS

        //expressions are made of variables , values , operators or method calls (discuss later) which you have seen previously
        // lines in brackets are expressions do not include the brackets
        //expressions don't include data type, control statement etc.
        // If we also include data type, control statements etc it becomes a statement

        double kilometers = (100*1.4);
        //kilometers = (100*1.4) is expression
        //double kilometers = (100*1.4); is statement

        int high_score =400; //high_score =400 is expression
        if(high_score==400)
            System.out.println("this is high");
        high_score=5; // whole line except the semicolon is expression
        //lines in brackets are expression i.e "this is high" , high_score==400




        //STATEMENTS
        //statements are (int myVar = 4;) the whole line
        //statement end with ;
        //may be of one line or multiple line
        // or have multiple statements in one line as long as each ends with ; before another begins
        //we can even out spacing by code --> reformat code


        System.out.println("this is statement");

        System.out.println("hi " +
                "this " +
                "is " +
                "another " +
                "statement ");

        int myVar = 5;char myChar = 'i';System.out.println(myVar + " and " + myChar);//multiple statement in one line

        //WHITESPACE
        //spacing between the keyword and variable name or equal to sign is called whitespace
        //its ignored in java but requires min 1 space between keyword and variable name
        //it can be as much as you want
        //intvar is error but
        int var=10; // is not as 1 space min after keyword or data type
        int                     var1             =      10  ;      //is also accepted

        //INDENTATION
        //its basically good aligning of the code
        //when ever we use curly brace the code automatically shifts 4 spaces making it more clear
        {
            //like here
            {
                //again it did
                {
                    System.out.println("this is indenting");
                }
            }
        }




                                                               //CODE BLOCKS

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





                                                                //METHODS

//
//
//        // methods are defined by public static void as first keywords they are defied under public class main
//        //void doesn't send anything back i.e has no return value
//        // methods need to be called inside public static void main (String[] args) code block ONlY to be printed in output
//        //if variables are defined in these() then the value van be inserted in main method in () when we call the method
//        //if variable are defined outside the values need to be initialised and values can't change afterwards
//        //this method can be used instead of duplication to avoid errors
//
//        //expressions inside parenthesis are called parameters
//
//        //RETURN INFO
//        //void doesn't return any info
//        //to return info we need to put the data type of info that has to be returned instead of void
//        //when you return a method you need ti make sure it sends some value back
//        //that's why return value can't be under if control statement
//
//
//        public static void main(String[] args) {   //main function
//            //is code block for main(String[] args) method
//            //we can call the method defined below in this code by typing its name
//
//            cal(4, 4, 4);
//            cal(5,6,7); //now we don t have to write the whole code again
//
//
//            int a=8;
//            int b=10;
//            int c=7;
//            cal(a,b,c); //you can use defined variables as values but they must be defined in main function
//
//
//            oppa();
//
//
//            practice();
//
//
//            withIntReturnValue(5,5,5);
//            sup(9,8);
//            cup(0,8);
//
//
//
//            int highScorePosition= calculateHighScorePosition(1000);
//            displayHighScorePosition("tim",highScorePosition);
//
//            highScorePosition= calculateHighScorePosition(900);
//            displayHighScorePosition("rick",highScorePosition);
//
//            highScorePosition= calculateHighScorePosition(400);
//            displayHighScorePosition("noah",highScorePosition);
//
//            highScorePosition= calculateHighScorePosition(50);
//            displayHighScorePosition("beatrice",highScorePosition);
//
//
////        highScorePosition=anotherWayCalculateHighScorePosition(800);
////        displayHighScorePosition("kash",highScorePosition);
//
//        }
//
//
//
//        public static void cal(int a, int b, int c) {
//            System.out.println(a + b + c);
//        }
//        //can be called by cal()
//        //values od a b c have to put in() when they called under public static void main
//
//
//        public static void oppa() {
//            int d=3;
//            int e=3;
//            System.out.println(d+e);
//        }//here values are already initialised so we just have to call the method
//
//
//        public static void practice() {
//            System.out.println("hi");
//            cal(3, 4, 3);
//            oppa();
//            //we use this instead of writing
//            //int d=5;
//            //int e=4;
//            //System.out.println(d + e);
//            //but it won't give output here
//            //for output we need to call it under public static void main
//        }
//
//
//        public static int withIntReturnValue(int x, int y , int z){
//            System.out.println(x*y*z);
//            return x*y*z;
//        }
//
//
//        //public static int sup(int h, int j) {
//        //    if (h==6){
//        //        int k=j+h;
//        //        System.out.println(k);
//        //        return k;
//        //    }
//        //will give error as k will only be returned when h==6 i.r if value true but int need to return value even if
//        // if statement is false
//        //to resolve we can add else statement or add return value in end before public static int close bracket
//        public static int sup(int h, int j) {
//            if (h==6){
//                int k=j+h;
//                System.out.println(k);
//                return 6; }
//            else{
//                System.out.println("bye");
//                return -1;}
//        }
//
//
//        public static int cup(int l,int u){
//            if(l==0){
//                System.out.println("hi");
//                return l;}
//            return -1;//will print nothing if l not equal to 0
//            //will resolve error or return value when if not true
//            //-1 indicates no value returned
//        }
//
//
//
//
//        public static void displayHighScorePosition (String playerName, int positionOnHighScoreTable){
//            System.out.println(playerName+" managed to get into the position "+positionOnHighScoreTable+" on the high score table");
//        }
//
//        public static int calculateHighScorePosition(int playerScore){
//            if (playerScore>=1000)
//                return 1;
//            else if (playerScore>=500 && playerScore<1000)
//                return 2;
//            else if (playerScore>=100 && playerScore<500)
//                return 3;
//            else
//                return 4;
//        }//will print return values
//        //return value and public static data_type must be of same data type
//
//
////    public static int anotherWayCalculateHighScorePosition(int playerScore) {
////        int position = 4;
////        if (playerScore >= 1000)
////            position=1;
////        else if (playerScore >= 500 && playerScore < 1000)
////            position =2;
////        else if (playerScore >= 100 && playerScore < 500)
////            position =3;
////        return position;
////    }
//    }


                                                         //ROUNDING NUMBERS

        //math.round is an well built method in java which returns the closest long argument
        //basically rounds up the number to nearest integer

        System.out.println(Math.round(4.4087058));





    }
}



