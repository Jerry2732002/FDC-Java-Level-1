package src.week_one.day_five;

import java.util.Arrays;

public class StringPractice {

    public static String extractDomainName(String email) {
        int start = email.indexOf("@");
        return email.substring(start + 1);
    }

    public static int countWords(String string) {
        return string.split("\\s").length;
    }

    public static String replaceVowel(String string) {
        return string.replaceAll("[AEIOUaeiou]", "*");
    }

    public static void similarityCheck(String s1, String s2) {
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        if (s1.equals(s2)) {
            System.out.println("Both are Same");
        } else {
            System.out.println("Both are not Same");
        }
    }

    public static void stringFormat(String name, int age, String country) {
        System.out.printf(("Name: %s, Age: %d, Country: %s"), name, age, country);
    }

    public static void ignoreCaseSimilarityCheck(String s1, String s2) {
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Both are Same");
        } else {
            System.out.println("Both are not Same");
        }
    }

    public static void lexicalOrder(String s1, String s2) {
        if (s1.compareTo(s2) == 0) {
            System.out.println("Both are of same order");
        }else if(s1.compareTo(s2) < 0) {
            System.out.println("Order : \n1. " + s1 + "\n2. " + s2);
        }
        else {
            System.out.println("Order : \n1. " + s2 + "\n2. " + s1);
        }
    }
}

