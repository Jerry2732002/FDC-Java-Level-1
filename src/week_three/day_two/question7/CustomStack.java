package src.week_three.day_two.question7;

import src.week_two.day_five.CustomLinkedList;

public class CustomStack<T> {
    private final int LIMIT;
    private int noOfItems = 0;
    CustomLinkedList<T> list = new CustomLinkedList<>();
    public CustomStack() {
        LIMIT = Integer.MAX_VALUE;
    }

    public CustomStack(int limit) {
        LIMIT = limit;
    }

    public void push(T item) {
        if (noOfItems < LIMIT) {
            list.insertion(item);
            noOfItems++;
        }else {
            throw new StackOverflowExecption("Stack Limit Exceeded");
        }
    }

    public T peek() {
        if (noOfItems <= 0) {
            throw new StackUnderflowExecption("Stack is empty");
        }
        return list.getLastItem();
    }

    public int size() {
        return noOfItems;
    }

    public T pop() {
        if (noOfItems <= 0) {
            throw new StackUnderflowExecption("Stack is empty");
        }
        T value = list.getLastItem();
        list.deletion(value);
        noOfItems--;
        return value;
    }

    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>(10);

    }
}
