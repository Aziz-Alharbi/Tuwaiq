import java.util.*;

public class Lab2 {
    public static void main(String[] args) {

        Q8();

    }

    public static void Q1() {

        //Write a program to find all of the longest word in a given dictionary.

        //Example:
        //{ "cat", "dog", "red", "is", "am" }

        // Expected Output:
        //"cat", "dog", "red"


        ArrayList<String> longestWords = new ArrayList<>();
        ArrayList<String> dictionary = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Enter a word:");
            String word = sc.nextLine().toLowerCase();
            dictionary.add(word);

            System.out.println("Would you like to continue? (y/n)");
            answer = sc.nextLine().toLowerCase();
        } while (answer.equals("y"));

// Find max length
        int maxLength = 0;
        for (String word : dictionary) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        // Collect all words with max length
        for (String word : dictionary) {
            if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        System.out.println("Longest words = " + longestWords);
        System.out.println("All the words = " + dictionary);

    }

    public static void Q2() {

        //2. Write a program that displays the number of occurrences of an element in the array.
        //Original Array:
        //[1,1,1,3,3,5]
        //Sample Output:
        //3 occurs 2 times
        //1 occurs 3 times
        //9 occurs 0 time


        int[] arr = {1, 2, 2, 8, 5, 3, 1, 3, 3};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : arr) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        Set<Integer> searchNumbers = Set.of(2, 5, 8); // numbers to search
        for (int num : searchNumbers) {
            int freq = frequencyMap.getOrDefault(num, 0);
                System.out.println("Number " + num + " appears " + freq + " times.");

        }
    }

    public static void Q3() {

        //3.Write a program to find the k largest elements in a given array. Elements in the array can be in
        //any order.

        //Original Array:
        //[1, 4, 17, 7, 25, 3, 100]
        //Expected Output:
        //3 largest elements of the said array are:
        //100 25 17


        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;

        Arrays.sort(arr); // Sorts in ascending order

        System.out.println(k + " largest elements of the array are:");
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Q4() {

        //4. Create a method to reverse an array of integers. Implement the method without creating a new
        //array.

        //Original Array:
        //[5,4,3,2,1] Expected Output:
        //Reversed Array:
        //1 2 3 4 5


        int[] arr = {5, 4, 3, 2, 1};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void Q5() {

        //5. Write a menu driven Java program with following option:

        //1. Accept elements of an array
        //2. Display elements of an array
        //3. Search the element within array
        //4. Sort the array 5. To Stop the size of the array should be
        //entered by the user.

        ArrayList <Integer> list = new ArrayList<>();

        boolean a = false;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("1. Accept elements of an array ");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search the element within array");
            System.out.println("4. Sort the array");
            System.out.println("5. To Stop");
            System.out.println("Enter a digit :");

            int digit = sc.nextInt();

            if (digit == 1) {

                System.out.println("You have choose option number 1");
                String answer;
                do {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter a number:");
                    int number = sc1.nextInt();

                    list.add(number);

                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("would you like to continue? (y/n)");
                    answer = sc2.nextLine();


                } while (answer.equals("y"));


            }

            if (digit == 2) {

                System.out.println("You have chosen to display the list");
                System.out.println("The list : " + list);

            }

            if (digit == 3) {


                Map<Integer, Integer> frequencyMap = new HashMap<>();

                for (int element : list) {
                    frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
                }

                Set<Integer> searchNumbers = Set.of(2, 5, 8); // numbers to search
                for (int num : searchNumbers) {
                    int freq = frequencyMap.getOrDefault(num, 0);
                    System.out.println("Number " + num + " appears " + freq + " times.");

                }
            }

            if (digit == 4) {

                Collections.sort(list);

            }

            if (digit == 5) {


                System.out.println("You have choose option number 5");
                 a = true;

            }

        }while(a == false);

    }

    public static void Q6() {

        //6. Create a method that generates a random number within a given range. Allow the user to
        //specify the range and call the method to display random numbers.

        //Hint: use Random class

        //Sample Output:
        //Enter the minimum value of the range: 10
        //Enter the maximum value of the range: 100
        //Enter the number of random numbers to generate: 5 Random
        //numbers within the specified range:
        //71 - 98 - 96 - 71 - 71

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the minimum value: ");
            int min = sc.nextInt();

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the maximum value: ");
            int max = sc1.nextInt();

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter the number of random numbers to generate: ");
            int num = sc2.nextInt();

            System.out.println("Random numbers between " + min + " and " + max + " are: ");


            for (int i = 0; i < num; i++) {

                Random randomNumbers = new Random();

                System.out.println( (i+1) + "." + "Random number: " + (randomNumbers.nextInt(max)+min) );            }



            System.out.println();
        }while (false);


    }

    public static void Q7() {

        //7. Write a program that checks the strength of a password. Create a method that evaluates a
        //password based on criteria like length, inclusion of special characters, and
        //uppercase/lowercase letters.
        //- We have three methods: checkLength, checkSpecialCharacters, and
        //checkUpperCaseLowerCase, each of which assigns a score based on specific criteria.
        //- The totalScore is calculated by adding the scores from these methods.
        //- Classify the password as strong (8 or more), moderately strong (5 or more), or weak
        //based on the totalScore. - The criteria for scoring:
        //• Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
        //(3 points).
        //• Special characters: Absence (0 points), Presence (2 points).
        //• Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
        //points).

        //Example:
        //Enter a password: 3456 Expected Output:
        //Password is weak.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        int totalScore = checkLength(password)
                + checkSpecialCharacters(password)
                + checkUpperCaseLowerCase(password);

        System.out.println("Total Score: " + totalScore);

        if (totalScore >= 8) {
            System.out.println("Password is strong.");
        } else if (totalScore >= 5) {
            System.out.println("Password is moderately strong.");
        } else {
            System.out.println("Password is weak.");
        }
    }

    public static int checkLength(String password) {
        if (password.length() >= 8) return 3;
        if (password.length() >= 6) return 2;
        return 0;
    }

    public static int checkSpecialCharacters(String password) {
        return password.matches(".*[^a-zA-Z0-9].*") ? 2 : 0;
    }

    public static int checkUpperCaseLowerCase(String password) {
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasLower = password.matches(".*[a-z].*");
        return (hasUpper && hasLower) ? 3 : 0;
    }



    public static void Q8() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int terms = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci sequence with " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

    }



    }






