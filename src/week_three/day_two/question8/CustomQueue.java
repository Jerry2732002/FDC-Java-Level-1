package src.week_three.day_two.question8;

import src.week_two.day_five.CustomLinkedList;

public class CustomQueue<T> {
    private final int LIMIT;
    private int noOfItems = 0;
    CustomLinkedList<T> list = new CustomLinkedList<>();

    public CustomQueue() {
        LIMIT = Integer.MAX_VALUE;
    }

    public CustomQueue(int limit) {
        LIMIT = limit;
    }

    public void enqueue(T item) {
        if (noOfItems < LIMIT) {
            list.insertion(item);
            noOfItems++;
        } else {
            throw new QueueLimitExceededExecption("Queue Limit Exceeded");
        }
    }

    public T peek() {
        if (noOfItems <= 0) {
            throw new QueueLimitExceededExecption("Queue is empty");
        }
        return list.getFirstItem();
    }

    public T dequeue() {
        if (noOfItems <= 0) {
            throw new QueueLimitExceededExecption("Queue is empty");
        }
        T value = list.getFirstItem();
        list.deleteFromBeginning();
        noOfItems--;
        return value;
    }
    public int size() {
        return noOfItems;
    }
}