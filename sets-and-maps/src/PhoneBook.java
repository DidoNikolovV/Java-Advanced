import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, String> phoneBook = new LinkedHashMap<>();

        while(!command.equals("search")) {
            String[] cmdParts = command.split("-");
            String name = cmdParts[0];
            String phoneNumber = cmdParts[1];


            phoneBook.put(name, phoneNumber);

            command = scanner.nextLine();
        }

        String searchedName = scanner.nextLine();

        while(!searchedName.equals("stop")) {
            if(phoneBook.get(searchedName) == null) {
                System.out.printf("Contact %s does not exist.%n", searchedName);
            } else {
                System.out.printf("%s -> %s%n", searchedName, phoneBook.get(searchedName));
            }


            searchedName = scanner.nextLine();
        }


    }
}
