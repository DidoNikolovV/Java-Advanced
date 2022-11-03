import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emails = new LinkedHashMap<>();

        while(true) {
            String name = scanner.nextLine();
            if(name.equals("stop")) {
                break;
            }

            String email = scanner.nextLine();

            String domain = email.substring(email.lastIndexOf('.')+1);

            if(!domain.equals("us") && !domain.equals("uk") && !domain.equals("com")) {
                emails.put(name, email);
            }
        }

        for(var entry : emails.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
