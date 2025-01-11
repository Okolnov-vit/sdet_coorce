package Classes;

public class WrongLoginException extends Exception {
  public WrongLoginException() {
    super("Wrong login format or length.");
  }

  public WrongLoginException(String message) {
    super(message);
  }
}