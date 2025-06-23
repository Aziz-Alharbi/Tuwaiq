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


        double weight = 70.0;
        double height = 1.75;

        double bmi = weight / (height * height);

        System.out.println("Your BMI is " + bmi);



    }

    public static void Q2(){

//        2. Write a program that takes the obtained marks and total marks as input and
//        calculates the percentage, then prints it.
//
//        • Input: Obtained Marks = 85, Total Marks = 100
//        • Expected Output: Percentage = 85.0%


        double mark = 85.0;
        double Total = 100;

        double percentage = (mark / Total) * 100;

        System.out.println("Your Percentage is " + percentage);



    }


    public static void Q3(){

//        3. Create a program that takes an amount in one currency and an exchange rate
//        as input, then converts and prints the amount in another currency.

//        • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
//        • Expected Output: Amount in EUR = 85.0


        double Amount_USD = 100;
        double Exchange = 0.85;

        double Eur = Amount_USD * Exchange;

        System.out.println("Your Amount in EUR is " + Eur);



    }

    public static void Q4(){

//        4. Create a program that takes a string as input, calculates its length, and then
//        reverses the string using the StringBuilder class, finally printing both the length and
//        reversed string.
//
//        • Input: "Hello, World!"
//        • Expected Output: Length of the string: 13 And Reversed string: "!dlroW,olleH"


        String greeting = "Hello, World!";

        String reversed = new StringBuilder(greeting).reverse().toString();

        System.out.println(reversed);

    }


    public static void Q5(){

//        5. Develop a program that takes a sentence as input and extracts a substring from
//        it, then prints the extracted substring.
//
//        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
//        • Expected Output: "brown fox"


        String Sentence = "The quick brown fox jumps over the lazy dog";

        String part = "Substring (10 to 20): " + Sentence.substring(10, 20);

        System.out.println(part);

    }

    public static void Q6(){


//        6. Write a program that takes a sentence and a keyword as input, then check if
//        the keyword is present in the sentence and prints the result.
//
//        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
//        • Expected Output: Keyword "jumps" is present in the sentence.

        String sentence = "The quick brown fox jumps over the lazy dog";
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



        String sentence = "The quick brown fox jumps over the lazy dog";

        String replacement = sentence.replace("fox", "cat");
        System.out.println( replacement ); // remove all spaces

    }

    public static void Q8(){


//        8. Write a program that takes two strings as input and check if they are equal,
//                ignoring the case, then prints whether they are equal or not.
//
//            • Input: String 1 = "Hello", String 2 = "hello"
//            • Expected Output: Strings are equal (ignoring case).

        String word1 = "Hello";
        String word2 = "hello";


        boolean what = word1.equalsIgnoreCase(word2);

        if (what == true) {
            System.out.println("Strings are equal (ignoring case).");

        }
    }

}
