import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> myFunc = Integer::parseInt;
        UnaryOperator<String> un = s -> s + " Bravo";
        Predicate<String> pred = s -> s.equals("Pesho");
        Supplier<String> sup = () -> new String("Gosho");
        Consumer<String> print = System.out::println;

        // Bi -> adds one more argument
        BiConsumer<String, Integer> biConsumer = (text, number) -> System.out.println(text + number);
        BiPredicate<String, Integer> biPredicate = (text, number) -> text.length() > number;
        BiFunction<String, Integer, Integer> biFunction = (text, number) -> text.length() + number;

        ToIntFunction<String> toIntFunction = Integer::parseInt;
        Function<String, Integer> function = Integer::parseInt;

        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
//        numbers.stream().map(function)          Stream<Integer>
//        numbers.stream().mapToInt(toIntFunction)  IntStream -> Primitive Streams (IntStream, DoubleStream)
    }

    // Function<приема, връща>
    // UnaryOperator<приема/връща>
    // Predicate<приема> връща boolean
    // Supplier<връща>
    // Consumer<приема> не връща нищо


}