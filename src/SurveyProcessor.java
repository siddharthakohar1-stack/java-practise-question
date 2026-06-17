//Siddhartha Kohar - 116234
import java.util.Random;
class SurveyProcessor {

    public void calculateAndPrintFrequency(int[] responses) {
        // Ratings are 1 to 5. An array of size 6 gives us indices 0 through 5.
        // Index 0 will be ignored, allowing us to map rating '1' to index 1, '2' to index 2, etc.
        int[] frequency = new int[6];

        // Direct Mapping Loop: Increment the counter at the index corresponding to the rating value
        for (int rating : responses) {
            if (rating >= 1 && rating <= 5) {
                frequency[rating]++;
            } else {
                System.out.println("Warning: Invalid out-of-bounds rating skipped: " + rating);
            }
        }

        // Displaying the results
        System.out.println("Rating  |  Total Votes  |  Distribution");
        System.out.println("----------------------------------------");
        for (int i = 1; i <= 5; i++) {
            // Creative visual bar representation using a simple nested string generator
            String visualBar = "*".repeat(frequency[i]);
            System.out.printf("   %d    |      %2d       |  %s\n", i, frequency[i], visualBar);
        }
    }
}