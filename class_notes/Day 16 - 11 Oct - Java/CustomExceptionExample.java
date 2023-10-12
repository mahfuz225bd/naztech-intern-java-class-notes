public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is my exception");
        } catch (CustomException e) {
            System.out.println("Caught my custom exception: " + e.getMessage());
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}