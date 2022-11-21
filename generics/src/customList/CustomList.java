package customList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomList<T extends Comparable<T>> {
    private List<T> values;

    public CustomList() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);
    }

    public T remove(int index) {
        if(index < 0 || index >= values.size()) {
            throw new IndexOutOfBoundsException("Invalid inddex " + index);
        }
        return this.values.remove(index);
    }

    public boolean contains(T element) {
        for (T value : values) {
            if(value.compareTo(element) == 0) {
                return true;
            };
        }

        return false;
    }

    public void swap(int index1, int index2) {
        T temp = values.get(index1);
        values.set(index1, values.get(index2));
        values.set(index2, temp);
    }

    public long countGreaterTime(T element) {
        return values.stream().filter(v -> v.compareTo(element) > 0).count();
    }

    public T min() {
        return (T) values.stream().min(Comparator.naturalOrder()).get();

    }

    public T max() {
        return (T) values.stream().max(Comparator.naturalOrder()).get();

    }

    public int size() {
        return values.size();
    }

    public T get(int index) {
        return values.get(index);
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T value : values) {
            stringBuilder.append(String.format("%s%n", value.toString()));
        }

        return stringBuilder.toString().trim();
    }
}
