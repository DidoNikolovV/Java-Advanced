import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new TreeMap<>();

        for(int i = 0; i < studentsCount; i++) {
            String[] studentAndGrade = scanner.nextLine().split(" ");
            String name = studentAndGrade[0];
            double grade = Double.parseDouble(studentAndGrade[1]);

            if(students.get(name) == null) {
                List<Double> grades = new ArrayList<>();
                students.put(name, grades);
            }

            List<Double> newGrades = students.get(name);
            newGrades.add(grade);
            students.put(name, newGrades);
        }

        for(var entry: students.entrySet()) {
            double avrg = 0;
            System.out.print(entry.getKey() + " -> ");
            for(double grade: entry.getValue()) {
                avrg += grade;
                System.out.printf("%.2f ", grade);
            }
            System.out.printf("(avg: %.2f)", avrg / entry.getValue().size());
            System.out.println();
        }
    }
}
