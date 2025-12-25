public class Student {
    String name;
    int semester;
    double[] marks;
    int attendance;
    double studyHours;

    public Student(String name, int semester, double[] marks, int attendance, double studyHours) {
        this.name = name;
        this.semester = semester;
        this.marks = marks;
        this.attendance = attendance;
        this.studyHours = studyHours;
    }

    public double getAverageMarks() {
        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.length;
    }
}

