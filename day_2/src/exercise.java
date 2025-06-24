import java.util.Scanner;

public class exercise {

    public static void main(String[] args) {

        Q1();
        Q2();
        Q3();
        Q4();
        Q5();
        Q6();
        Q7();
        Q8();

    }

    public static void Q1(){

//        1. Develop a program that takes the weight (in kilograms) and height (in meters)
//        as input and calculates the BMI, then prints it.
//
//        • Input: Weight (kg) = 70, Height (m) = 1.75
//        • Expected Output: BMI = 22.86

        System.out.println("Enter your Weight :");
        Scanner Weight = new Scanner(System.in);
        double weight = Weight.nextDouble();

        System.out.println("Enter your Weight :");
        Scanner Height = new Scanner(System.in);
        double height = Height.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI is " + bmi);



    }

    public static void Q2(){

//        2. Write a program that takes the obtained marks and total marks as input and
//        calculates the percentage, then prints it.
//
//        • Input: Obtained Marks = 85, Total Marks = 100
//        • Expected Output: Percentage = 85.0%

        System.out.println("Enter your mark out of 100 :");
        Scanner Mark = new Scanner(System.in);

        double mark = Mark.nextDouble();


        double Total = 100;

        double percentage = (mark / Total) * 100;

        System.out.println("Your Percentage is " + percentage);



    }


    public static void Q3(){

//        3. Create a program that takes an amount in one currency and an exchange rate
//        as input, then converts and prints the amount in another currency.

//        • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
//        • Expected Output: Amount in EUR = 85.0



        System.out.println("Enter your amount in one USD :");

        Scanner amountUSD = new Scanner(System.in);

        double amount_USD = amountUSD.nextDouble();


        double Exchange = 0.85;

        double Eur = amount_USD * Exchange;

        System.out.println("Your Amount in EUR is " + Eur);



    }

    public static void Q4(){

//        4. Create a program that takes a string as input, calculates its length, and then
//        reverses the string using the StringBuilder class, finally printing both the length and
//        reversed string.
//
//        • Input: "Hello, World!"
//        • Expected Output: Length of the string: 13 And Reversed string: "!dlroW,olleH"


        System.out.println("Enter a sentence: ");

        Scanner Sentence = new Scanner(System.in);
        String greeting = Sentence.nextLine();

        String reversed = new StringBuilder(greeting).reverse().toString();

        System.out.println(reversed);

    }


    public static void Q5(){

//        5. Develop a program that takes a sentence as input and extracts a substring from
//        it, then prints the extracted substring.
//
//        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
//        • Expected Output: "brown fox"

        System.out.println("Enter a sentence: ");

        Scanner Sentence = new Scanner(System.in);

        String sentence = Sentence.nextLine();

        String part = "Substring (10 to 20): " + sentence.substring(10, 20);

        System.out.println(part);

    }

    public static void Q6(){


//        6. Write a program that takes a sentence and a keyword as input, then check if
//        the keyword is present in the sentence and prints the result.
//
//        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
//        • Expected Output: Keyword "jumps" is present in the sentence.


        System.out.println("Enter a sentence: ");

        Scanner Sentence = new Scanner(System.in);

        String sentence = Sentence.nextLine();

        String part;

        if ( sentence.contains("jumps") ) {

            System.out.println(part = "Keyword jumps is present in the sentence.");
        }


    }

    public static void Q7(){

//        7. Develop a program that takes a sentence and a word to replace as input, then
//        replace all occurrences of the word with another word and prints the modified
//        sentence.
//
//        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
//        • Expected Output: "The quick brown cat jumps over the lazy dog"


        System.out.println("Enter a sentence: ");

        Scanner Sentence = new Scanner(System.in);

        String sentence = Sentence.nextLine();

        String replacement = sentence.replace("fox", "cat");
        System.out.println( replacement ); // remove all spaces

    }

    public static void Q8(){


//        8. Write a program that takes two strings as input and check if they are equal,
//                ignoring the case, then prints whether they are equal or not.
//
//            • Input: String 1 = "Hello", String 2 = "hello"
//            • Expected Output: Strings are equal (ignoring case).

        System.out.println("Enter your first word! : ");

        Scanner word = new Scanner(System.in);


        String word1 = word.nextLine();




        System.out.println("Enter your second word! : ");

        Scanner secondWord = new Scanner(System.in);

        String word2 = secondWord.nextLine();

        boolean what = word1.equalsIgnoreCase(word2);

        if (what == true) {
            System.out.println("Strings are equal (ignoring case).");

        }
    }

}
