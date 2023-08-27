package com.fullstack;

public class ScoreUtils {

    public static double calculateOvers(int balls) {
        int overPrefix = balls / 6;
        int overSuffix = balls % 6;
        return Double.parseDouble(""+ overPrefix + "." + overSuffix);
    }

    public static double calculateRunRate(int runs, double overs) {
        int overPrefix = (int) overs;
        double overSuffix = ((overs - overPrefix) * 10) / 6;
        return runs / (overSuffix + overPrefix);
    }
}
