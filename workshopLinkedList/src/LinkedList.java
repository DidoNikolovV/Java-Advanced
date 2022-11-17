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

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

}
