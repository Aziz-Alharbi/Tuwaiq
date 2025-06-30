import java.util.Scanner;

public class Exercise {

    public static void main (String[] args) {


        System.out.println(Q1());


    }


    public static int Q1(){

        //1 - Write a Java method to find the smallest number among three
        //numbers.
        //Test Data:
        //Input the first number: 25
        //Input the Second number: 37
        //Input the third number: 29
        //Expected Output:
        //The smallest value is 25.0


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter a second number: ");

        int number1 = input.nextInt();

        System.out.print("Enter a final number: ");
        int number2 = input.nextInt();



        if (number1 < number2 && number1 < number){
            return number1;
        }
        else if (number < number2 && number1 > number){
            return number;
        }

        else if (number > number2 && number1 > number2){
            return number2;
        }
        else {
            return 0;
        }
    }

    public static String Q2(){

        //2 - Write a Java method that check if the entered number is negative or
        //positive or zero.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0){
            return "The number is positive";
        }
        else if (number < 0){
            return "The number is negative";
        }
        else {
            return "The number is zero";
        }

    }

    public static boolean Q3 (){

        //3 - Write a Java method to check whether a string is a valid password.
        //Password rules:

        //A password must have at least ten characters. A
        //password consists of only letters and digits. A
        //password must contain at least two digits.


        //Expected Output:
        //1. A password must have at least eight characters.
        //2. A password consists of only letters and digits.
        //3. A password must contain at least two digits
        //Input a password (You are agreeing to the above Terms and
        //Conditions.):
        //abcd1234
        //Password is valid: abcd1234


        boolean result = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (password.length() < 8){
            System.out.println("short password! ");
            return result = false;

        }


        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (!Character.isLetterOrDigit(c)) {
                System.out.println("A password consists of only letters and digits.");
                return result = false;
            }

            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            System.out.println("A password must contain at least two digits.");
        } else {
            System.out.println("Password is valid: " + password);
        }
        return result;
        }

}
