package src.week_two.day_one.generics.question04;

import java.util.ArrayList;

public class ArrayStorage <T>implements Storage<T>{

    ArrayList<T> list = new ArrayList<>();


    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    public void printList(){
        System.out.println(list);
    }
}
