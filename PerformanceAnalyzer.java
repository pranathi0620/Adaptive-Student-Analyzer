public class PerformanceAnalyzer {

    public static String getPerformanceTrend(double prevAvg, double currAvg) {
        if (currAvg > prevAvg)
            return "Improving";
        else if (currAvg < prevAvg)
            return "Declining";
        else
            return "Stable";
    }

    public static int getWeakSubjectIndex(double[] marks) {
        int index = 0;
        double min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
                index = i;
            }
        }
        return index;
    }
}
