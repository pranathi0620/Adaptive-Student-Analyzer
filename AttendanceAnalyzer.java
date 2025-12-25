public class AttendanceAnalyzer {

    public static String getAttendanceImpact(int attendance) {
        if (attendance >= 90)
            return "Positive";
        else if (attendance >= 75)
            return "Average";
        else
            return "Needs Improvement";
    }
}
