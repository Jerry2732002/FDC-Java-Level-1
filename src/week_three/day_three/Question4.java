package src.week_three.day_three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class Question4 {
    public static void wordCounter(String paragraph) {
        TreeMap<String, Integer> wordsWithCount = new TreeMap<>();
        ArrayList<String> words = new ArrayList<>(Arrays.asList(paragraph.toLowerCase().split("[,.!?]*\\s")));
        for (String word : words) {
            while (!wordsWithCount.containsKey(word)) {
                wordsWithCount.put(word, Collections.frequency(words, word));
            }
        }
        for (String key : wordsWithCount.keySet()) {
            System.out.println(key + " : " + wordsWithCount.get(key));
        }
    }
    public static void main(String[] args) {
        wordCounter("In a distant land, there lived a wise old owl. The owl, known for its wisdom, " +
                "often helped the villagers with their problems. One day, a young boy approached the owl, seeking advice. " +
                "The owl listened carefully and then replied, Patience and perseverance are the keys to success.");
    }
}
