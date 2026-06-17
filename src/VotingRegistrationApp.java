//Siddhartha Kohar - 116234
import java.util.Scanner;
public class VotingRegistrationApp {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the age:");
        int age = input.nextInt();

        try {
            checkEligibility(age);
            System.out.println("The person can vote");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static void checkEligibility(int age) {
        if (age < 18) {
            throw new InvalidAgeException();
        }
    }
}