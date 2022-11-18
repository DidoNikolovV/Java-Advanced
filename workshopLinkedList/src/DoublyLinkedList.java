import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int number) {
        Node newNode = new Node(number);
        if(!isEmpty()) {
            newNode.next = this.head;
            this.head.prev = newNode;
        } else {
            this.tail = newNode;
            newNode.prev = null;
        }
        this.head = newNode;
        this.size++;
    }

    public void addLast(int number) {
        if(isEmpty()) {
            addFirst(number);
            return;
        }
        Node newNode = new Node(number);
        this.tail.next = newNode;
        newNode.prev = this.tail;
        this.tail = newNode;
        this.size++;
    }

    public int removeFirst() {
        if(isEmpty()) {
            throw new IllegalStateException("Can't remove an element from an empty list");
        }
        int result = head.value;
        this.head = head.next;
        this.size--;
        if(isEmpty()) {
            this.head = null;
            this.tail = null;
        } else {
            this.head.prev = null;
        }
        return result;
    }

    public int removeLast() {
        if(this.size < 2) {
            return removeFirst();
        }

        int result = this.tail.value;
        this.tail = this.tail.prev;
        this.tail.next = null;
        this.size--;
        return result;

    }

    public int get(int index) {
        checkIndex(index);
        Node currentNode = null;
        if(index <= size /2) {
            currentNode = this.head;
            for(int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.value;
        } else {
            currentNode = this.tail;
            for(int i = this.size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }
        return currentNode.value;


    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void forEach(Consumer<Integer> consumer) {
        Node currentNode = this.head;
        while(currentNode != null) {
            consumer.accept(currentNode.value);
            currentNode = currentNode.next;
        }

    }

//    public int[] toArray() {
//        int[] arr = new int[size];
//        int counter = 0;
//        Node currentNode = this.head;
//        while(currentNode != null) {
//            arr[counter] = currentNode.value;
//            counter++;
//            currentNode = currentNode.next;
//        }
//
//        return arr;
//    }

    public int[] toArray() {
        List<Integer> result = new ArrayList<>();
        forEach(result::add);
        return result.stream().mapToInt(e -> e).toArray();
    }

    private void checkIndex(int index) {
        if(index < 0 && index >= this.size) {
            throw new IndexOutOfBoundsException("No such index in the Linked List");
        }
    }
}
