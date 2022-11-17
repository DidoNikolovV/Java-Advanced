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

    public int removeFirst() {
        if(isEmpty()) {
            throw new IllegalStateException("Can't remove an element from an empty list");
        }
        int result = head.value;
        this.head = head.next;
        this.size--;
        return result;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

}
