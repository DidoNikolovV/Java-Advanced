import java.util.List;

public class ListUtils {

    @SuppressWarnings("unchecked")
    public static <T extends Comparable> T getMin(List<T> list) {
        return list.stream().
                min(T::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Empty collection"));

    }

    @SuppressWarnings("unchecked")
    public static <T extends Comparable> T getMax(List<T> list) {
        return list.stream().
                max(T::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Empty collection"));

    }
}
