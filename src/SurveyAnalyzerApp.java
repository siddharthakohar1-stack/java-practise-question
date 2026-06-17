//Siddhartha Kohar - 116234
import java.util.Random;
public class SurveyAnalyzerApp {
    public static void main(String[] args) {
        // Generating 50 mock survey responses
        int[] mockResponses = new int[50];
        Random random = new Random();

        // Fill array with random satisfaction ratings from 1 to 5
        for (int i = 0; i < mockResponses.length; i++) {
            mockResponses[i] = random.nextInt(5) + 1; // Generates 1, 2, 3, 4, or 5
        }

        System.out.println("Analyzing 50 Customer Satisfaction Responses...\n");

        SurveyProcessor processor = new SurveyProcessor();
        processor.calculateAndPrintFrequency(mockResponses);
    }
}