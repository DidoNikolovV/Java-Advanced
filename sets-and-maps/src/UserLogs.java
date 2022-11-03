import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, LinkedHashMap<String, List<String>>> logData = new TreeMap<>();

        while(!input.equals("end")) {
            String[] inputParts = input.split(" ");
            String IPPart = inputParts[0];
            String messagePart = inputParts[1];
            String userPart = inputParts[2];

            String username = userPart.split("=")[1];
            String IPAddress = IPPart.split("=")[1];
            String message = messagePart.split("=")[1];
            if(!logData.containsKey(username)) {
                logData.put(username, new LinkedHashMap<>(){{put(IPAddress, new LinkedList<>() {{add(message);}});}});
            } else {
                if(!logData.get(username).containsKey(IPAddress)) {
                    logData.get(username).put(IPAddress, new ArrayList<>() {{add(message);}});
                } else {
                    logData.get(username).get(IPAddress).add(message);
                }
            }
            input = scanner.nextLine();
        }
        List<Map<String, Integer>> ipData = new LinkedList<>();
        for(var username: logData.entrySet()) {
            int counter = 0;
            System.out.println(username.getKey() + ":");
            LinkedHashMap<String, List<String>> userData = username.getValue();
            for(var IP : userData.entrySet()) {
                counter++;
                if(counter < userData.size()) {
                    System.out.printf("%s => %d, ", IP.getKey(), IP.getValue().size());
                } else {
                    System.out.printf("%s => %d. ", IP.getKey(), IP.getValue().size());
                }
            }

            System.out.println();
        }
    }
}
