import org.w3c.dom.Node;

public class MyStack {

    private static class Node {
        private int element;
        private Node prev;
        public Node(int element, Node prev) {
            this.element = element;
            this.prev = prev;
        }
    }

    private Node top;
    private int size;

    public MyStack() {

    }

    public void push(int element) {
        this.top = new Node(element, this.top);
        this.size++;
    }
}
