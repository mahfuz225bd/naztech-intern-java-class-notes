public class ThrowsExceptionExample {
    public static void main(String[] args) {
        try {
            UsingThrows t = new UsingThrows();
            t.myMethod();
        } catch (CustomException e) {
            System.out.println("Exception handled and the error massage is: " + e.getMessage());
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class UsingThrows {
    public void myMethod() throws CustomException {
        throw new CustomException("This is my Exception");
    }
}