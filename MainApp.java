import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter semester: ");
        int sem = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double[] marks = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
        }

        System.out.print("Enter attendance percentage: ");
        int attendance = sc.nextInt();

        System.out.print("Enter daily study hours: ");
        double studyHours = sc.nextDouble();

        System.out.print("Enter previous semester average: ");
        double prevAvg = sc.nextDouble();

        Student s = new Student(name, sem, marks, attendance, studyHours);

        System.out.println("\n--- Student Analysis Report ---");
        System.out.println("Name: " + s.name);
        System.out.println("Average Marks: " + s.getAverageMarks());
        System.out.println("Performance Trend: " +
                PerformanceAnalyzer.getPerformanceTrend(prevAvg, s.getAverageMarks()));
        System.out.println("Weak Subject Index: " +
                (PerformanceAnalyzer.getWeakSubjectIndex(marks) + 1));
        System.out.println("Attendance Impact: " +
                AttendanceAnalyzer.getAttendanceImpact(attendance));

        int score = CareerAdvisor.calculateScore(s, prevAvg);
        System.out.println("Career Readiness Score: " + score);
        System.out.println("Status: " + CareerAdvisor.getStatus(score));
    }
}

