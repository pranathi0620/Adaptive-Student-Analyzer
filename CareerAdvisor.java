public class CareerAdvisor {

    public static int calculateScore(Student s, double prevAvg) {
        int score = 0;

        String trend = PerformanceAnalyzer.getPerformanceTrend(prevAvg, s.getAverageMarks());
        if (trend.equals("Improving")) score += 30;
        else if (trend.equals("Stable")) score += 20;
        else score += 10;

        String att = AttendanceAnalyzer.getAttendanceImpact(s.attendance);
        if (att.equals("Positive")) score += 30;
        else if (att.equals("Average")) score += 20;
        else score += 10;

        if (s.studyHours >= 5) score += 40;
        else if (s.studyHours >= 3) score += 30;
        else score += 20;

        if (score > 100) score = 100;
        return score;
    }

    public static String getStatus(int score) {
        if (score >= 75) return "Internship Ready";
        else if (score >= 50) return "Needs Improvement";
        else return "Focus on Basics";
    }
}
