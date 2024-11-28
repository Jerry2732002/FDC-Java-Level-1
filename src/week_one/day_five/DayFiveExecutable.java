package src.week_one.day_five;

import java.util.Scanner;

public class DayFiveExecutable {
    //Question 1
    public static void executeDomainExtractor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email id");
        String email = sc.next();
        System.out.println("Domain : " + StringPractice.extractDomainName(email));
        sc.close();
    }

    //Question 2
    public static void executeWordCounter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String string = sc.nextLine();
        System.out.println("No of words : " + StringPractice.countWords(string));
        sc.close();
    }

    //Question 3
    public static void executeVowelReplacer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String string = sc.nextLine();
        System.out.println("Vowels replaced by * :\n " + StringPractice.replaceVowel(string));
        sc.close();
    }

    //Question 4
    public static void executeSimilarityCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String stringOne = sc.nextLine();
        System.out.println("Enter a String");
        String stringTwo = sc.nextLine();
        StringPractice.similarityCheck(stringOne, stringTwo);
        sc.close();
    }

    //Question 5
    public static void executeStringFormat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();

        System.out.println("Enter Country");
        String country = sc.nextLine();

        System.out.println("Enter age");
        int age = sc.nextInt();
        StringPractice.stringFormat(name, age, country);

        sc.close();
    }

    //Question 6
    public static void executeIgnoreCaseSimilarityCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String stringOne = sc.nextLine();
        System.out.println("Enter a String");
        String stringTwo = sc.nextLine();
        StringPractice.ignoreCaseSimilarityCheck(stringOne, stringTwo);
        sc.close();
    }

    //Question 7
    public static void executeLexicalOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String stringOne = sc.nextLine();
        System.out.println("Enter a String");
        String stringTwo = sc.nextLine();
        StringPractice.lexicalOrder(stringOne, stringTwo);
        sc.close();
    }

    //Question 8
    public static void executeStringReverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String stringOne = sc.nextLine();
        System.out.println(StringBuilderPractice.reverseString(stringOne));
        sc.close();
    }

    //Question 9
    public static void executeCheckPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String stringOne = sc.nextLine();
        String reverse = StringBuilderPractice.reverseString(stringOne);
        if (stringOne.equalsIgnoreCase(reverse)) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is NOT a Palindrome");
        }
        sc.close();
    }

    //Question 10
    public static void executeAppendString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String stringOne = sc.nextLine();
        System.out.println("Combined String : " + StringBuilderPractice.appendString(stringOne));
        sc.close();
    }

    //Question 11
    public static void executeRemoveVowel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String stringOne = sc.nextLine();
        System.out.println("After vowel removed : " + StringBuilderPractice.deleteVowels(stringOne));
        sc.close();
    }

    //Question 12
    public static void executeInsertIntoMiddle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String sentence = sc.nextLine();
        System.out.println("Enter a word to insert");
        String word = sc.nextLine();
        System.out.println("After insertion : " + StringBuilderPractice.insertWordInMiddleOfSentence(sentence, word));
    }

    //Question 13
    public static void executePerformanceAnalysis() {
        StringBuilderPractice.analyzePerformance();
    }
}
