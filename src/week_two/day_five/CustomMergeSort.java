package src.week_two.day_five;

import java.util.*;

public class CustomMergeSort<T> {

    public void merge(CustomLinkedList<T> list, CustomLinkedList<T> left, CustomLinkedList<T> right, Comparator<T> comparator) {
        CustomLinkedList.Node<T> leftCurrent = left.head;
        CustomLinkedList.Node<T> rightCurrent = right.head;

        if (comparator.compare(leftCurrent.value, rightCurrent.value) <= 0) {
            list.head = leftCurrent;
            leftCurrent = leftCurrent.next;
        } else {
            list.head = rightCurrent;
            rightCurrent = rightCurrent.next;
        }

        CustomLinkedList.Node<T> listCurrent = list.head;

        while (leftCurrent != null && rightCurrent != null) {
            if (comparator.compare(leftCurrent.value, rightCurrent.value) <= 0) {
                listCurrent.next = leftCurrent;
                listCurrent = listCurrent.next;
                leftCurrent = leftCurrent.next;
            } else {
                listCurrent.next = rightCurrent;
                listCurrent = listCurrent.next;
                rightCurrent = rightCurrent.next;
            }
        }

        if (leftCurrent != null) {
            listCurrent.next = leftCurrent;
        }
        if (rightCurrent != null) {
            listCurrent.next = rightCurrent;
        }
    }

    public void mergeSort(CustomLinkedList<T> list, Comparator<T> comparator) {
        if (list.getSize() < 2) {
            return;
        }
        CustomLinkedList<T> left = new CustomLinkedList<>();
        CustomLinkedList<T> right = new CustomLinkedList<>();
        int midIndex = list.getSize() / 2;

        CustomLinkedList.Node<T> current = list.head;
        int currentIndex = 0;

        while (currentIndex < midIndex) {
            left.insertion(current.value);
            current = current.next;
            currentIndex++;
        }

        while (current != null) {
            right.insertion(current.value);
            current = current.next;
        }

        mergeSort(left, comparator);
        mergeSort(right, comparator);

        merge(list, left, right, comparator);
    }

    public void sort(CustomLinkedList<T> list, Comparator<T> comparator) {
        mergeSort(list, comparator);
    }
}
