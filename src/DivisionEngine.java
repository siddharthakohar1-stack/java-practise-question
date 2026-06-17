//Siddhartha Kohar - 116234
import java.util.InputMismatchException;
import java.util.Scanner;
class DivisionEngine {

    public void executeDivision() {
        // Scanner wrapped in try-with-resources ensures stream is closed safely
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter numerator (integer): ");
            int numerator = scanner.nextInt(); // Potential InputMismatchException

            System.out.print("Enter denominator (integer): ");
            int denominator = scanner.nextInt(); // Potential InputMismatchException

            int result = numerator / denominator; // Potential ArithmeticException
            System.out.println("Result: " + numerator + " / " + denominator + " = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Mathematical Error: Cannot divide an integer by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Input Error: You must enter valid, whole integers only.");
        } catch (Exception e) {
            // General safety catch-all for any other unanticipated issues
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
    }
}