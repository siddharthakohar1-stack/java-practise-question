//Siddhartha Kohar - 116234
import java.util.ArrayList;
import java.util.Random;

public class GradeFilter {
    public static void main(String[] args) {
        // 1. Initialize the ArrayList and populate it with sample scores
        ArrayList<Integer> scores = new ArrayList<>();
        Random random = new Random();

        // Simulating 100 random exam scores between 0 and 100
        for (int i = 0; i < 100; i++) {
            scores.add(random.nextInt(101));
        }

        // 2. Iterate and evaluate each score using conditional logic
        int distinctionCount = 0;
        int passCount = 0;
        int failCount = 0;

        System.out.println("--- Individual Student Results ---");
        for (int score : scores) {
            if (score >= 90) {
                System.out.println("Score: " + score + " -> Distinction");
                distinctionCount++;
            } else if (score >= 40) {
                System.out.println("Score: " + score + " -> Pass");
                passCount++;
            } else {
                System.out.println("Score: " + score + " -> Fail");
                failCount++;
            }
        }

        // 3. Print summary metrics
        System.out.println("\n--- Performance Summary ---");
        System.out.println("Distinctions: " + distinctionCount);
        System.out.println("Passes:       " + passCount);
        System.out.println("Fails:        " + failCount);
    }
}
