import java.util.Random;
import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        // Q5();

    }


    public static void Q1 (){

//        1.Write a program that checks the role of the user

//        If the role is admin print "welcome admin"
//        If the role is superuser print "welcome superuser"
//        If the role is user print "welcome user" (tip:
//        use if else)

        Scanner user = new Scanner(System.in);
        System.out.println("Enter the user role : ");
        String role = user.nextLine();



        if (role.equals("admin")) {
            System.out.println("welcome admin");

        } else if (role.equals("superuser")) {
            System.out.println("welcome superuser");

        }else if (role.equals("user")){
            System.out.println("welcome user");

        }

    }

    public static void Q2(){

//        2.Take three numbers from the user and print the greatest number.
//
//                Test Data:

//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87
//        Expected Output : The
//        greatest: 87



        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        Double number1 = numbers.nextDouble();

        Scanner numbers2 = new Scanner(System.in);
        System.out.println("Enter your second number : ");
        Double number2 = numbers2.nextDouble();

        Scanner numbers3 = new Scanner(System.in);
        System.out.println("Enter your third number : ");
        Double number3 = numbers3.nextDouble();


        if (number1 > number2 && number1 > number3) {

            System.out.println(number1 + " is the greatest number");

        } else if (number2 > number1 && number2 > number3) {

            System.out.println(number2 + " is the greatest number");

        }else if (number3 > number1 && number3 > number2) {


            System.out.println(number3 + " is the greatest number");
        }
    }

    public static void Q3() {

//                3.Write a Java program that generates an integer between 1 and 7
//                and displays the name of the weekday.
//                        Test Data number: 4
//                        Expected Output: Wednesday


        Random rand = new Random();
        int number = rand.nextInt(7) + 1; // 1 to 7

        System.out.println(" The number is " + number);

        System.out.println("Day is :");
        switch (number) {

            case 1:
                System.out.println("Sunday");
                break;

                case 2:
                    System.out.println("Monday");
                    break;

                    case 3:
                        System.out.println("Tuesday");
                        break;
                        case 4:

                            System.out.println("Wednesday");
                            break;

                            case 5:
                                System.out.println("Thursday");
                                break;

                                case 6:
                                    System.out.println("Friday");
                                    break;

                                    case 7:
                                        System.out.println("Saturday");
                                        break;
                }

            }


    public static void Q4(){


//        4. Write a program that takes a numeric score as input and prints
//        the corresponding letter grade using the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69 F:
//        0-59
//        Enter your numeric score: 85
//        Numeric Score: 85
//        Letter Grade: B

        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter your first score from 0-100 : ");
        int number1 = numbers.nextInt();



        if (number1 >= 90 && number1 <= 100) {

            System.out.println(" Your grade Band is : A ");
        }

        else if (number1 >= 80 && number1 <= 89) {
            System.out.println(" Your grade Band is : B" );

        }
        else if (number1 >= 70 && number1 <= 79) {

            System.out.println(" Your grade Band is : C" );

        }
        else if (number1 >= 60 && number1 <= 69) {
            System.out.println(" Your grade Band is : D" );
        }
        else {
            System.out.println(" Your grade Band is : F" );

        }




    }


    public static void Q5(){

//        5. Write a Java program that takes a person's age as input and
//        categorizes them into one of three age categories: "Child,"
//        "Teenager," or "Adult" using an if statement.
//                use an if statement to categorize the age based on the following criteria:
//• If the age is less than 13, categorize them as a "Child."
//• If the age is between 13 and 19 (inclusive), categorize them as a
//        "Teenager."
//• If the age is 20 or older, categorize them as an "Adult."
//        Sample Output:
//        Enter your age: 25
//        You are an Adult.



            System.out.println("Enter your age :");

            Scanner Age = new Scanner (System.in);

            int age = Age.nextInt();

            if (age > 13){

                System.out.println("You are a child");

            } else if ( age >= 13 && age >= 19) {

                System.out.println("You are a teenager");
            }

            else {

                System.out.println("You are a adult");
            }


    }




}


