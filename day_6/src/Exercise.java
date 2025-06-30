import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Scanner sc1 = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        Q6(sc, sc1);
    }

    public static void Q1(Scanner sc, Scanner sc1, ArrayList<Integer> list){

        //1.Write a Java program to test if the first and the last element of an array of
        //integers are same. The length of the array must be greater than or equal to
        //2 Test Data:
        //array = 50, -20, 0, 30, 40, 60, 10
        //Sample Output: false

        boolean a = true;
        int counter = 0;

        do {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            list.add(n);


            System.out.println("Do you want to enter another one? (y/n)");
            String answer = sc1.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                a = false;
                counter ++;
            }
            else if (answer.equalsIgnoreCase("n")) {
                a = true;
            }



        } while( a == false );


        System.out.println(list);

        if (counter < 2) {
            System.out.println(" Not enough numbers");
        } else if (list.get(0) == list.get(list.size() - 1)) {
            System.out.println("The first and last number of the list are the same");
        } else {
            System.out.println("The first and last number of the list are NOT the same");
        }


    }

    public static void Q2(Scanner sc, Scanner sc1, ArrayList<Integer> list){

        //2.Write a Java program to find the numbers greater than the average of the
        //numbers of a given array.
        //Original Array:
        //[1, 4, 17, 7, 25, 3, 100]
        //Expected Output:
        //The average of the said array is: 22.0 The numbers in the said array that are
        //greater than the average are: 25 100

        boolean a = true;
        int total = 0;

        do {

            System.out.println("Enter a number: ");
            int n = sc.nextInt();



            list.add(n);

            total += n;

            System.out.println("Do you want to enter another one? (y/n)");
            String answer = sc1.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                a = false;
            }
            else if (answer.equalsIgnoreCase("n")) {
                a = true;
            }



        } while( a == false );


        int average = total/list.size();
        System.out.println(list);

        for(int x : list){

            if (x > average){

                System.out.println("The numbers that are greater than the average in the said array: ");
                System.out.print(x + "  ");
            }


            }
        }

    public static void Q3(Scanner sc, Scanner sc1, ArrayList<Integer> list){

        //3.Write a Java program to get the larger value between first and last
        //element of an array of integers.
        //Original Array:
        //[20, 30, 40]
        //Sample Output:
        //Larger value between first and last element: 40

        boolean a = true;


        do {

            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            list.add(n);

            System.out.println("Do you want to enter another one? (y/n)");
            String answer = sc1.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                a = false;
            }
            else if (answer.equalsIgnoreCase("n")) {
                a = true;
            }



        } while( a == false );


        System.out.println(list);

        System.out.println("The first element: " + list.get(0));
        System.out.println("The last element: " + list.get(list.size() - 1));
        System.out.println("Larger value between first and last element:");

        if( list.get(0) > list.get(list.size() - 1) ){

            System.out.print(list.get(0) + "");

        } else if (list.get(0) < list.get(list.size() - 1)) {

            System.out.print(list.get(list.size() - 1) + "");

        }


    }

    public static void Q4(Scanner sc, Scanner sc1, ArrayList<Integer> list){

        //4.Write a Java program to swap the first and last elements of an array and
        //create a new array.
        //Original Array:
        //[20, 30, 40]
        //Sample Output:
        //New array after swapping the first and last elements: [40, 30, 20]

        boolean a = true;


        do {

            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            list.add(n);

            System.out.println("Do you want to enter another one? (y/n)");
            String answer = sc1.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                a = false;
            }
            else if (answer.equalsIgnoreCase("n")) {
                a = true;
            }



        } while( a == false );

        System.out.println(list);

        int temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);



        System.out.println(list);







    }

    public static void Q5(Scanner sc, Scanner sc1, ArrayList<Integer> list) {

        //5. Write a program that places the odd elements of an array before the
        //even elements.
        //Original Array:
        //[2,3,40,1,5,9,4,10,7]
        //Sample Output:
        //[3,1,5,9,7,2,40,4,10]

        boolean a = true;


        do {

            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            list.add(n);

            System.out.println("Do you want to enter another one? (y/n)");
            String answer = sc1.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                a = false;
            } else if (answer.equalsIgnoreCase("n")) {
                a = true;
            }


        } while (a == false);

        System.out.println(list);

        for (int i = 0; i <= list.size() - 1; i++) {
            for (int j = i + 1; j <= list.size() - 1; j++) {
                if (list.get(i) > list.get(j)) {
                    int temp1 = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp1);
                }
            }
        }

        ArrayList<Integer> temp = new ArrayList<>();

        for (int x : list) {

            if (x % 2 != 0) {

                temp.add(x);

            }
        }

        for (int x : list) {

            if (x % 2 == 0) {

                temp.add(x);

            }
        }

        list.clear();
        list.addAll(temp);



        System.out.println(list);

    }

    public static void Q6(Scanner sc, Scanner sc1) {

        //6. Write a program that test the equality of two arrays.
        //[2,3,6,6,4] [2,3,6,6,4]
        //Sample Output: true

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2, 3, 6, 6, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 2, 6, 6, 4));


        boolean equal = true;

        if (arr1.size() == arr2.size()) {

            for (int i = 0; i < arr1.size(); i++) {

                if(arr1.get(i) != arr2.get(i)) {

                    equal = false;

                }

            }

        }

        System.out.println(equal);



    }









}
