package src.week_one.day_five;

import java.util.*;

public class StringBuilderPractice {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String appendString(String str) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            System.out.println("Enter String to append(Enter STOP to exit)");
            String append = scanner.nextLine();
            if (append.equalsIgnoreCase("stop")) {
                scanner.close();
                return sb.toString();
            }
            sb.append(",").append(append);
        }
    }

    public static String deleteVowels(String str) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        for (String vowel : vowels) {
            int index;
            while ((index = sb.indexOf(vowel)) != -1) {
                sb.delete(index, index + 1);
            }
        }
        return sb.toString();
    }

    public static String insertWordInMiddleOfSentence(String sentence, String word) {

        //              METHOD 1
        StringBuilder sb = new StringBuilder();
        List<String> words = new LinkedList<>(Arrays.asList(sentence.split("\\s")));

        words.add(words.size() / 2, word);
        for (String str : words) {
            sb.append(str).append(" ");
        }
        return sb.toString();

//        //              METHOD 2
//        StringBuilder sb = new StringBuilder(sentence);
//        return sb.insert(sentence.length() / 2, word).toString();
    }

    public static void analyzePerformance() {
        String s = "";
        StringBuilder sb = new StringBuilder();
        StringBuffer sf = new StringBuffer();

        long stringStart;
        long stringEnd;

        long bufferStart;
        long bufferEnd;

        long builderStart;
        long builderEnd;

        stringStart = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            s = s + "*";
        }
        stringEnd = System.currentTimeMillis();

        builderStart = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.append("*");
        }
        builderEnd = System.currentTimeMillis();

        bufferStart = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sf.append("*");
        }
        bufferEnd = System.currentTimeMillis();

        System.out.println("String time : " + (stringEnd - stringStart));
        System.out.println("Builder time : " + (builderEnd - builderStart));
        System.out.println("Buffer time : " + (bufferEnd - bufferStart));

    }
}
