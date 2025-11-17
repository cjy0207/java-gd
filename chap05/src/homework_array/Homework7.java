package homework_array;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {

        String[] report = {"Introduction", "Research", "Conclusion"};

        String[] copy = Arrays.copyOf(report, report.length);

        copy[0] = "Team Feedback";
        
        System.out.println("원본 보고서: " + String.join(", ", report));
        System.out.println("복사된 보고서: " + String.join(", ", copy));
    }
}