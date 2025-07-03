import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {



        Q5();


    }

    public static void Q1(){

    //Write a Java program that accept three numbers from the user and print the largest number .

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int number1 = sc.nextInt();

        System.out.println("Enter your second number: ");
        int number2 = sc.nextInt();

        System.out.println("Enter your third number:  ");
        int number3 = sc.nextInt();


        if (number1 > number2 && number1 > number3){

            System.out.println("Your first number = " + number1 + " is the largest number");
        } else if (number1 < number2 && number2 > number3) {

            System.out.println("Your second number = " + number2 + " is the largest number");

        } else if (number1 < number3 && number2 < number3) {
            System.out.println("Your third number = " + number2 + " is the largest number");
        }else{
            System.out.println("There are 2 or more numbers that are equal to each other");
        }


    }


    public static void Q2(){

        //Write a Java program that accept a String and a number from the user,
        // then print the character in the given index .

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a word ");
        String name = sc1.nextLine();


        System.out.println(name.charAt(number));

    }

    public static void Q3(){

        //Write a program to enter the numbers till the user wants and at the end it should display the sum entered .


        boolean a = false;
        int sum = 0;

        do{

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = sc.nextInt();


            sum = number + sum;

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Would you like to continue? (y/n) ");
            String answer = sc1.nextLine();

            if (answer.equalsIgnoreCase("y")){

                a = true;

            }
            else if (answer.equalsIgnoreCase("n")){
                a = false;
            }
            else{
                System.out.println("You have entered the wrong option!");
            }

        }while(a == true);

        System.out.println("The sum of all the numbers entered are = " + sum);
    }

    public static void Q4(){

        //Write a Java program to find positive and negative numbers of a given array:
        //
        //  -  Original Array:
        //      [10, -21 , 30, 31, -25]
        //     -  Expected Output:
        //     10  is a positive number
        //     -21 is a negative number
        //      30 is a positive number
        //      31 is a positive number
        //     -25 is a negative number

        int [] arr1 = {1,2,3,-4};

        for(int i = 0 ; i < arr1.length; i ++ ){

            if (arr1[i] > 0 ){

                System.out.println(arr1[i] + " is a positive number");

            } else if (arr1[i] < 0) {

                System.out.println(arr1[i] + " is a negative number");
            }
            else {
                System.out.println("The number entered is zero");
            }
        }
    }

    public static void Q5(){

        //Write a Java program to find a shortest word of a given array:
        //- Original Array:
        //    [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
        //    - Expected Output:
        //     JAVA

        String [] arr2 = {"Abdulaziz", "Aziz", "Yousef", "Mohan"};

        String maxLength= "";
        for(String x : arr2){


            if (x.length() > maxLength.length()){

                maxLength = x;

            }


        }
        System.out.println(maxLength);



    }


}