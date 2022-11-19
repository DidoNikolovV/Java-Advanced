import java.util.ArrayDeque;

public class Box<T> {
    private ArrayDeque<T> elements = new ArrayDeque<>();

    public Box(T element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {
        return elements.peek().getClass().getName() + ": " + elements.peek();
    }
}
