import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> urls = new ArrayDeque<>();

        String nextNavigation = scanner.nextLine();
        String previousUrl = "";
        while(!nextNavigation.equals("Home")) {
            if(nextNavigation.equals("back")) {
                String currentUrl = urls.pop();
                if(!urls.isEmpty()) {
                    previousUrl = urls.pop();
                    System.out.println(previousUrl);
                    urls.push(previousUrl);
                } else {
                    System.out.println("no previous URLs");
                    urls.push(currentUrl);
                    nextNavigation = scanner.nextLine();
                    continue;
                }

            } else {
                System.out.println(nextNavigation);
                urls.push(nextNavigation);
            }

            nextNavigation = scanner.nextLine();
        }

    }
}
