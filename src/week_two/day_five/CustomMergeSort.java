package src.week_two.day_five;

import java.util.*;
public class CustomMergeSort<T> {
    public void merge(T[] array, T[] left, T[] right, Comparator<T> comparator) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (comparator.compare(left[i], right[j]) <= 0) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public void mergeSort(T[] array, Comparator<T> comparator) {
        if (array.length < 2) {
            return;
        }
        int midIndex = array.length / 2;
        T[] left = (T[]) new Object[midIndex];
        T[] right = (T[]) new Object[array.length - midIndex];
        System.arraycopy(array, 0, left, 0, midIndex);
        System.arraycopy(array, midIndex, right, 0, array.length - midIndex);

        mergeSort(left, comparator);
        mergeSort(right, comparator);

        merge(array, left, right, comparator);
    }

    public List<T> sort(T[] array, Comparator<T> comparator) {
        mergeSort(array, comparator);
        return Arrays.asList(array);
    }
}
