package src.week_two.day_four.question5;

import java.util.*;

public class MergeSort<T> {

    public void merge(T[] array, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (((Comparable<T>) left[i]).compareTo(right[j]) <= 0) {
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

    public void merge(T[] array, T[] left, T[] right, Comparator<T> comparator) {
        int i = 0, j = 0, k = 0;
        System.out.println("We are here");
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


    public void mergeSort(T[] array) {
        if (array.length < 2) {
            return;
        }
        int midIndex = array.length / 2;
        T[] left = (T[]) new Object[midIndex];
        T[] right = (T[]) new Object[array.length - midIndex];
        System.arraycopy(array, 0, left, 0, midIndex);
        System.arraycopy(array, midIndex, right, 0, array.length - midIndex);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
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

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right, comparator);
    }

    public List<T> sort(Collection<T> collection) {
        List<T> list = new ArrayList<>(collection);
        T[] array = (T[]) new Object[list.size()];
        array = list.toArray(array);
        mergeSort(array);
        return Arrays.asList(array);
    }

    public List<T> sort(Collection<T> collection, Comparator<T> comparator) {
        List<T> list = new ArrayList<>(collection);
        T[] array = (T[]) new Object[list.size()];
        array = list.toArray(array);
        mergeSort(array, comparator);
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        Integer[] arr1 = {4, 3, 1, 6, 3, 8, 1, 7, 3, 7,55};
        Collection<Integer> integers = Arrays.asList(arr1);
        MergeSort<Integer> integerMergeSort = new MergeSort<>();
        System.out.println(integerMergeSort.sort(integers, (i1, i2) -> i2 - i1));
    }
}
