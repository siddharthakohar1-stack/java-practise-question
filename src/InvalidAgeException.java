//Siddhartha Kohar - 116234
public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        super("The age must be over 18 to vote");
    }
}