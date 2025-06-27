import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Q8();
    }


    public static void Q1() {

//        1.Write a program that prints the numbers from 1 to 100 such that:
//        If the number is a multiple of 3, you need to print "Fizz" instead of that
//        number.

//         If the number is a multiple of 5, you need to print "Buzz" instead of that number.
//         If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.


        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }


        }
    }

    public static void Q2() {

        //2.Write a Java program to reverse a string.
        //Test Data: Input a string: The quick brown fox Expected Output: Reverse
        //string: xof nworb kciuq ehT

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

//        String reversedWord = new StringBuilder(word).reverse().toString();
//
//        System.out.println("your word: " + word);
//        System.out.println("the reverse of your word: " + reversedWord);

        System.out.println(word.length());
        for (int i = 0; i < word.length(); i++) {


            System.out.print(word.charAt(i));


        }
    }

    public static void Q3() {

        //3.Write a program to find the factorial value of any number entered
        //through the keyboard.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();


        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

    }

    public static void Q4() {

        //4.Two numbers are entered through the keyboard. Write a program to find
        //the value of one number raised to the power of another. (Do not use Java
        //built-in method)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double number = sc.nextDouble();

        System.out.println("Enter your second number: ");
        double number2 = sc.nextDouble();

        double result = 1;

        for (int i = 1; i <= number2; i++) {
            result *= number;
        }

        System.out.println(number + " raised to the power of " + number2 + " is " + result);

    }

    public static void Q5() {

        //5.Write a program that reads a set of integers, and then prints the sum of
        //the even and odd integers.

        int number2 = 0 ;
        int number3 = 0 ;
        boolean a = true;


        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int number = sc.nextInt();


            if (number % 2 == 0) {
                number2 ++;
            } else if (number % 2 == 1) {
                number3 ++;
            }


            Scanner sc1 = new Scanner(System.in);

            System.out.println("Do you want to enter another one? (y/n)");
            String answer = sc1.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                a = false;
            }
            else if (answer.equalsIgnoreCase("n")) {
                a = true;




            }
        }

        while (!a);{



        }
        System.out.println("the number of even numbers entered is " + number2);
        System.out.println("the number of odd numbers entered is " + number3);
    }

    public static void Q6(){

        //6.Write a program that prompts the user to input a positive integer. It
        //should then output a message indicating whether the number is a prime
        //number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }





    }

    public static void Q7(){

        //7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        //another for loop to print the days (Days 1 -7) for each week.
        //Expected Output:
        //Week 1
        //Day1
        //Day2
        //Day3
        //Day4
        //Day5


        for (int i = 1; i <= 4; i++) {

            System.out.println("Week " + i);

            for (int j = 1; j <= 7; j++){

                System.out.println("Day " + j);
            }

        }

    }

    public static void Q8(){



        //8.Write a program thats check if the word is a palindrome or not. hint: A
        //string is said to be a palindrome if it is the same if we start reading it from
        //left to right or right to left.



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();

        String reversedWord = new StringBuilder(word).reverse().toString();

        if (word.equals(reversedWord)) {
            System.out.println(word + " is palindrome.");
        }
        else {
            System.out.println(word + " is not palindrome.");
        }








    }


}


