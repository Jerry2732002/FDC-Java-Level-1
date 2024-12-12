package src.week_three.day_three;

import java.util.HashMap;
import java.util.Map;

public class Question2 {
    static int frequencyCounter(String str, char ch) {
        int count = 0;
        int length = str.length();
        if (length == 0 || length == 1) {
            return length;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ch)
                count++;
        }
        return count;
    }

    public static void execute() {
        Map<Character, Integer> charFrequency = new HashMap<>();
        String sample = "Jerry Sebastian Son of Sebastian Joseph";
        sample = sample.toLowerCase();
        for (char ch : sample.toCharArray()) {
            while (!charFrequency.containsKey(ch)) {
                charFrequency.put(ch, frequencyCounter(sample, ch));
            }
        }

        for (char key : charFrequency.keySet()) {
            System.out.println(key + " : " + charFrequency.get(key));
        }
    }
}
