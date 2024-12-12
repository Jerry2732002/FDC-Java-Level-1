package src.week_two.day_five;

import java.util.Comparator;
import java.util.List;

public class CustomLinkedList<T> {

    static class Node<T> {
        public T value;
        public Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    Node<T> head = null;
    Node<T> tail = null;

     CustomLinkedList<T> cloneList() {
        CustomLinkedList<T> copy = new CustomLinkedList<>();
        Node<T> current = this.head;

        while (current != null) {
            copy.insertion(current.value);
            current = current.next;
        }
        return copy;
    }

    public void insertion(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertion(T value, int index) {
        Node<T> newNode = new Node<>(value);
        if (index < 0) {
            throw new IndexOutOfBoundsException("Invalid index :" + index);
        }
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node<T> current = head;
                int currentIndex = 0;
                while (current.next != null && currentIndex < index - 1) {
                    current = current.next;
                    currentIndex++;
                    if (currentIndex < index - 1 && current.next == null) {
                        throw new IndexOutOfBoundsException("Invalid index :" + index);
                    }
                }
                newNode.next = current.next;
                current.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
            }
        }
    }

    public void insertion(CustomLinkedList<T> list) {
        CustomLinkedList<T> copy = list.cloneList();
        if (head == null) {
            head = copy.head;
            tail = copy.tail;
        } else {
            tail.next = copy.head;
            tail = copy.tail;
        }
    }

    public void insertion(CustomLinkedList<T> list, int index) {
        CustomLinkedList<T> copy = list.cloneList();
        if (index < 0) {
            throw new IndexOutOfBoundsException("Invalid index :" + index);
        }
        if (head == null) {
            head = copy.head;
            tail = copy.tail;
        } else {
            if (index == 0) {
                Node<T> copyCurrent = copy.head;
                while (copyCurrent.next != null) {
                    copyCurrent = copyCurrent.next;
                }
                copyCurrent.next = head;
                head = copy.head;
            } else {
                Node<T> current = head;
                int currentIndex = 0;
                while (current.next != null && currentIndex < index - 1) {
                    current = current.next;
                    currentIndex++;
                    if (currentIndex < index && current.next == null) {
                        throw new IndexOutOfBoundsException("Invalid index :" + index);
                    }
                }
                Node<T> copyCurrent = copy.head;
                current.next = copy.head;
                while (copyCurrent.next != null) {
                    copyCurrent = copyCurrent.next;
                }
                copyCurrent.next = current.next;
                if (copyCurrent.next == null) {
                    tail = copyCurrent;
                }
            }
        }
    }

    public void deleteFromBeginning() {
         head = head.next;
    }

    public T deletion(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Invalid index:" + index);
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("Empty List");
        }
        if (index == 0) {
            Node<T> current = head;
            head = current.next;
            if (head == null) {
                tail = null;
            }
            return current.value;
        } else {
            Node<T> current = head;
            int currentIndex = 0;
            while (current.next != null && currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
                if (currentIndex < index && current.next == null) {
                    throw new IndexOutOfBoundsException("Invalid index :" + index);
                }
            }
            Node<T> temp = current.next;
            current.next = temp.next;
            if (current.next == null) {
                tail = current;
            }
            return temp.value;
        }
    }

    public void deletion(int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex < 0 || endIndex < startIndex) {
            throw new IndexOutOfBoundsException("Invalid indices, start:" + startIndex + " end :" + endIndex);
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("Empty List");
        }
        Node<T> start = null;
        if (startIndex == 0) {
            Node<T> current = head;
            int currentIndex = 0;
            while (current.next != null && currentIndex < endIndex - 1) {
                current = current.next;
                currentIndex++;
                if (currentIndex < endIndex && current.next == null) {
                    throw new IndexOutOfBoundsException("Invalid index :" + endIndex);
                }
            }
            head = current.next;
        } else {
            Node<T> current = head;
            int currentIndex = 0;
            while (current.next != null && currentIndex < endIndex - 1) {
                if (currentIndex == startIndex - 1) {
                    start = current;
                }
                current = current.next;
                currentIndex++;
                if (currentIndex < endIndex && current.next == null) {
                    throw new IndexOutOfBoundsException("Invalid index :" + endIndex);
                }
            }
            start.next = current.next;
        }
    }

    public void deletion(T item) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Empty List");
        }
        while (head.value.equals(item) && head.next != null) {
            head = head.next;
        }
        if (head.value.equals(item)) {
            head = null;
            tail = null;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.value.equals(item)) {
                current.next = current.next.next;
                if (current.next == null) {
                    tail = current;
                }
            } else {
                current = current.next;
            }
        }
    }

    public void deletion(CustomLinkedList<T> list) {
        if (list.head == null) {
            return;
        }
        Node<T> current = list.head;
        while (current.next != null) {
            this.deletion(current.value);
            current = current.next;
        }
        this.deletion(current.value);
    }

    public T get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Invalid index:" + index);
        }
        if (index == 0) {
            return head.value;
        }
        int currentIndex = 0;
        Node<T> current = head;
        while (currentIndex <= index && current.next != null) {
            currentIndex++;
            if (currentIndex == index) {
                return current.next.value;
            }
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Invalid index:" + index);
    }

    public void clear() {
        this.head = null;
        this.tail = null;
    }

    public boolean contains(T item) {
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean containsAll(T... items) {
        if (items.length == 0) {
            throw new IllegalArgumentException("Pass at least 1 parameter");
        }
        boolean result = true;
        for (T item : items) {
            if (!this.contains(item)) {
                result = false;
            }
        }
        return result;
    }

    public boolean containsAny(T... items) {
        if (items.length == 0) {
            throw new IllegalArgumentException("Pass at least 1 parameter");
        }
        for (T item : items) {
            if (this.contains(item)) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void sort(Comparator<T> comparator) {
         if (head == null) {
             return;
         }
        CustomMergeSort<T> sorter = new CustomMergeSort<>();
        sorter.sort(this, comparator);
    }

    public T getLastItem() {
         return tail.value;
    }

    public T getFirstItem() {
        return head.value;
    }

    public void printValues() {
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node<T> current = head;
            while (current.next != null) {
                System.out.print(current.value + " -> ");
                current = current.next;
            }
            System.out.print(current.value);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CustomLinkedList<Integer> list1 = new CustomLinkedList<>();
        list1.insertion(6);
        list1.insertion(2);
        list1.insertion(1);
        list1.insertion(9);
        list1.insertion(-2);
        list1.insertion(45);
        list1.insertion(-45);
        list1.insertion(-145);


        list1.sort(Comparator.naturalOrder());
        list1.printValues();
    }
}
