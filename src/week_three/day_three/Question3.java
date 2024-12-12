package src.week_three.day_three;

import java.util.*;

class CustomMap {
    Set<Integer> keys = new HashSet<>();
    List<Integer> keyList = new ArrayList<>();
    List<String> values = new ArrayList<>();

    public void add(Integer key, String value) {
        if (keys.contains(key)) {
            throw new RuntimeException("Duplicate key:" + key);
        }
        keys.add(key);
        keyList.add(key);
        values.add(value);
    }

    public String get(Integer key) {
        if (!keys.contains(key)) {
            throw new RuntimeException("Key " + key + " not found");
        }
        return values.get(keyList.indexOf(key));
    }

    public String remove(Integer key) {

        if (!keys.contains(key)) {
            throw new RuntimeException("Key " + key + " not found");
        }
        String value = values.get(keyList.indexOf(key));
        keyList.remove(key);
        values.remove(value);
        return value;
    }

    public boolean containsKey(Integer key) {
        return keys.contains(key);
    }

    public boolean containsValue(String value) {
        return values.contains(value);
    }
    public void printMap() {
        for (Integer key : keyList) {
            System.out.println(key + " : " + values.get(keyList.indexOf(key)));
        }
    }
}

public class Question3 {
    public static void main(String[] args) {
        CustomMap map = new CustomMap();
        map.add(-1, "dfhs");
        map.add(-2,"fhdfhdfhsdh");
        map.add(1,"Jerry");
        map.add(2,"Jerry");
        map.add(3,"Sam");
        map.add(4,"Alex");
        map.printMap();
    }
}
