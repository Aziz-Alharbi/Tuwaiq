import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) throws Exception {

      //  largestInput();

        try {

/*
            Q5();
            reversingWord();
            oddOrEven();
            characterIndex();
            secondsToHours();
            numbersCounter();

*/
            letterAppearance();

        }catch (InputMismatchException e) {
           // System.out.println("Third integer is not equal to the sum");
            System.out.println("Enter a correct number!");

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    public static void operations() {

//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5

        boolean check = true;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your first number");
                int number = sc.nextInt();


                System.out.println("Enter your second number");
                int number2 = sc.nextInt();


                System.out.println(number + " + " + number2 + " = " + (number + number2));
                System.out.println(number + " - " + number2 + " =" + (number - number2));
                System.out.println(number + " X " + number2 + " = " + (number * number2));
                System.out.println(number + " / " + number2 + " = " + (number / number2));
                System.out.println(number + " % " + number2 + " = " + (number % number2));

            } catch (InputMismatchException e) {
                check = false;
                System.out.println("Enter a correct number! ");
            }
        }while (check == false);

    }

    public static void timesTable() {

//        2. Write a Java program that takes a number as input and prints its multiplication table up to 10.

//        Test Data:
//        Input a number: 8

//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80

        int number;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            number = sc.nextInt();

            for (int i = 1; i <= 10; i++) {

                System.out.println(number + " X " + i + " = " + (number * i));

            }
        }
        catch (InputMismatchException e) {
            System.out.println("Enter a correct number! ");
        }

    }

    public static void circleCalculations() {

//        3. Write a Java program to print the area and perimeter of a circle.

//        Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586


        // area of a circle is given by the formula A = πr²

//        where 'r' is the radius of the circle.
//        The perimeter of a circle, also known as the circumference, is calculated using the formula
//        C = 2πr, where 'r' is the radius. 'π' (pi) is a mathematical constant approximately equal to 3.14159

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius of a circle: ");
            double radius = sc.nextDouble();

            double pi = 3.14159265358979323846;
            double area = pi * (radius * radius);
            double perimeter = 2 * pi * radius;

            System.out.println();
            System.out.println("Calculations of the circle: ");
            System.out.println();

            System.out.println("Perimeter = " + perimeter);
            System.out.println("Area = " + area);
        }catch (InputMismatchException e) {
            System.out.println("Enter a correct radius of a circle! ");
        }

    }

    public static void averageCalculations() {

        // 4. Java program to find out the average of a set of integers
//        Enter the count of numbers:
//        5
//        Enter an integer:
//        3
//        Enter an integer:
//        8
//        Enter an integer:
//        6
//        Enter an integer:
//        7
//        Enter an integer:
//        2
//        The average is: 5.2


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the count of a numbers: ");
            int number = sc.nextInt();
            int number2 = 0;
            int sum = 0;

            for (int i = 1; i <= number; i++) {

                System.out.println("Enter an integer: ");
                number2 = sc.nextInt();
                sum += number2;

            }

            System.out.println("sum = " + sum);
            System.out.println("iterations = " + number);
            double average = (double) sum / number;
            System.out.println("average = " + average);
        }catch (InputMismatchException e) {
            System.out.println("Enter a correct number! ");
        }

    }

    public static void Q5() throws Exception{

        // 5. Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.

//        Sample Output:
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true
//                --------
//        Input the first number : 10
//        Input the second number: 20
//        Input the third number : 25
//        The result is: false

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first integer: ");
            int number = sc.nextInt();

            System.out.println("Enter the second integer: ");
            int number2 = sc.nextInt();

            System.out.println("Enter the third integer: ");
            int number3 = sc.nextInt();


            int sum = number + number2;

            if (sum == number3) {
                System.out.println("Sum = " + sum);
                System.out.println("third integer = " + number3);
                System.out.println("Sum is equal to the third integer");

            } else {

                throw new Exception("Sum is not equal to the third integer");
//                System.out.println("Sum = " + sum);
//                System.out.println("third integer = " + number3);
//                System.out.println("Sum is not equal to the third integer");
            }


    }

    public static void reversingWord() throws Exception {


//        6. Write a Java program to reverse a word.
//        Sample Output:
//        Input a word: dsaf
//        Reverse word: fasd



            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a word: ");
            String word = sc.nextLine();

            if (word.length() < 2) {
                throw new Exception("Your word is too short");
            }

            String reversedWord = new StringBuilder(word).reverse().toString();

            System.out.println("your word: " + word);
            System.out.println("the reverse of your word: " + reversedWord);

    }

    public static void oddOrEven() throws Exception {

//        7 - Java program to check whether the given number is even or odd
//        Enter a number:
//        33
//        The number is Odd
//        Enter a number:
//        24
//        The number is Even

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();

        if (number == 0) {
            throw new Exception("Enter a number above 0");

        }
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even");
        } else {
            System.out.println("The number " + number + " is odd");
        }


    }

    public static void Fahrenheit() {

        //8 - Java program to convert the temperature in Centigrade to Fahrenheit

//        Enter temperature in Centigrade:
//        43
//        Temperature in Fahrenheit is: 109.4

          // F = (°C * 9/5) + 32

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter temperature in Centigrade: ");
            double celsius = sc.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("the Centigrade temperature entered in Fahrenheit is " + fahrenheit);


        }catch (InputMismatchException e) {
            System.out.println("Enter a correct number! ");
        }
    }

    public static void characterIndex() throws Exception {

        //9.Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index.

//        Test Data:
//        Input a string: Java Bootcamp
//        Input a number: 1
//        Expected Output:
//        a


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        System.out.println("Enter an integer: ");
        int number = sc.nextInt();

        if (number > word.length() - 1){

            throw new Exception("invalid input!");
        }

        String characters = String.valueOf(new String(word).charAt(number));

        System.out.println(characters);


    }

    public static void rectangleCalculations() {

        //10. Write a Java program to print the area and perimeter of a rectangle.
        //Test Data:
        //Width = 5.5 Height = 8.5
        //Expected Output
        //Area is 5.6 * 8.5 = 47.60
        //Perimeter is 2 * (5.6 + 8.5) = 28.20

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Width of a rectangle: ");
            double width = sc.nextDouble();

            System.out.println("Enter a Height of a rectangle: ");
            double height = sc.nextDouble();

            double area = width * height;
            double perimeter = 2 * (width + height);

            System.out.println("The area of the rectangle: " + area);
            System.out.println("The perimeter of the rectangle: " + perimeter);

        }
        catch (InputMismatchException e) {
            System.out.println("Enter a correct number! ");
        }

    }

    public static void comparingTwoNumbers() {

        //11. Write a Java program to compare two numbers.
        //Input Data:
        //Input first integer: 25
        //Input second integer: 39
        //Expected Output
        //25 != 39
        //25 < 39
        //25 <= 39

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first integer: ");
            int number = sc.nextInt();
            System.out.println("Enter the second integer: ");
            int number2 = sc.nextInt();

            if (number != number2) {
                System.out.println(number + " is NOT equal to " + number2);
            } else if (number < number2) {
                System.out.println(number + " is less than " + number2);

            } else if (number == number2) {
                System.out.println(number + " is equal to " + number2);

            } else if (number > number2) {
                System.out.println(number + " is greater than " + number2);
            }

        }catch (InputMismatchException e) {
            System.out.println("Enter a correct number! ");
        }

    }

    public static void secondsToHours() throws Exception {

//        12. Write a Java program to convert seconds to hours, minutes and seconds.

//        Sample Output:
//        Input seconds: 86399

//        23:59:59



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int number = sc.nextInt();

        if (number > 86400) {
            throw new Exception(" That is more than a day");
        }

        int hours = number / 3600;
        int minutes = number % 3600 / 60;
        int seconds = number % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public static void comparingFourNumbers() {

        //13. Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise.
        //Sample Output:
        //Input first number: 25
        //Input second number: 37
        //Input third number: 45
        //Input fourth number: 23
        //Numbers are not equal!

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println("Enter an integer: ");
        int number2 = sc.nextInt();
        System.out.println("Enter an integer: ");
        int number3 = sc.nextInt();
        System.out.println("Enter an integer: ");
        int number4 = sc.nextInt();


        if (number == number2 && number2 == number3 && number2 == number4) {
            System.out.println("All four integers are equal");
        } else {
            System.out.println("All four integers are not equal");
        }

    }

    public static void numberSignal() {

        //14. Write a Java program that reads an integer and check whether it is negative, zero, or
        //positive.
        //Test Data Input a number: 7 Expected Output :
        //Number is positive

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int number = sc.nextInt();

            if (number > 0) {
                System.out.println(number + " is positive ");
            } else if (number == 0) {
                System.out.println(number + " is zero");
            } else {
                System.out.println(number + " is negative");
            }
        }catch (InputMismatchException e) {
            System.out.println("Enter a correct number! ");
        }


    }

    public static void numbersCounter() throws Exception {

        //15.Write a program to enter the numbers till the user wants and at the end it
        //should display the count of positive, negative and zeros entered (End loop use -1 ,
        //Don’t count -1).
        //Test data
        //1
        //3
        //0
        //-2
        //-4
        //-1
        //2 positives
        //1 zero
        //2 negatives

        int positive = 0;
        int negative = 0;
        int zeros = 0;

        boolean a = true;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int number = sc.nextInt();


            if (number > 0) {
                positive = positive + 1;
            } else if (number == 0) {
                zeros++;

            } else {
                negative++;
            }



            Scanner sc1 = new Scanner(System.in);

            System.out.println("Do you want to enter another one? (y/n)");
            String answer = sc1.nextLine();

            if (!answer.equalsIgnoreCase("y") || !answer.equalsIgnoreCase("n")) {
                throw new Exception("Please choose either y OR n");

            }
            else if (answer.equalsIgnoreCase("y")) {
                a = false;
            } else if (answer.equalsIgnoreCase("n")) {
                a = true;

            }

        }

        while (a == false);
        {


        }

        System.out.println("number of positive numbers are " + positive);
        System.out.println("number of negative numbers are " + negative);
        System.out.println("number of zeros are " + zeros);

    }

    public static void integerReversed() {

        //16 - Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed.
        //For example, if the input is 12345, the output should be 54321.

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int n = sc.nextInt();

            // conversion of int to string
            String temp = "" + n;

            // creating stringbuilder obj
            StringBuilder sb = new StringBuilder(temp);

            // using reverse method to
            // reverse the obj
            StringBuilder str = sb.reverse();

            // printing reverse number
            System.out.println(str.toString());

        }catch (InputMismatchException e) {
            System.out.println("Enter a correct number! ");
        }
    }

    public static void largestInput() {

        //17 - Write a program to enter the numbers till the user wants and at the end the
        //program should display the largest and smallest numbers entered.
        //enter the number : 4
        //enter the number : 5
        //enter the number : -1
        //enter the number : 9
        //the large number : 9
        //the small number : -1


        int number2 = 0;
        int number3 = 0;
        boolean a = true;


        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter an integer: ");
                int number = sc.nextInt();


            if (number > number2) {
                number2 = number;
            } else if (number < number3) {
                number3 = number;
            }


            Scanner sc1 = new Scanner(System.in);

            System.out.println("Do you want to enter another one? (y/n)");
            String answer = sc1.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                a = false;
            } else if (answer.equalsIgnoreCase("n")) {
                a = true;


            }
            }catch (InputMismatchException e) {
                System.out.println("Enter a correct number! ");
            }
        }

        while (!a);
        {


        }
        System.out.println("the largest number entered is " + number2);
        System.out.println("the smallest number entered is " + number3);
    }

    public static void letterAppearance() throws Exception {

        //18 - Determine and print the number of times the character ‘a’ appears in the input
        //entered by the user.
        //Enter String:
        //Java bootcamp
        //Output: Number of a's: 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();


        if (word.length() < 2){
            throw new Exception("Your word is too short!");
        }
        int letterNumber = 0;


        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'z') {
                letterNumber++;
            }

        }

        System.out.println(letterNumber);

    }


}

