import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

//        Map<String, Integer> people = new TreeMap<>();
        List<Person> people = new ArrayList<>();

        int ageRestriction = 30;

        while(n-- > 0) {
            String[] inputParts = scanner.nextLine().split(" ");
            String name = inputParts[0];
            int age = Integer.parseInt(inputParts[1]);

            Person person = new Person(name, age);
            people.add(person);
        }

        people = people.stream().filter(p -> p.getAge() > ageRestriction).sorted((a, b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
        for(var p: people) {
            System.out.println(p.getName() + " - " + p.getAge());
        }


    }
}