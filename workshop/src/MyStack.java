import org.w3c.dom.Node;

import java.util.function.Consumer;

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

    public int pop() {
        ensureNotEmpty();
        int element = this.top.element;

        this.top = this.top.prev;
        this.size--;

        return element;
    }

    public int peek() {
        ensureNotEmpty();
        return this.top.element;
    }

    public void forEach(Consumer<Integer> consumer) {
        Node current = this.top;
        while(current != null) {
            consumer.accept(current.element);
            current = current.prev;
        }
    }

    private void ensureNotEmpty() {
        if(this.top == null) {
            throw new IllegalStateException("Cannot execute on empty stack.");
        }
    }
}
