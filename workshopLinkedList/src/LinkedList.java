import java.util.function.Consumer;

public class LinkedList {
    private Node head;
    private int size;

    public void addFirst(int number) {
        Node newNode = new Node(number);
        if(!isEmpty()) {
            newNode.next = this.head;
        }
        this.head = newNode;
        this.size++;
    }

    public void addLast(int number) {
        Node newNode = new Node(number);
        if(isEmpty()) {
           addFirst(number);
           return;
        }

        Node currentNode = this.head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;


        this.size++;
    }

    public int removeFirst() {
        if(isEmpty()) {
            throw new IllegalStateException("Can't remove an element from an empty list");
        }
        int result = head.value;
        this.head = head.next;
        this.size--;
        return result;
    }

    public int removeLast() {
        if(this.size < 2) {
            return removeFirst();
        }

        Node currentNode = this.head;
        while(currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        int result = currentNode.next.value;
        currentNode.next = null;
        this.size--;

        return result;

    }

    public int get(int index) {
        checkIndex(index);
        Node currentNode = this.head;
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.next;
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

    public int[] toArray() {
        int[] arr = new int[size];
        int counter = 0;
        Node currentNode = this.head;
        while(currentNode != null) {
            arr[counter] = currentNode.value;
            counter++;
            currentNode = currentNode.next;
        }

        return arr;
    }

    private void checkIndex(int index) {
        if(index < 0 && index >= this.size) {
            throw new IndexOutOfBoundsException("No such index in the Linked List");
        }
    }

}