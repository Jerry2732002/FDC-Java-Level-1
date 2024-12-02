package src.week_two.day_one.generics.question04;

public interface Storage<T> {
     void add(T item);

    T get(int index);
}
