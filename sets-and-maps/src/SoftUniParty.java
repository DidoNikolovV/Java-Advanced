import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();

        String input = scanner.nextLine();

        while(!input.equals("PARTY")) {
            guests.add(input);

            input = scanner.nextLine();
        }

        while(!input.equals("END")) {
            if(guests.contains(input)) {
                guests.remove(input);
            }

            input = scanner.nextLine();
        }


        System.out.println(guests.size());

        guests.forEach(g -> {
            System.out.println(g);
        });

    }
}
