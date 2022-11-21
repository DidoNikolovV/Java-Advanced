import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }


    public void add(T element) {
        this.values.add(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        T firstValue = values.get(firstIndex);
        T secondValue = values.get(secondIndex);
        values.set(firstIndex, secondValue);
        values.set(secondIndex, firstValue);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T value : values) {
            stringBuilder.append(String.format("%s: %s%n", value.getClass().getName(), value.toString()));
        }

        return stringBuilder.toString();
    }
}
